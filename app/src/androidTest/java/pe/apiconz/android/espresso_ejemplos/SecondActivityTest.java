package pe.apiconz.android.espresso_ejemplos;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;

/**
 * Created by armando on 30/08/15.
 */
@RunWith(AndroidJUnit4.class)
public class SecondActivityTest {

    @Rule
    public ActivityTestRule<SecondActivity> activityTestRule
            = new ActivityTestRule<>(SecondActivity.class);

    @Test
    public void probarSiBotonEstaInactivo(){
        onView(withId(R.id.button_clickme))
                .perform(click())
                .check(matches(not(isEnabled())));
    }

    // Este test fallará, es para fines didacticos
    // @Test
    public void probarSiBotonEstaActivo(){
        onView(withId(R.id.button_clickme))
                .perform(click())
                .check(matches(isEnabled()));
    }
}
