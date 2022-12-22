package com.app.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.app.models.Order;

@Component
public class OrderDao {
	
	public Order saveOrder(Order order) throws SQLException {
		System.out.println("In save order");
		return null;
	}

	public Order findOrder(int id) {
		return null;
	}

}
