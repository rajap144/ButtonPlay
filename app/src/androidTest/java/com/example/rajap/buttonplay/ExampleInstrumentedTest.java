package com.example.rajap.buttonplay;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest
{
	@Test
	public void useAppContext() throws Exception
	{
		// Context of the app under test.
		Context appContext = InstrumentationRegistry.getTargetContext();

		assertEquals("com.example.rajap.buttonplay", appContext.getPackageName());
	}


	@Test
	public void testSetMismatchError() {
		// Make screenshot before performance
		//Spoon.screenshot(getActivity(), "initial_state");


		// Action
		//onView(withId(R.id.submit)).perform(click());

		// Make screenshot after performance
		//Spoon.screenshot(getActivity(), "after_state");

		// Test
		//onView(withText(R.string.msg_mismatch)).check(matches(isDisplayed()));
	}
}
