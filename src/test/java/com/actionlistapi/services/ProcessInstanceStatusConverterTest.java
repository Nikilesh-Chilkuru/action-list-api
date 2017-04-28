package com.actionlistapi.services;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import com.actionlistapi.pojo.ProcessInstanceStatus;

@RunWith(SpringRunner.class)
public class ProcessInstanceStatusConverterTest {

	ProcessInstanceStatusConverter processInstanceStatusConverter;
	
	ProcessInstanceStatus processInstanceStatus;
	
	String fakeString;
	
	@Before
	public void setUp() {
		processInstanceStatusConverter = new ProcessInstanceStatusConverter();
		processInstanceStatus = new ProcessInstanceStatus("P");
		fakeString = new String("Immutable");
	}
	
	@Test 
	public void processInstanceStatusFieldAfterConvertingShouldHaveStringData() {
		assertThat(processInstanceStatusConverter.convertToDatabaseColumn(processInstanceStatus),instanceOf(String.class));		
	}
	
	@Test
	public void processInstanceCodeLabelIsCorrect() {
		assertEquals(processInstanceStatus.getLabel(),"Preroute");
	}
	
	@Test
	public void stringConvertedToProcessInstanceStatusEntityIsValid() {
		assertThat(processInstanceStatusConverter.convertToEntityAttribute(fakeString),instanceOf(ProcessInstanceStatus.class));		
	}
}
