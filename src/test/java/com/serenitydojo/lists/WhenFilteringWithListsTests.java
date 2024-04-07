package com.serenitydojo.lists;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.testng.annotations.Test;
import com.serenitydojo.model.OrderRecordEntity;

/**
 * This test class covers - Bonus Live Videos : Advanced Java - 'Record Classes'
 * implementation with Lists from 'java-for-testers-and-test-automation' course
 * of 'Serenity Dojo training and mentoring programme'
 * 
 */

public class WhenFilteringWithListsTests {

	@Test
	public void whenSortingByID() {
	List<OrderRecordEntity> orders = List.of(
				new OrderRecordEntity("1", "bread", 1, 0.75, 0.75, Collections.emptyList()),
				new OrderRecordEntity("2", "milk", 2, 1.75, 3.50, Collections.emptyList()),
				new OrderRecordEntity("3", "cheese", 5, 5.00, 25, Collections.emptyList())
				);

	System.out.println(orders);
	System.out.println("**************************************************");
	List<OrderRecordEntity> filterLst=orders.stream()
			             .filter(item -> item.quanity()>1)
			             .collect(Collectors.toList());
	System.out.println("********************FILTERED LIST BY QUANTITY******************************");
	filterLst.forEach(filterData -> System.out.println(filterData));
	System.out.println("\nTC-01 - whenSortingByID() - Executed successfully.");
	}
	

}