package com.example.rajap.buttonplay;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.schibsted.spain.barista.rule.BaristaRule;
import com.squareup.spoon.Spoon;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn;
import static com.schibsted.spain.barista.interaction.BaristaEditTextInteractions.writeTo;
import static com.schibsted.spain.barista.interaction.BaristaKeyboardInteractions.closeKeyboard;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest
{

	@Rule
	public BaristaRule<MainActivity> baristaRule = BaristaRule.create(MainActivity.class);
	MainActivity mActivity = baristaRule.getActivityTestRule().getActivity();
	private TestName name = new TestName();

	@Before
	public void setUp()
	{
		Log.i("Info","[START] - Launch Test: " + name.getMethodName());
		baristaRule.launchActivity();
	}


	//@After
	public void tearDown()
	{
		Log.i("Info", "[FINISH] - Test: " + name.getMethodName());
	}

	@Test
	public void SimpleTest() throws Exception
	{
		Spoon.screenshot(mActivity, "initial_state");

		clickOn(R.id.editText);
		writeTo(R.id.editText,"Hello");
		closeKeyboard();
		clickOn(R.id.button);

		//for(int i=0;i<10;++i)
		{
			clickOn(R.id.button);
			onView(withText("Button Pressed")).check(matches(isDisplayed()));
		}

		Spoon.screenshot(mActivity, "final_state");
	}

	@Test
	public void useAppContext() throws Exception
	{
		// Context of the app under test.
		Context appContext = InstrumentationRegistry.getTargetContext();

		assertEquals("com.example.rajap.buttonplay", appContext.getPackageName());
	}


}
