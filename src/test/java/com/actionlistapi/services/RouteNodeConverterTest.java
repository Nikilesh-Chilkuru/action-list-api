package com.actionlistapi.services;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class RouteNodeConverterTest {
	
	RouteNodeConverter routeNodeConverter;
	ArrayList<String> fakeArrayList;
	String fakeString;
	
	@Before
	public void setUp() {
		routeNodeConverter = new RouteNodeConverter();
		fakeArrayList = new ArrayList<String>();
		fakeArrayList.add("John Doe");
		fakeArrayList.add("Foo Bar");
		fakeString = new String("Immutable");
	}
	
	@Test
	public void arrayListWillBeConvertedToStringBeforeStoring() {
		assertThat(routeNodeConverter.convertToDatabaseColumn(fakeArrayList),instanceOf(String.class));		
	}
	
	@Test
	public void stringWillBeConvertedIntoArrayListBeforeEntityConversion() {
		assertThat(routeNodeConverter.convertToEntityAttribute(fakeString),instanceOf(ArrayList.class));		
	}

}
