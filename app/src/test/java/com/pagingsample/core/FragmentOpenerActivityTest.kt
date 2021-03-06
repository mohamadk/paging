package com.pagingsample.core

import com.mohamadk.pagingfragment.BuildConfig
import com.pagingsample.createNewDialogPage
import com.pagingsample.createNewPage
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(application = TestApplication::class)
class FragmentOpenerActivityTest {

    @Test
    fun openPage() {
        val tag = "SamplePage"
        startActivity()
            .loadPage(createNewPage(tag))
            .checkExistingPage(tag)
    }

    @Test
    fun openDialogPage() {
        val tag = "SampleDialogPage"
        startActivity()
            .loadPage(createNewDialogPage(tag))
            .checkExistingPage(tag)
    }


    private fun startActivity(): FragmentOpenerActivityRobot {
        return FragmentOpenerActivityRobot(
            Robolectric.setupActivity(FragmentOpenerActivityTestActivity::class.java)
        )
    }

}