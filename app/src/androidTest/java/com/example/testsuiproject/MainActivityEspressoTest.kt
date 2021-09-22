package com.example.testsuiproject

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityEspressoTest {

    @get:Rule
    public val testRule =
        ActivityTestRule(MainActivity::class.java)




    @Test
    fun ensureTextChangeWork() {
        onView(withId(R.id.input_field)).perform(
            typeText("HELLO "),
            closeSoftKeyboard()
        )
        onView(withId(R.id.change_text)).perform(
            click()
        )
        onView(withId(R.id.input_field)).check(
            matches(withText("Lalala"))
        )




    }

}