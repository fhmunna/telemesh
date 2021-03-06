package com.w3engineers.unicef.telemesh.ui.survey;


import com.w3engineers.ext.strom.application.ui.base.BaseRxViewModel;
import com.w3engineers.unicef.telemesh.data.local.survey.SurveyDataSource;

/**
 * * ============================================================================
 * * Copyright (C) 2018 W3 Engineers Ltd - All Rights Reserved.
 * * Unauthorized copying of this file, via any medium is strictly prohibited
 * * Proprietary and confidential
 * * ----------------------------------------------------------------------------
 * * Created by: Sikder Faysal Ahmed on [11-Oct-2018 at 12:45 PM].
 * * ----------------------------------------------------------------------------
 * * Project: telemesh.
 * * Code Responsibility: <Purpose of code>
 * * ----------------------------------------------------------------------------
 * * Edited by :
 * * --> <First Editor> on [11-Oct-2018 at 12:45 PM].
 * * --> <Second Editor> on [11-Oct-2018 at 12:45 PM].
 * * ----------------------------------------------------------------------------
 * * Reviewed by :
 * * --> <First Reviewer> on [11-Oct-2018 at 12:45 PM].
 * * --> <Second Reviewer> on [11-Oct-2018 at 12:45 PM].
 * * ============================================================================
 **/
public class SurveyViewModel extends BaseRxViewModel {

    public SurveyViewModel() {
        super();

        SurveyDataSource surveyDataSource = SurveyDataSource.getInstance();
    }

}
