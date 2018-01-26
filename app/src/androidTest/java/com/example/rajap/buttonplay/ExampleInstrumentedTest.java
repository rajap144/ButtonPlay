package com.example.rajap.buttonplay;

import android.support.test.espresso.intent.Intents;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.schibsted.spain.barista.rule.BaristaRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn;

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

	//@Rule
	//public IntentsTestRule<ActivityTwo> intentsTestRule =
	//		new IntentsTestRule<>(ActivityTwo.class);

	MainActivity mActivity = baristaRule.getActivityTestRule().getActivity();
	private TestName name = new TestName();

	@Before
	public void setUp()
	{
		Log.i("Info","[START] - Launch Test: " + name.getMethodName());
		baristaRule.launchActivity();
		Intents.init();
	}


	@After
	public void tearDown()
	{
		Log.i("Info", "[FINISH] - Test: " + name.getMethodName());
		Intents.release();
	}

	@Test
	public void SimpleTest() throws Exception
	{
		Boolean b = testing();
		Log.i("Info","Testing returns : " + b.toString());
		/*
		//Spoon.screenshot(mActivity, "initial_state");

		clickOn(R.id.editText);
		writeTo(R.id.editText,"Hello");
		closeKeyboard();
		clickOn(R.id.button);

		//clickOn(R.id.button);
		onView(withText(R.string.toast)).inRoot(withDecorView(not(is(baristaRule.getActivityTestRule().getActivity()
					.getWindow().getDecorView())))).check(matches(isDisplayed()));
		//onView(withId(R.string.toast)).check(matches(hasErrorText(mActivity.getString(R.string.button))));
		//Spoon.screenshot(mActivity, "final_state");
		*/
	}

	/*
	@Test
	public void useAppContext() throws Exception
	{
		// Context of the app under test.
		Context appContext = InstrumentationRegistry.getTargetContext();

		assertEquals("com.example.rajap.buttonplay", appContext.getPackageName());
	}
	*/

	public boolean testing()
	{
		clickOn(R.id.button);
		//intended(hasComponent(ActivityTwo.class.getName()));
		//intended(toPackage("com.example.rajap.buttonplay"));
		intended(hasComponent(ActivityTwo.class.getName()));
		//return baristaRule.getClass().desiredAssertionStatus();
		return  true;
	}
}
