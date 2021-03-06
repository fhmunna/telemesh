package com.w3engineers.unicef.telemesh.data.local.survey;

import com.w3engineers.unicef.telemesh.data.local.db.AppDatabase;

import java.util.List;

import io.reactivex.Flowable;

/*
 * ============================================================================
 * Copyright (C) 2019 W3 Engineers Ltd. - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Created by: Mimo Saha on [07-Feb-2019 at 1:51 PM].
 * Email:
 * Project: telemesh.
 * Code Responsibility: <Purpose of code>
 * Edited by :
 * --> <First Editor> on [07-Feb-2019 at 1:51 PM].
 * --> <Second Editor> on [07-Feb-2019 at 1:51 PM].
 * Reviewed by :
 * --> <First Reviewer> on [07-Feb-2019 at 1:51 PM].
 * --> <Second Reviewer> on [07-Feb-2019 at 1:51 PM].
 * ============================================================================
 */

public class SurveyDataSource {

    private SurveyDao surveyDao;
    private static SurveyDataSource surveyDataSource = new SurveyDataSource();

    public SurveyDataSource() {
        surveyDao = AppDatabase.getInstance().surveyDao();
    }

    /*
     * This constructor is restricted and only used in unit test class
     * @param surveyDao -> provide dao from unit test class
     */
    public SurveyDataSource(SurveyDao surveyDao) {
        this.surveyDao = surveyDao;
    }

    public static SurveyDataSource getInstance() {
        return surveyDataSource;
    }

    public long insertOrUpdateData(SurveyEntity surveyEntity) {
        return surveyDao.writeSurvey(surveyEntity);
    }

    public Flowable<List<SurveyEntity>> getAllSurvey() {
        return surveyDao.getAllSurvey();
    }

    public SurveyEntity getSurveyById(String surveyId) {
        return surveyDao.getSurveyById(surveyId);
    }
}
