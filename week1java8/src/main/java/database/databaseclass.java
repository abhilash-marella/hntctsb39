package database;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class databaseclass {
	Item item1= new Item(134, "Moto24", 15000, "Mobiles");
	Item item2= new Item(157, "Spiderman", 50, "Books");
	Item item3= new Item(204, "Acer", 70000, "Laptops");
	Item item4= new Item(210, "iPhone", 45000, "Mobiles");
	Item item5= new Item(215, "Shirt", 1500, "Shirts");
	
	Customer cust1= new Customer(1, "Tom", "male", "Bangalore");
	Customer cust2= new Customer(2, "Mike", "male", "Delhi");
	Customer cust3= new Customer(3, "Miley", "female", "Pune");
	Customer cust4= new Customer(4, "Kunal", "male", "Delhi");
	Customer cust5= new Customer(5, "Sakshi", "female", "Delhi");

	Order order1= new Order(1, "delivered", LocalDate.of(2021,11,12), LocalDate.of(2021,11,14), Arrays.asList(item1,item4), cust1);
	Order order2= new Order(2, "delivered", LocalDate.of(2022,5,19), LocalDate.of(2022,5,24), Arrays.asList(item3), cust4);
	Order order3= new Order(3, "delivered",LocalDate.of(2021,7,31), LocalDate.of(2021,8,4),Arrays.asList(item5,item4),cust2);
	Order order4= new Order(4, "pending", LocalDate.of(2022,10,29),null, Arrays.asList(item1,item2,item3,item5),cust3);
	Order order5= new Order(5, "pending", LocalDate.of(2021,10,30),null,Arrays.asList(item1), cust5);

	public List<Customer> getAllCustomer()
	
	{
		return  Arrays.asList(cust1,cust2,cust3,cust4,cust5);
		
	}
	public List<Order> getAllOrders()
	{
		return Arrays.asList(order1,order2,order3,order4,order5);
	}
	public List<Item> getAllItem()
	{
		return Arrays.asList(item1,item2,item3,item4,item5);
	}
}
