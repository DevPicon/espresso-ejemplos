package pe.apiconz.android.espresso_ejemplos;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;

/**
 * Created by armando on 30/08/15.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class FourthActivityTest {

    @Rule
    public ActivityTestRule<FourthActivity> activityTestRule
            = new ActivityTestRule<>(FourthActivity.class);

    @Test
    public void probarSiLeDamosASugar(){
        onData(anything())
                .inAdapterView(withId(R.id.list_of_groceries)).atPosition(3)
                .perform(click());

        onView(withId(R.id.txt_selected_grocery))
                .check(matches(withText("sugar")));
    }

}
