package com.app.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.OrderDao;
import com.app.exceptions.OrderException;
import com.app.models.Order;

@Service
public class OrderService {
	
	@Autowired
	private OrderDao dao;

	public boolean placeOrder(Order order) throws OrderException {
		System.out.println("Order: "+order);
		// validation for order
		if(order.getPrice() < 0) {
			throw new OrderException("Order price can not be zero or less");
		}
		
		try {
			order.setId(0);
			System.out.println("Dao: "+dao);
			Order savedOrder = this.dao.saveOrder(order);
			System.out.println("After saveOrder: "+savedOrder);
			if(savedOrder.getId() > 0) {
				return true;
			} else {
				return false;
			}
		} catch(SQLException e) {
			throw new OrderException("Database is not working", e);
		} catch(NullPointerException e) {
			throw new OrderException("Database is returning null", e);
		}
	}
	
	public Order getOrderDetails(int id) throws OrderException {
		Order order = dao.findOrder(id);
		// null, exception, order with id less than 0
		return order;
	}
}
