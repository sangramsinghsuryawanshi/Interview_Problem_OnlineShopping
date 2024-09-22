package com.project.OS.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.OS.Model.ShoppingCart;

public interface ShoppingCartConn extends JpaRepository<ShoppingCart, Integer> {

}
