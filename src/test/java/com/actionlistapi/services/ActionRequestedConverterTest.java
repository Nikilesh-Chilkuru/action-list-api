package com.actionlistapi.services;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import com.actionlistapi.pojo.ActionRequested;

@RunWith(SpringRunner.class)
public class ActionRequestedConverterTest {

	ActionRequestedConverter actionRequestedConverter;

	ActionRequested actionRequested;

	String fakeString;

	@Before
	public void setUp() {
		actionRequestedConverter = new ActionRequestedConverter();
		actionRequested = new ActionRequested("A");
		fakeString = new String("Immutable");
	}

	@Test
	public void actionRequestedFieldAfterConvertingShouldHaveStringData() {
		assertThat(actionRequestedConverter.convertToDatabaseColumn(actionRequested), instanceOf(String.class));
	}

	@Test
	public void actionRequestedCodeLabelIsCorrect() {
		assertEquals(actionRequested.getLabel(), "Approve");
	}

	@Test
	public void stringConvertingToActionRequestedEntityAttributeVerified() {
		assertThat(actionRequestedConverter.convertToEntityAttribute(fakeString), instanceOf(ActionRequested.class));
	}
}
