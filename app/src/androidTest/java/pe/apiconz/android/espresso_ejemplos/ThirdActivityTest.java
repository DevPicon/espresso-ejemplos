package pe.apiconz.android.espresso_ejemplos;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by armando on 30/08/15.
 */
@RunWith(AndroidJUnit4.class)
public class ThirdActivityTest {

    public static final String NAME = "Andrew";
    public static final String EXPECTED_STRING = "Hello Andrew!";

    @Rule
    public ActivityTestRule<ThirdActivity> activityTestRule
            = new ActivityTestRule<>(ThirdActivity.class);

    @Test
    public void probarElSaludo(){
        onView(withId(R.id.txt_name)).perform(typeText(NAME), closeSoftKeyboard());

        onView(withId(R.id.btn_greeting)).perform(click());

        onView(withId(R.id.lbl_greeting)).check(matches(withText(EXPECTED_STRING)));
    }
}
