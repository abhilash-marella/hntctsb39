package week1java8;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import database.Customer;
import database.Item;
import database.Order;
import database.databaseclass;

public class Week1java8 {
	static databaseclass ds =new databaseclass();
	static List<Item> items  =ds.getAllItem();
	static List<Order> orders = ds.getAllOrders();
	public void getMobiles() {

    List <Item> moblies= items.stream().filter(item->item.getCategory().equalsIgnoreCase("Mobiles")).collect(Collectors.toList());
    moblies.forEach(mo->System.out.println(mo));	
	}

	public void getMobiles(Double price) {

	    List <Item> moblies= items.stream().filter(item->item.getCategory().equalsIgnoreCase("Mobiles")&&item.getPrice()>price ).collect(Collectors.toList());
	    System.out.println( "mobles price greater than 20000");
	    moblies.forEach(mo->System.out.println(mo));	
		}
	
	public void getOrdersNotMobiles() {

		System.out.println("non mobile orders  :");
	    List <Item> nonMoblies=orders.stream().map(Order::getItems).flatMap(List::stream).filter(ite->!ite.getCategory().equalsIgnoreCase("mobiles")).collect(Collectors.toList());	
	nonMoblies.forEach(nonm->System.out.println(nonm));	
	}
	
	public void getLaptopsAndApplyDiscount() {
		System.out.println( "laptops" );
	    List <Item> Laptops= items.stream().filter(item->item.getCategory().equalsIgnoreCase("Laptops")).collect(Collectors.toList());
	    Laptops.forEach(lap->{long price=  (long) ((float)5/100*lap.getPrice());
	    
	 
	    lap.setPrice(lap.getPrice()-price); System.out.println(lap);});	
		}
	
	public void getfemaleCust() {
		System.out.println("female customers");
	    List<Customer> femaleCust=orders.stream().map(Order::getCustomer).filter(s->s.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList());	
	    femaleCust.forEach(femalecust->System.out.println(femalecust));
	   	}
	public void getPeriodCustomers() {
		System.out.println("period customers");
	    List<Customer> periodCustomer=orders.stream().filter(s->s.getOrderDate().isAfter(LocalDate.of(2022, 1, 1)) && s.getOrderDate().isBefore(LocalDate.of(2022, 10, 31))).map(Order::getCustomer).collect(Collectors.toList());
	    periodCustomer.forEach(customer->System.out.println(customer));
	   	}
	public static void main(String[] args) {
		Week1java8 test= new Week1java8();
		 test.getMobiles();
		 test.getMobiles(20000.00);
		 test.getOrdersNotMobiles();
		 test.getLaptopsAndApplyDiscount();
		 test.getfemaleCust();
		 test.getPeriodCustomers();


	}
	


}