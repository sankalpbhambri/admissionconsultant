package com.sankalpapps.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Sankalp on 21-08-2016.
 */
public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> q1 = new ArrayList<String>();
        q1.add("Student needs to have 16years of schooling. Few universities accept 15 years as well.");

        List<String> q2 = new ArrayList<String>();
        q2.add("There are 3 intake season. 1st is fall in month of August, 2nd is Spring which is January month and third is month of May.");

        List<String> q3 = new ArrayList<String>();
        q3.add("There are 4 steps\n" +
                " 1) Qualifying tests\n" +
                " 2) University selection\n" +
                " 3) Application process\n" +
                " 4) Visa\n");

        List<String> q4 = new ArrayList<String>();
        q4.add("There are many test, Specifically GRE is for engineering and Science course. GMAT is for MBA.");

        List<String> q5 = new ArrayList<String>();
        q5.add("Graduate record examinations, consisting of Quantitative that is basic Math(Its of 800 score), Verbal( again 800 score) consisting of synonyms, antonyms,  reading comprehension. AWA is analytical writing assessment is made up of 2 essays. Each essay will be given two independent scores, but the scores are averaged into one score from 0 to 6.It takes 30 days to get your score.");

        List<String> q6 = new ArrayList<String>();
        q6.add("Student needs to give these tests for english skills. It has 4 sections which are speaking, listening, writing, listening. TOEFL is of 120 score and IELTS is measured of 9 bands.");

        List<String> q7 = new ArrayList<String>();
        q7.add("There are more than 4000 universities in USA and student typically needs to select 4 to 5university depending upon\n" +
                "1) Availability of course\n" +
                        "2) Fees\n" +
                        "3) Ranking\n" +
                        "4) Quality\n" +
                        "5) Location\n" +
                        "6) Climate\n" +
                        "7) Infrastructure\n" +
                        "8) Financial Aid\n");


        List<String> q8 = new ArrayList<String>();
        q8.add("This process includes filling online application forms and supplementary forms. Application fees can be paid using credit card. Also student needs to  mail documents , score reporting to universities");
        List<String> q9 = new ArrayList<String>();
        q9.add("SSC/Intern certificates, Bachelors' transcripts, GRE/TOEFL/IELTS score card, Recommendation letters given by faculty in sealed envelope, Bank statement, Resume, SOP, affidavit of support given by parent/guardian stating that he/she will support student during the studies.");
        List<String> q10 = new ArrayList<String>();
        q10.add("Statement of purpose is document in which you need to state why did you choose USA as destination, reason for particular major and that particular university. It should be maximum of 2 pages.");
        List<String> q11 = new ArrayList<String>();
        q11.add("It takes minimum of 2-3 months to take an admit. You can track application online. If one don't hear from them then he/she can mail or call to know about status of application. Admit is called as i-20.");
        List<String> q12 = new ArrayList<String>();
        q12.add("Once after i-20 is received, One needs to pay visa fees in designated HDFC bank branch. It takes 48 hours for bar code to get activated. once activated fill DS-160 form and book a visa interview date, also needs to pay SEVIS fees to university.");
        List<String> q13 = new ArrayList<String>();
        q13.add("You need to bring document like financial statements including family income, savings, loan, property details.");
        List<String> q14 = new ArrayList<String>();
        q14.add("You can have additional sponsor. It can be relative, family or friend.");
        List<String> q15 = new ArrayList<String>();
        q15.add("There are number of ways like research assistantship , teaching assistantship, graduate assistantship identified by academic advisor. It also depends upon performance in first semester grades. Good grades brighten up chances of getting funding from university.");
        List<String> q16 = new ArrayList<String>();
        q16.add("Not at all. Visa officer wants to know about academic major, university, sponsor. Your confidence, body language, presence of mind are important to get a visa. Be clear and honest.");
        List<String> q17 = new ArrayList<String>();
        q17.add("We will help you in university selection, application process, tracking, Visa guidance, onshore assistance. All the best.");

        List<String> q18 = new ArrayList<String>();
        q18.add("We will help you in university selection, scholarships/grants, application process, tracking, Visa guidance, onshore assistance.\n All the best.");


        expandableListDetail.put("What is eligibility criteria to pursue masters in United states Universities?", q1);
        expandableListDetail.put("When should I start admission process?", q2);
        expandableListDetail.put("What is admission process?", q3);
        expandableListDetail.put("What are qualifying tests?", q4);
        expandableListDetail.put("What is GRE?", q5);
        expandableListDetail.put("What is TOEFL/IELTS?", q6);
        expandableListDetail.put("How to select university?", q7);
        expandableListDetail.put("How to apply to universities?", q8);
        expandableListDetail.put("What documents needed to be mailed to Universities?", q9);
        expandableListDetail.put("What is SOP?", q10);
        expandableListDetail.put("How many days will it take to get Admit?", q11);
        expandableListDetail.put("How to start visa process?", q12);
        expandableListDetail.put("How to prepare for visa interview?", q13);
        expandableListDetail.put("What happen if one doesn't have sufficient funds?", q14);
        expandableListDetail.put("Are there any chance of financial assistance?", q15);
        expandableListDetail.put("What about interview. Is it tough to clear it?", q16);
        expandableListDetail.put("How can you help us?", q17);

        expandableListDetail.put("How can you help us?", q18);

        return expandableListDetail;
    }
}