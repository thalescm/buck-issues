package machado.thales.app

import android.content.Intent
import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import com.nubank.android.common.http.auth.MockPerson
import org.hamcrest.CoreMatchers.allOf
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Created by thalesmachado on 12/21/17.
 */
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Before
    fun setup() {
        val person = MockPerson.getInstanceForPersonName("giulia")
        val manager = object : PersonManager {
            override fun login(): Person = person
        }
        PersonManager.setInstance(manager)
    }

    @After
    fun dispose() {
        PersonManager.setInstance(null)
    }

    @Test
    fun testLogin() {
        activityRule.launchActivity(Intent())
        onView(withId(R.id.clickBT)).perform(click())
        Espresso.onView(allOf(withId(R.id.personTV), ViewMatchers.withText("Giulia Machado"))).check(ViewAssertions.matches(isDisplayed()))
    }
}
