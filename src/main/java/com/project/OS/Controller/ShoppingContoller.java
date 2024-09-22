package com.project.OS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.OS.Model.AddProduct;
import com.project.OS.Model.ShoppingCart;
import com.project.OS.Repos.AddProductConn;
import com.project.OS.Repos.ShoppingCartConn;

class OutOfStockException extends Exception
{
	public OutOfStockException(String msg) 
	{
		super(msg);
	}
}

@Controller
public class ShoppingContoller 
{
	@Autowired
	private AddProductConn ADC;
	
	@Autowired
	private ShoppingCartConn SCC;
	
	@RequestMapping("/")
	public String isLand()
	{
		return "AddPro.jsp";
	}
	@RequestMapping("/insertProduct")
	public String isAdded(@ModelAttribute AddProduct AD, Model m)
	{
		if(ADC!=null)
		{
			ADC.save(AD);
			m.addAttribute("msg", "Product Added successfully..!");
		}
		else
		{
			m.addAttribute("msg", "Something went wrong try after some time..!");
		}
		return "/";
	}
	@RequestMapping("/SP")
	public String isShow(Model m)
	{
		List<AddProduct> ad = ADC.findAll();
		m.addAttribute("pro", ad);
		return "show.jsp";
	}
	@RequestMapping("/{proudctId}")
	public String isPur(@PathVariable int proudctId,Model m)
	{
		AddProduct ad = ADC.getById(proudctId);
		ShoppingCart sc = new ShoppingCart();
		sc.setSerchaProductName(ad.getProductName());
		sc.setsPrice(ad.getPrice());
		sc.setsStock(ad.getStock());
		
		if(ad.getStock().equals("no"))
		{
			try
			{
				throw new OutOfStockException("OutOfStockException");
			}
			catch(Exception e)
			{
				m.addAttribute("msg", e.getMessage());
				return "/SP";
			}
			
		}
		else
		{
			if(SCC!=null)
			{
				SCC.save(sc);
				m.addAttribute("msg", "Product added to cart..!");
			}
			else
			{
				m.addAttribute("msg", "Product failed to added to cart..!");
			}
			return "/SP";
		}
	}
	@RequestMapping("/CP")
	public String isShowCart(Model m)
	{
		List<ShoppingCart> sc = SCC.findAll();
		m.addAttribute("pro", sc);
		return "cart.jsp";
	}
	@RequestMapping("delte/{sid}")
	public String isShowCart(Model m,@PathVariable int sid)
	{
		SCC.deleteById(sid);
		return "/CP";
	}
}
