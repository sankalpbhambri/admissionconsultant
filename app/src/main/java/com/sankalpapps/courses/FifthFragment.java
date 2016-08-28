package com.sankalpapps.courses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


public class FifthFragment extends ListFragment {


    private ArrayList<Note> noteList;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        noteList = new ArrayList<>();
        noteList.add(new Note("Hubert Humphrey Fellowships in USA for International Students",
                "Deadline: before 1 Oct (annual)\n" +
                "Study in:  USA\n" +
                "Program starts Apr-Sept 2017\n" + "USA Government\n" + "Non-degree\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The Humphrey Fellowship Program is for experienced professionals interested in strengthening their leadership skills through a mutual exchange of knowledge and understanding about issues of common concern in the U.S. and Fellows’ home countries.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "Fellows are placed at one of the participating USA universities. Fellows are not able to choose which university they will attend. Rather, they are assigned in diverse groups of 7-15 to the most appropriate host institution based on their area of interest and professional field.\n" +
                "\n" +
                "Level/Field of study:\n" +
                "\n" +
                "As a non-degree program, the Fellowship offers valuable opportunities for professional development through selected university courses, attending conferences, networking, and practical work experiences. The eligible program fields are:\n" +
                "\n" +
                "• Agricultural and Rural Development\n" +
                "• Communications/Journalism\n" +
                "• Economic Development\n" +
                "• Educational Administration, Planning and Policy\n" +
                "• Finance and Banking\n" +
                "• Higher Education Administration\n" +
                "• HIV/AIDS Policy and Prevention\n" +
                "• Human Resource Management\n" +
                "• Law and Human Rights\n" +
                "• Natural Resources, Environmental Policy, and Climate Change\n" +
                "• Public Health Policy and Management\n" +
                "•  Public Policy Analysis and Public Administration\n" +
                "•  Substance Abuse Education, Treatment and Prevention\n" +
                "•  Teaching of English as a Foreign Language\n" +
                "•  Technology Policy and Management\n" +
                "•  Trafficking in Persons Policy and Prevention\n" +
                "•  Urban and Regional Planning\n" +
                "\n" +
                "Number of Awards:\n" +
                "\n" +
                "Approximately 200 Fellowships are awarded annually.\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "Citizens of eligible countries in Sub-Saharan Africa, Europe and Eurasia, Middle East and North Africa, East Asia and Pacific, South and Central Asia, and Western Hemisphere.\n" +
                "\n" +
                "Scholarship value/inclusions:\n" +
                "\n" +
                "The Fellowship provides for:\n" +
                "\n" +
                "•  Payment of tuition and fees at the assigned host university;\n" +
                "•  Pre-academic English language training, if required;\n" +
                "•  A maintenance (living) allowance, including a one-time settling-in allowance;\n" +
                "•  Accident and sickness coverage;\n" +
                "•  A book allowance;\n" +
                "•  A one-time computer subsidy;\n" +
                "• Air travel (international travel to and from the U.S. for the program and domestic travel to required program events);\n" +
                "• A Professional Development allowance for professional activities, such as field trips, professional visits and conferences.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "The applicant must have:\n" +
                "\n" +
                "•  An undergraduate (first university) degree,\n" +
                "•  A minimum of five years of full-time, professional experience\n" +
                "•  Limited or no prior experience in the United States,\n" +
                "•  Demonstrated leadership qualities,\n" +
                "•  A record of public service in the community, and\n" +
                "•  English language ability\n", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("Stanford Africa MBA Fellowship",
                "Deadline: 15 Jun 2016 (annual)\n" +
                "Study in:  USA\n" + "Stanford Graduate School of Business\n"+
                "Course starts Fall 2017\n" +
                        "MBA Degree\n" +
                        "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The Stanford Africa MBA Fellowship Program are for citizens of African countries with financial need who wish to obtain an MBA at Stanford GSB.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "Stanford Graduate School of Business, USA\n" +
                "\n" +
                "Level/Field of study:\n" +
                "\n" +
                "Masters in Business Administration (MBA)\n" +
                "\n" +
                "Number of Awards:\n" +
                "\n" +
                "Up to 8\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "Citizens of African countries\n" +
                "\n" +
                "Scholarship value/inclusions/duration:\n" +
                "\n" +
                "Stanford Africa MBA Fellows receive financial support for the cost of Stanford MBA tuition and associated fees for the two-year course of study.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "You must be a citizen of an African country. Dual citizens are eligible for the fellowship as long as you hold citizenship of an African nation.  You must have also completed, or be in the final year of completing, your university studies. You must also return to work in Africa, within two years of Stanford MBA graduation, for a period of at least two years.", Note.Category.SCHOLARSHIPS));

        noteList.add(new Note("Rotary Peace Fellowships",
                "Deadline: 31 May 2016 (annual)\n" +
                "Study in: USA, Japan, UK, Australia, Sweden, Thailand\n" + "Rotary International\n" +
                "Course starts 2017\n" +
                "Masters/Certificate\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "Each year, Rotary selects up to 100 individuals from around the world to receive fully funded academic fellowships to pursue a Certificate Program or Masters Degree program related to peace and conflict resolution and prevention at one of the participating peace centers.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "•  Duke University and University of North Carolina at Chapel Hill, USA\n" +
                "\n" +
                "•  International Christian University, Japan\n" +
                "\n" +
                "•  University of Bradford, England\n" +
                "\n" +
                "•  University of Queensland, Australia\n" +
                "\n" +
                "•  Uppsala University, Sweden\n" +
                "\n" +
                "•  Chulalongkorn University, Thailand (certificate program)\n" +
                "\n" +
                "Level/Field of study:\n" +
                "\n" +
                "Certificate or Masters Degree Programme in fields related to peace and conflict resolution and prevention\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "Anyone endorsed by their local Rotary Club/District.\n" +
                "\n" +
                "No. of Scholarships:\n" +
                "\n" +
                "Up to 50 master’s degree fellowships and 50 certificates are awarded each year.\n" +
                "\n" +
                "Scholarship value/inclusions:\n" +
                "\n" +
                "The fellowships cover tuition and fees, room and board, round-trip transportation, and all internship and field-study expenses.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "The Rotary Peace Fellowship is designed for professionals with work experience in international relations or peace and conflict prevention and resolution. Applicants must also meet the following requirements:\n" +
                "\n" +
                "• Proficiency in English; proficiency in a second language is strongly recommended\n" +
                "\n" +
                "• Strong commitment to international understanding and peace as demonstrated through professional and academic achievements and personal or community service\n" +
                "\n" +
                "• Excellent leadership skills\n" +
                "\n" +
                "• Master’s degree applicants: minimum three years of related full-time work or volunteer experience, bachelor’s degree\n" +
                "\n" +
                "• Certificate applicants: minimum five years of related full-time work or volunteer experience, strong academic background\n" +
                "\n" +
                "Read the complete eligibility requirements.\n" +
                "\n", Note.Category.SCHOLARSHIPS));

        noteList.add(new Note("Fulbright Foreign Student Program in USA","Deadline: varies, Feb-Oct 2016\n" +
                "Study in:  USA\n" +
                "Course starts AY 2017-2018\n" +
                "USA Government\n" +
                "Masters/PhD Degrees" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The Fulbright Foreign Student Program enables graduate students, young professionals and artists from abroad to study and conduct research in the United States at U.S. universities or other academic institutions.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "USA Universities and Academic Institutions\n" +
                "\n" +
                "Field(s) of study:\n" +
                "\n" +
                "Fulbright encourages applications from all fields, including interdisciplinary ones.\n" +
                "\n" +
                "Number of Awards:\n" +
                "\n" +
                "Approximately 4,000 foreign students receive Fulbright scholarships each year.\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "International students from 155 countries around the world\n" +
                "\n" +
                "Scholarship value/duration:\n" +
                "\n" +
                "Generally, the grant funds tuition, airfare, a living stipend, and health insurance, etc. The Fulbright program provides funding for the duration of the study.\n" +
                "\n" +
                "See the official website and country specific websites for the complete list of scholarship benefits.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "Program eligibility and selection procedures vary widely by country. Please see the country specific websites to find information about the Fulbright Program in your home country, including eligibility requirements and application guidelines.\n" +
                "\n" +
                "Application instructions:\n" +
                "\n" +
                "All Foreign Student Program applications are processed by bi-national Fulbright Commissions/Foundations or U.S. Embassies. Therefore, foreign students must apply through the Fulbright Commission/Foundation or U.S. Embassy in their home countries. Deadline varies per country but is around February to October annually.", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("Harvard Fellowships in Sustainability Science","Deadline: 15 Jan 2016 (annual)\n" +
                "Study in:  USA\n" +
                "CID-Harvard\n" +
                "Doctoral/Postdoctoral Fellowship\n" +
                "Next program starts September 2016\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The Sustainability Science Program at Harvard University offers doctoral, post-doctoral, and mid-career fellowships in Sustainability Science. The fellowships are tenable during Harvard’s academic year beginning in September 2016.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "Center for International Development at Harvard University, USA\n" +
                "\n" +
                "Fields of study:\n" +
                "\n" +
                "This year’s competition is focused on two thematic areas related to energy and sustainability. The University is seeking applications focusing on: 1) decarbonizing energy systems in the European Union and 2) designing, developing, and/or implementing sustainable energy and related resource policies and programs in China.\n" +
                "\n" +
                "Number of Awards:\n" +
                "\n" +
                "Not specified.\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "Doctoral and post-doctoral students and mid-career professionals\n" +
                "\n" +
                "Scholarship value/inclusions:\n" +
                "\n" +
                "Fellowship appointments offer a stipend of $45,830 for post-doctoral fellows, and $25,000 for pre-doctoral fellows, over the ten month academic year (September–June), equivalent to $55,000 and $30,000, respectively, on a yearly basis. Stipends for practitioner, mid-career, and senior research fellows are commensurate with experience.\n" +
                "\n" +
                "Fellows have the option to enroll in Harvard University’s employee health insurance program at a subsidized rate for the duration of their fellowship.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "The Sustainability Science Fellowships are open to advanced doctoral and post-doctoral students, and to mid-career professionals engaged in research or practice that advances the goals of the program (see above).\n" +
                "\n" +
                "Prospective fellows should have a focused personal research or writing objective that is consistent with those goals. In addition, applicants should be interested in spending some of their time as fellows in collaborations with other fellows and faculty in the program in ways that will advance the interdisciplinary, problem-driven agenda of sustainability science more broadly.\n" +
                "\n" +
                "Applications for the mid-career fellowships are invited from individuals in governmental, non-governmental, private organizations, or academia with at least five years of professional experience doing work involved in linking science and practice for sustainable development.\n" +
                "\n" +
                "Applications for the post-doctoral fellowships are welcome from recent recipients of the Ph.D. or equivalent degree. (Applicants must have completed their Ph.D. between 2011 and 2016.)\n" +
                "\n" +
                "Applicants for a doctoral fellowship must currently be enrolled in a doctoral program and have passed their qualifying exams (completed coursework and passed oral and/or written exams) by July 2016. Applicants whose doctoral programs do not require qualifying exams must have completed all the required coursework for the Ph.D., since fellows will not be doing course work while at Harvard.", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("Microsoft Research Women’s Fellowship Program","Deadline: varies\n" +
                "Study in: USA\n" +
                "Microsoft Research\n" +
                "PhD Degree" +
                "Course starts AY 2016-2017\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The Microsoft Research Women’s Fellowship provides funding to a select list of academic universities that will each award a US$20,000 fellowship to one woman who is interested in pursuing a PhD and in need of financial assistance.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "The following United States universities are participants in the Microsoft Research Women’s Fellowship in the 2016–2017 academic year:\n" +
                "\n" +
                "• Carnegie Mellon University\n" +
                "• Cornell University\n" +
                "• Georgia Institute of Technology\n" +
                "• Massachusetts Institute of Technology\n" +
                "• Princeton University\n" +
                "• Stanford University\n" +
                "• University of California at Berkeley\n" +
                "• University of Illinois at Urbana Champaign\n" +
                "• University of Texas at Austin\n" +
                "• University of Washington\n" +
                "\n" +
                "Level/Field of study:\n" +
                "\n" +
                "PhD Programme in any field of study offered at the participating Universities\n" +
                "\n" +
                "Number of Scholarships:\n" +
                "\n" +
                "One from each participating University\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "Women\n" +
                "\n" +
                "Scholarship value/inclusions/duration:\n" +
                "\n" +
                "The scholarship amount is US$20,000 for the 2016–2017 academic year. Of that amount, $18,000 will be applied toward tuition costs and $2,000 will cover travel expenses to a conference in the fellowship recipient’s field of study.\n" +
                "\n" +
                "The fellowship is awarded to recipients for one academic year only and is not available for extension or renewal.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "The Microsoft Research Women’s Fellowship is eligible to students entering or enrolled in a PhD program at one of the participating universities for the 2016–2017 academic year.\n" +
                "\n" +
                "Application instructions:\n" +
                "\n" +
                "If you are pursuing, or plan to pursue, a PhD at one of these universities and are interested in applying to receive the Microsoft Research Women’s Fellowship, contact the department chair in your field of study for information about the fellowship’s application, review, and selection process as well as the fellowship schedule for the 2016–2017 academic year. Deadline varies per university.", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("AAUW International Fellowships in USA for Women","Deadline: 1 Dec 2015 (annual)\n" +
                "Study in: USA\n" +
                "AAUW\n" +
                "Masters or First Professional/PhD/Postdoctoral" +
                "Next course starts July 2016 \n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "AAUW (the American Association of University Women) awards International Fellowships for full-time study or research in the United States to women who are not United States citizens or permanent residents. Both graduate and postgraduate studies at accredited institutions are supported.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "Accredited U.S. institutions\n" +
                "\n" +
                "Level/Field(s) of study:\n" +
                "\n" +
                " Graduate and postgraduate studies at accredited U.S. institutions.\n" +
                "\n" +
                "Number of Awards:\n" +
                "\n" +
                "Not specified\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "Women who are not United States citizens or permanent residents.  Preference is given to women who show prior commitment to the advancement of women and girls through civic, community, or professional work.\n" +
                "\n" +
                "Scholarship value/inclusions:\n" +
                "\n" +
                "Master’s/Professional Fellowship: $18,000\n" +
                "Doctorate Fellowship: $20,000\n" +
                "Postdoctoral Fellowship: $30,000\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "Applicants must be women and have citizenship in a country other than the United States or possession of a nonimmigrant visa if residing in the United States. Women holding dual citizenship in the United States and another country are not eligible.\n" +
                "\n" +
                "It is important to read the full eligibility criteria. See the official website for more details.\n" +
                "\n" +
                "Application instructions:\n" +
                "\n" +
                "Applications for AAUW International Fellowships are open August 1–December 1.\n" +
                "\n" +
                "Applications and submission of supporting documents are done online. The application deadline for AY 2016-2017 was 1 December 2015.", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("PEO International Peace Scholarships for Women","Deadline: 15 Dec 2015 (annual)\n" +
                "Study in: Canada, USA\n" +
                "PEO\n" +
                "Masters/PhD Degree" +
                "Course starts 2016\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The International Peace Scholarship Fund, established in 1949, is a program which provides scholarships for selected women from other countries for graduate study in the United States and Canada.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "Accredited Universities and Colleges in United States or Canada\n" +
                "\n" +
                "Levels/Fields of study:\n" +
                "\n" +
                "Masters or PhD Programme in any field of study offered at accredited Universities.\n" +
                "\n" +
                "Scholarships are not given for online courses, research, internships or for practical training if not combined with coursework.\n" +
                "\n" +
                "Number of Scholarships:\n" +
                "\n" +
                "Not specified\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "Women\n" +
                "\n" +
                "Scholarship value/duration:\n" +
                "\n" +
                "The scholarships are given as GRANTS-IN-AID and are not intended to cover all academic or personal expenses. The maximum scholarship amount for one (1) year of study is $12,500, based upon need. Lesser amounts may be awarded according to individual need.\n" +
                "\n" +
                "A recipient in graduate school is eligible to apply for one (1) renewal of her scholarship. She may receive scholarship assistance for no more than two (2)years.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "• An applicant must be qualified for admission to full-time graduate study and working toward a graduate degree in an accredited college or university in the United States or Canada.\n" +
                "\n" +
                "• A student who is a citizen or permanent resident of the United States or Canada is not eligible.\n" +
                "\n" +
                "• In order to qualify for her first scholarship, an applicant must have a full year of coursework remaining, be enrolled and in residence for the entire school year.\n" +
                "\n" +
                "• Doctoral students who have completed coursework and are working only on dissertations are not eligible as first-time applicants.\n" +
                "\n" +
                "Application instructions:\n" +
                "\n" +
                "Applications are currently closed.\n" +
                "\n" +
                "Eligibility must be established before application material is sent to applicants. The eligibility information is available at the official website at any time but the completed form will be accepted electronically in the IPS office only between 15 September and 15 December 2015.\n" +
                "\n", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("ICSP Scholarships at University of Oregon USA","Deadline: 15 Jan 2016 (annual)\n" +
                "Study in: USA\n" +
                "University of Oregon\n" +
                "Bachelors Degree" +
                "Course starts 2016\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "International students who demonstrate financial need and exceptional merit may apply for the International Cultural Service Program (ICSP).  The ICSP scholarship has a cultural service component which requires students to give presentations about their home country to children, community organizations, and UO students, faculty and staff\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "Oregon University, USA\n" +
                "\n" +
                "Field(s) of study:\n" +
                "\n" +
                "Eligible programmes offered at the University\n" +
                "\n" +
                "Number of Scholarships:\n" +
                "\n" +
                "Not specified.\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "International students who demonstrate financial need and exceptional merit \n" +
                "\n" +
                "Scholarship value/inclusions:\n" +
                "\n" +
                "Tuition waiver worth $7,500 – $30,000.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "Applicants must be admissible or fully admitted to the University of Oregon. New students must apply for admission to the UO for 2016-17 by 15 January 2016. \n" +
                "Applicants cannot be U.S. citizens, U.S. permanent residents, or eligible to receive U.S. federal financial assistance.\n" +
                "Applicants must demonstrate financial need and meet the minimum 3.0 cumulative GPA requirement\n" +
                "ICSP students agree to complete 80 hours per year of cultural service as required by the program.\n" +
                "\n" +
                "Application instructions:\n" +
                "\n" +
                "Applications are currently closed.\n" +
                "\n" +
                "Applications and supporting materials must be submitted to International Affairs on or before 15 January  2016.  Documents sent to the Admissions Office will not be accepted for your ICSP application.", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("American University Emerging Global Leader Scholarship","Deadline: 15 Dec 2015\n" +
                "Study in: USA\n" +
                "American University\n" +
                "Bachelors Degree" +
                "Course starts August 2016\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The AU Emerging Global Leader Scholarship is targeted to high-achieving international students who wish to pursue a Bachelor’s Degree in the US and who are dedicated to positive civic and social change. It is intended for students who will be to returning home to improve under-resourced, underserved communities in his/her home country.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "American University, Washington DC, USA\n" +
                "\n" +
                "Field(s) of study:\n" +
                "\n" +
                "Any undergraduate study offered at the University\n" +
                "\n" +
                "Number of Scholarships:\n" +
                "\n" +
                "One (1) scholarship is available\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "The scholarships are targeted to international students from any country who are not U.S. citizens, U.S. permanent residents, or dual citizens of the U.S. and another country.Preference will be given to international students who have overcome various obstacles and challenges as well as those from diverse and under-represented global and socio-economic backgrounds.\n" +
                "\n" +
                "Scholarship value/inclusions:\n" +
                "\n" +
                "The AU EGL scholarship covers all billable AU expenses (full tuition, room and board). The scholarship does not cover non-billable expenses such as mandatory health insurance, books, airline tickets and miscellaneous expenses (approximately U.S. $4,000).\n" +
                "\n" +
                "It is renewable for a total of four years of undergraduate study, based on continued satisfactory academic performance.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "Preference will be given to:\n" +
                "\n" +
                "International students who have overcome various obstacles and challenges as well as those from diverse and underrepresented global and socioeconomic backgrounds.\n" +
                "A minimum 3.8 GPA equivalent (or in the top 10% of graduating class) for 9th-12th grades.\n" +
                "A demonstrated commitment to leadership, volunteerism, community service and to advancing the needs of people in their home country.\n" +
                "A minimum 95 TOEFL iBT, 7.0 IELTS or 600 paper-based TOEFL\n" +
                "You are NOT eligible to apply if:\n" +
                "\n" +
                "– You are a U.S. citizen, U.S. permanent resident, or dual citizen of the U.S. and another country.\n" +
                "\n" +
                "– You are enrolled in or have already begun any post-secondary studies at another university in your home country or the United States.\n" +
                "\n" +
                "Application instructions:\n" +
                "\n" +
                "Applications are currently closed. Information regarding the 2017 AU EGLS scholarship and AU application process will be posted at the official website on September 2016.\n" +
                "\n" +
                "To apply to the AU Emerging Global Leader Scholarship you must complete the online scholarship application form and submit required supporting documents by 15 December 2015 or at the latest, 15 January 2016.", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("ADB-Japan Scholarship Program for Developing Countries in Asia and Pacific","Deadline: varies\n" +
                "Study in:  Asia, Australia, NZ\n" +
                "ADB/Japan Government\n" +
                "Masters Degree" +
                "Course starts 2016\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The Asian Development Bank-Japan Scholarship Program (ADB-JSP) aims to provide an opportunity for well-qualified citizens of ADB’s developing member countries to undertake postgraduate studies in economics, management, science and technology, and other development-related fields at participating academic institutions in the Asian and Pacific Region.  Upon completion of their study programs, scholars are expected to contribute to the economic and social development of their home countries.\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "ADB-JSP provides scholarships only to participating academic institutions under the Program.\n" +
                "\n" +
                "Field(s) of study:\n" +
                "\n" +
                "Programs covered by the ADB-JSP are postgraduate studies in economics, management, health, education, agriculture,  environment, natural resource management, science and technology, and other development-related fields.\n" +
                "\n" +
                "Only programs offered at the participating academic institutions in the Asian and Pacific Regions are eligible for ADB-JSP funding.\n" +
                "\n" +
                "Number of Scholarships:\n" +
                "\n" +
                "About 300 scholarships are awarded annually.\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "The scholarships are open to citizens of ADB’s  borrowing member countries\n" +
                "\n" +
                "Scholarship value/inclusions:\n" +
                "\n" +
                "The ADB-JSP provides full tuition fees, a monthly subsistence and housing allowance, an allowance for books and instructional materials, medical insurance, and travel expenses.\n" +
                "\n" +
                "The scholarship is for one year with an extension to the second year of study, as appropriate, which shall be conditional on the scholar maintaining a satisfactory level of performance as determined by the institute.   The maximum duration of scholarship award is two years for masters and doctorate programs.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "1. A national of an ADB borrowing member country (applicants from countries that are no longer borrowing from ADB are not eligible for the ADB-JSP Scholarship).\n" +
                "\n" +
                "2. Gained admission to an approved MA/PhD course at an academic institution .\n" +
                "\n" +
                "3. A bachelor’s degree or its equivalent with superior academic record.\n" +
                "\n" +
                "4. At least two (2) years of full-time professional working experience (acquired after a university degree) at the time of application. Proficiency in oral and written English communication skills to be able to pursue studies.\n" +
                "\n" +
                "5. Not more than 35 years old at the time of application. In exceptional cases, for programs which are appropriate for senior officials and managers, the age limit is 45 years old.\n" +
                "\n" +
                "6. In good health.\n" +
                "\n" +
                "7. Should agree to return to his/her home country after completion of studies under the Program.\n" +
                "\n" +
                "8. Executive Directors, Alternate Directors, management and staff of ADB, consultants, and relatives of the aforementioned are not eligible for the Scholarship.\n" +
                "\n" +
                "9. Staff of academic institutions are not eligible for the Scholarship.\n" +
                "\n" +
                "10. Applicants living or working in a country other than his/her home country are not eligible for scholarships.\n" +
                "\n" +
                "11. ADB-JSP does not support applicants who are already enrolled in graduate degree programs.\n" +
                "\n" +
                "12. ADB-JSP does not sponsor undergraduate studies, distance learning programs, short-term training, conferences, seminars, thesis writing, and research projects.\n" +
                "\n" +
                "Application instructions:\n" +
                "\n" +
                "Applicants should request information and application forms from the chosen Academic Institution and should indicate to that Institution that they are applying for admission and that they would like to be considered for the ADB-JSP Scholarship. The completed Institution application form and required documentation, including the ADB-JSP Information Sheet form, should be submitted to the academic institution. No separate application to ADB is necessary.\n" +
                "\n" +
                "You must send applications for scholarships at least six months prior to the planned time that you wish to commence studies.   Please refer to the normal month of intake and deadline of application in the participating academic institutions.", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("Emerging Economy Fellowships at Wharton Business School","Deadline: admissions deadline\n" +
                "Study in:  USA\n" +
                "Wharton Business School\n" +
                "MBA Degree" +
                "Course starts 2015\n" +
                "\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "Emerging Economy Fellowships are offered to support students from emerging economies throughout the world.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "Wharton Business School, University of Pennsylavania\n" +
                "\n" +
                "\n" +
                "\n" +
                "Field of study:\n" +
                "\n" +
                "\n" +
                "Masters in Business Administration (MBA)\n" +
                "\n" +
                "\n" +
                "Number of Awards:\n" +
                "\n" +
                "Not specified\n" +
                "\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "Nationals of developing/emerging countries\n" +
                "\n" +
                "\n" +
                "\n" +
                "Scholarship value/inclusions:\n" +
                "\n" +
                "\n" +
                "The fellowship includes funding for both years of the Wharton MBA.\n" +
                "\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "First year students from developing countries admitted to Wharton’s MBA Program.  Criteria for selection of awards may include academic achievement, compelling leadership, exceptional professional development, and unique personal qualities.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Application instructions:\n" +
                "\n" +
                "\n" +
                "\n" +
                "All admitted students are considered for Wharton Fellowship support.  There is no formal fellowship application, and notification of fellowship support is included with the admission decision.", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("EWC Graduate Degree Scholarships for Asia and the Pacific","Deadline: 3 Nov 2014 (annual)\n" +
                "Study in:  Hawaii, USA\n" +
                "East-West Center\n" +
                "Masters/PhD Degree" +
                "Course starts August 2015\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The East-West Center Graduate Degree Fellowship provides funding for up to 24 months for Master’s or Doctoral degree study for graduate students from Asia, the Pacific, and the U.S. to participate in the educational, residential, and leadership development programs at the East-West Center while pursuing graduate study at the University of Hawai‘i.  \n" +
                "\n" +
                "Host Institution(s):\n" +
                "\n" +
                "University of Hawaii and East West Center, USA\n" +
                "\n" +
                "Field of study:\n" +
                "\n" +
                "Eligible fields of study offered at University of Hawaii\n" +
                "\n" +
                "Number of Awards:\n" +
                "\n" +
                "Not specified.\n" +
                "\n" +
                "Target group:\n" +
                "\n" +
                "Individuals who are citizens of a country listed below may apply for the East-West Center Graduate Degree Fellowships:\n" +
                "\n" +
                "Southeast Asia: Brunei, Burma, Cambodia, Timor-Leste, Indonesia, Lao PDR, Malaysia, Philippines, Singapore, Thailand, Vietnam.\n" +
                "\n" +
                "East Asia: China (Hong Kong, Macau, Mainland, Taiwan), Japan, Republic of Korea, Democratic People’s Republic of Korea, Republic of, Mongolia, Russia.\n" +
                "\n" +
                "South Asia:  Afghanistan, Bangladesh, Bhutan, India, Iran, Maldives, Nepal, Pakistan, Sri Lanka.\n" +
                "\n" +
                "Pacific Region: American Samoa, Australia, Cook Islands, Federated States of Micronesia, Fiji, French Polynesia, Guam, Kiribati, Marshall Islands, Nauru, New Caledonia, New Zealand, Niue, Northern Marianas, Palau, Papua New Guinea, Samoa, Solomon Islands, Tokelau, Tonga, Tuvalu, Vanuatu, Wallis & Futuna Islands.\n" +
                "\n" +
                "United States\n" +
                "\n" +
                "Scholarship value/inclusions:\n" +
                "\n" +
                "The East-West Center Graduate Degree Fellowship provides the following funding:\n" +
                "\n" +
                "• Tuition and fees up to the equivalent of the tuition charged for post-baccalaureate students at the University of Hawai‘i at Mānoa toward master’s or doctoral studies;\n" +
                "• Housing in a Center residence hall, based on single occupancy;\n" +
                "• A stipend to partially cover food and incidental expenses (Refer to the section on taxes on\n" +
                "stipends for additional information.);\n" +
                "• An allowance for books, materials and supplies; and\n" +
                "• Health insurance coverage.\n" +
                "\n" +
                "Eligibility:\n" +
                "\n" +
                "General Requirements\n" +
                "\n" +
                "•  Applicants submit both the application for East-West Center Graduate Fellowship and the graduate admissions application to the University of Hawai‘i to the East-West Center Award Services Office. Applications must be postmarked by the November 1 deadline.\n" +
                "•  Applicants already enrolled as classified graduate students at the University of Hawai‘i submit only the East-West Center Graduate Fellowship application.\n" +
                "•  Required tests include the Test of English as a Foreign Language (TOEFL) or the International English Language Testing System (IELTS) for applicants from non-English speaking countries, and the GRE or GMAT for all applicants as required by university departments.\n" +
                "•  Award recipients who are not U.S. citizens or permanent residents must meet exchange visitor (J-1 visa) requirements.\n" +
                "\n" +
                "Application instructions:\n" +
                "\n" +
                "Applicants submit both the application for East-West Center Graduate Fellowship and the graduate admissions application to the University of Hawai‘i to the East-West Center Award Services Office. Applications must be postmarked by the  deadline. The deadline for August 2015 entry is 3 November 2014.", Note.Category.SCHOLARSHIPS));
        noteList.add(new Note("I.C. SHAH Scholarship","Deadline: before 1 March (annual)\n" +
                "Study in:  USA\n" +
                "Program starts Aug-Sept 2017\n" +
                "\n" +
                "\n" +
                "Brief description:\n" +
                "\n" +
                "The I.C. Shah Scholarship is administered by the Office for International Students and Scholars to provide assistance " +
                "to students from India and further MSU’s compelling interest in obtaining the educational benefits that flow from a " +
                "racially and ethnically diverse student body.Eligibility:\n" +
                "\n" +
                "The applicant must have:\n" +
                "\n" +
                "• Students from India on non-immigrant visas (F and J visas).\n" +
                "• Be in good academic standing. If underenrolled, you must have an approved form on file in OISS.\n" +
                "• Have a grade point average of 3.0 or better, or its equivalent, at the time of application.\n" +
                "• Maintain a cumulative grade point average of 2.5 or better while holding the scholarship.\n" +
                "• May receive one or more years of scholarship assistance that begins in the first or subsequent years of\n" +
                "enrollment at MSU.\n", Note.Category.SCHOLARSHIPS));



        NoteAdapter noteAdapter = new NoteAdapter(getActivity(),noteList);
        setListAdapter(noteAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.black));
        getListView().setDividerHeight(3);

    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        launchNoteDetailActivity(position);

    }

    private void launchNoteDetailActivity(int position){
        Note note = (Note)getListAdapter().getItem(position);
        Intent intent = new Intent(getActivity(),NoteDetailActivity.class);
        intent.putExtra(MainActivity.NOTE_TITLE_EXTRA,note.getTitle());
        intent.putExtra(MainActivity.NOTE_MESSAGE_EXTRA,note.getMessage());
        intent.putExtra(MainActivity.NOTE_CATEGORY_EXTRA,note.getCategory());
        intent.putExtra(MainActivity.NOTE_ID_EXTRA,note.getNoteId());
        startActivity(intent);

    }
}
