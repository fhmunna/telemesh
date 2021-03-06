package com.w3engineers.unicef.telemesh.ui.aboutus;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.w3engineers.unicef.telemesh.BuildConfig;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * ============================================================================
 * Copyright (C) 2019 W3 Engineers Ltd. - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Created by: Mimo Saha on [28-Jan-2019 at 3:48 PM].
 * Email:
 * Project: telemesh.
 * Code Responsibility: <Purpose of code>
 * Edited by :
 * --> <First Editor> on [28-Jan-2019 at 3:48 PM].
 * --> <Second Editor> on [28-Jan-2019 at 3:48 PM].
 * Reviewed by :
 * --> <First Reviewer> on [28-Jan-2019 at 3:48 PM].
 * --> <Second Reviewer> on [28-Jan-2019 at 3:48 PM].
 * ============================================================================
 **/
@RunWith(AndroidJUnit4.class)
public class AboutUsViewModelTest {

    AboutUsViewModel SUT;

    @Rule
    public ActivityTestRule<AboutUsActivity> rule  = new ActivityTestRule<>(AboutUsActivity.class);

    @Before
    public void setUp() throws Exception {
        Context context = InstrumentationRegistry.getTargetContext();
        SUT = new AboutUsViewModel(rule.getActivity().getApplication());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAppVersion_matched_useValidBuildVersion() {
        String buildVersion = "Version:" + BuildConfig.VERSION_NAME;
        assertEquals(SUT.getAppVersion(), buildVersion);
    }

    @Test
    public void getAppVersion_notMatched_useEmptryBuildVersion() {
        String buildVersion = "Version:" + "";
        assertNotEquals(SUT.getAppVersion(), buildVersion);
    }

    @Test
    public void getAppVersion_success_useNullBuildVersion() {
        String buildVersion = "Version:" + null;
        assertNotEquals(SUT.getAppVersion(), buildVersion);
    }

}