package pe.apiconz.android.espresso_ejemplos;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by armando on 02/09/15.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class FifthActivityTest {

    public static final String THIS_IS_MY_BOMB = "Esta es una bomba";
    ActivityTestRule<FifthActivity> activityTestRule
            = new ActivityTestRule<>(FifthActivity.class, false, false);

    @Test
    public void enviamosUnDatito(){
        Intent intent = new Intent();
        intent.putExtra("data", THIS_IS_MY_BOMB);
        activityTestRule.launchActivity(intent);

        onView(withId(R.id.txt_receiver))
                .check(matches(withText(THIS_IS_MY_BOMB)));
    }

}
