package com.app.test;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.app.dao.OrderDao;
import com.app.exceptions.OrderException;
import com.app.models.Order;
import com.app.services.OrderService;

public class OrderServiceTest {
	
	@Mock
	private OrderDao orderDao;
	@InjectMocks
	private OrderService service;

	
	@Test
	public void shouldPlaceOrder() throws OrderException {
		System.out.println(service);
		Order order = new Order();
		boolean isPlaced = service.placeOrder(order);
		System.out.println(isPlaced);
	}

}
