package com.sankalpapps.courses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;



public class TwoFragment extends ListFragment {


    private ArrayList<Note> noteList;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        noteList = new ArrayList<>();
        noteList.add(new Note("Computers Programs","An Information Technology (IT) program will offer you the knowledge and dexterities to obtain a career in a rapidly growing field. A degree in IT will grant you the option of specializing in certain areas such as: networking, programming, security, or compliance. Pupils within these challenging and rewarding disciplines gain exposure to skills that are needed in today’s corporations, non-profits, state, and government agencies. Students can expect a rigorous curriculum that comprises of network topologies and architectures, various programming languages, server platforms, and security methods. A degree in Information Technology will open many doors and allow you the opportunity to obtain countless certifications.\n" +
                "\n" +
                "A degree in Information Technology is the key to a multi-layered, multi-dimensional, competitive, and ever-changing field. The degree is a highly-recognized achievement, and opens a portal to a variety of careers. Whether you are the type of person who desires to work outdoors or the person who adores the comforts of an office, Information Technology field offers career options. People with an IT degree work as systems administrators, network administrators, help desk technicians, software engineers, animators, instructors, and video game designers. Careers in Information Technology offer excitement, as well as competitive salaries and benefits packages.\n" +
                "\n" +
                "Information Technology offers a wide range of specializations such as: server administration, telecommunications, network engineering, automation, and much more. Regardless of the specialization you choose, an IT degree will build on your understanding of computers. You might already be the “neighborhood computer genius”; however, with a degree you will be the Information Technology expert for an entire organization. Imagine an entire company relying on your skills and expertise to keep its business afloat. With an IT degree, you could find a career in health-care, government, higher education, law, military, science, and much more.\n" +
                "\n" +
                "According to the Bureau of Labor and Statistics, “Information Technology occupations were paid higher wages than the U.S. average. The highest paid IT occupation was computer and information systems managers, which had a mean hourly wage of $54.75.” Information Technology will open a portal filled with both challenges and monetary incentives that you will reap for years to come.\n" +
                "\n" +
                "Today’s firms are seeking individuals who not only possess customer service, interpersonal, and management skills, but they desire people who have strong technical skills. The IT curriculum will help polish your technology and research skills, while training you to function as a productive team to complete major projects. Start a new chapter in your life by obtaining a highly respectable degree in one of the nation’s most lucrative and diverse fields, and you will become a part of an elite group of technology professionals. ", Note.Category.COMPUTER));
        noteList.add(new Note("Business and Management Programs","Whether you are about to graduate or already out in the work world, getting an MBA, or Masters in Business Administration, could be very beneficial for advancing your career. No matter what your situation, getting an MBA provides you with the skills you need in today’s competitive workforce. Before you can choose an MBA program, however, you need to understand what types of programs are out there and how to choose the one best for you. Here is a short summary of types of MBA programs, keys points to consider when choosing a program and major components of the MBA application process.\n" +
                "\n" +
                "Full-time v. Part-time\n" +
                "\n" +
                "Full-time MBA programs allow students to focus most of their time and energy on their coursework. Full-time students fund their education through scholarships, loans, employer tuition reimbursement programs or personal finances. It would be difficult to be a full-time MBA student and work at the same time, which is something each student must weigh when deciding what type of program to enter. There are two main types of full-time programs. Two-year programs allow students to take lighter course loads and spend time during the summer to get involved in internship programs and other short-term professional opportunities. Another full-time option is the one-year program. One-year programs offer advantages over their two-year counterparts in terms of time and money. An aggressive curriculum allows the coursework to be completed within 12 months, leaving an extra year for graduates to spend developing their careers. This shortened time spent in the classroom generally translates to lower tuition costs and one year less of sacrificing a salary to be a full-time student.\n" +
                "\n" +
                "Many schools offer part-time MBA programs, which allow students to both study and work. While this helps students finance their own studies as well as gain work experience, these programs take at least two years to complete. Sometimes, part-time programs are a mix of traditional and online courses while some offer all classes online.", Note.Category.MBA));
        noteList.add(new Note("Medical, Dental, and Other Professional Schools","For international students interested in U.S. professional schools (e.g., medical school, dental school, pharmacy school, and veterinary school), there are some substantial hurdles. Some of these programs do not accept international students at all, while others only accept small numbers. Even when these schools accept international students, they often require prepayment of substantial amounts of money equal to some or all of the tuition.\n" +
                "\n" +
                "If you are interested in attending a U.S. professional school, then it is important to be prepared even before starting an undergraduate program. Make sure that there are some that are realistic for you that would fit your needs. You may want to contact some admissions representatives at these schools. Here are some important questions to ask:\n" +
                "\n" +
                "Does your program accept international students? If so, is it more competitive for international students to be accepted than for U.S. students?\n" +
                "Do you require prepayment of tuition? It may also be helpful to ask how other international students have funded their studies. In some cases, students may be able to work during their studies. In pharmacy programs, for example, students sometimes sign contracts to work for pharmacy chain stores while in school and for a certain number of years afterwards in order to get financial help with their tuition. One option for highly competitive students is to combine a professional degree (such as an M.D. degree) with a Ph.D. These programs take longer, but the Ph.D. program generally provides funding for the M.D. degree.\n" +
                "What is the average G.P.A. (grade point average) and science/math G.P.A. of accepted students? They may give an alternate recommendation of a competitive G.P.A. for an international student because often international students must be even more qualified in order to be accepted.\n" +
                "What sort of experience do you expect students to have? Some programs require shadowing or internship experience in the field; others want research experience.\n" +
                "Are international students who graduate from your program able to obtain visas to work in the U.S.? If you plan to return home with your degree, then you need to make certain that your qualifications will be accepted. As an example, there are two types of medical schools in the U.S. Allopathic medical schools are traditional medical schools and graduates earn an M.D. degree. Osteopathic medical schools use a different philosophy (they teach traditional medical concepts along with osteopathic medical concepts) and graduates earn an O.D. degree. Osteopathic schools may be more willing to accept international students, but the degree is less well accepted in other countries.\n" +
                "What prerequisite courses are required? Many programs require an undergraduate degree for admission, although some require a sufficient number of prerequisite courses. The particular name on your undergraduate degree is less important than taking the right courses.\n" +
                "What sorts of residencies are popular with your graduates? This is primarily important for medical school.", Note.Category.HEALTH));
        noteList.add(new Note("Advanced Law Degrees","You have received your Master of Laws (LL.M.) degree and want to pursue further academic study in the field of law. What is the next step? For students planning a career in academic or other work that emphasizes legal scholarship, the logical step may be to apply to a doctoral program.\n" +
                "\n" +
                "Research and academic-based doctorate level degrees generally fall into four categories: Doctor of Jurisprudence (J.S.D); Doctor of Juridical Science (S.J.D.); Doctor of Comparative Law (D.C.L.); and Doctor of Philosophy (Ph.D.). According to the American Bar Association, approximately 20 American law schools offer doctoral degrees in law. Most of these programs are very small and exclusive, limiting enrollment to usually no more than one or two “extraordinary” or “exceptional” candidates per year.\n" +
                "\n" +
                "The application and degree requirements for these doctoral programs, however, can vary widely.\n" +
                "\n" +
                "At the outset, most, if not all doctoral programs, require prior completion of an LL.M. program, or its equivalent (a Juris Master, Master of Comparative Law, or Master of Jurisprudence). Some law schools, however, limit their doctoral admissions to only those applicants who have enrolled in, or completed their school’s own LL.M. program. In other words, if you complete your masters at Law School X, you may not be eligible for admission to Law School Y for your doctorate. Applicants who are considering a doctorate are well advised to factor this potential limitation into their decision-making process when applying to masters programs.\n" +
                "\n" +
                "A number of doctoral programs require each applicant to obtain the approval of a faculty member that he/she is willing to serve as the applicant’s faculty advisor and dissertation committee chairperson before the applicant applies to the program. Thus, it is imperative that any potential doctoral candidate evaluate doctoral programs carefully, weighing specific areas of academic interest against faculty specializations at each school. As an initial step, an applicant interested in researching and writing a dissertation should consider schools where there is a faculty member that has the same or similar interest or specialization. After narrowing down a list of potential schools, the applicant must engage in a certain amount of “self-marketing” to search for a faculty member at each school willing to support his or her doctoral application and candidacy.\n" +
                "\n" +
                "Once accepted, some doctoral programs require the candidate to pursue additional course work, whereas others do not. The University of Pittsburgh School of Law J.S.D. program, for example, is a research degree and there is no formal requirement for candidates to pursue additional course work. Other schools, such as the University of Virginia and Georgetown University, require candidates to complete a certain number of credit hours in courses or seminars.\n" +
                "\n" +
                "Most, if not all, doctoral programs require candidates to write a dissertation of publishable quality, that makes a significant, original contribution of long-term value to legal literature. In most programs, candidates must conduct their research under the close supervision of a full-time faculty member, a “faculty advisor”. Often, the candidate’s faculty advisor serves as chair of the candidate’s dissertation committee (a dissertation committee usually has between three and four members). Some doctoral programs require candidates to pass a formal “oral examination” administered by the dissertation committee on the student’s completed dissertation. Other schools require candidates to publicly defend the dissertation proposal, as well as the dissertation itself.\n" +
                "\n" +
                "Most programs require the candidate to complete their degree within 2-5 years, with the first year or two, depending on the particular school’s requirements, being “in residence”. Often, tuition for the year(s) “in residence” is charged based on the same rate as that which is charged for students enrolled in that school’s LL.M. program. Tuition beyond the year(s) “in residence” at some schools is charged based on a “full time dissertation credit rate,” which is substantially less.\n" +
                "\n" +
                "Few schools provide financial aid for doctoral studies. As financial aid is generally limited, some schools permit doctoral candidates to work part-time or full-time on-campus or off-campus upon a showing of need. For doctoral applicants with financial concerns, the availability of financial aid, grants, or the ability to work are considerations that must be taken into consideration before applying to specific doctoral programs.", Note.Category.LAW));
        noteList.add(new Note("Engineering","You’ve known it since you we’re a kid—you were meant to be an engineer.\n" +
                "\n" +
                "Maybe you used Lego pieces to build a robot, got your hands dirty rebuilding an engine, or used parts from an old clock and transistor radio to create a stereo sound system. You were a problem solver… and budding engineer.\n" +
                "\n" +
                "Engineers take math and science from paper and the lab to invent, design, and build things that matter. They are team players with independent minds who ask, “How can we make things better?” By dreaming up creative and practical solutions, engineers are constantly changing the world.\n" +
                "\n" +
                "Students interested in engineering careers should prepare themselves for studying engineering in college by taking a rigorous high school academic coursework that includes four years of mathematics (algebra, geometry, trigonometry, and pre-calculus) and two years of science (chemistry and physics). Completion of the SAT-1 or ACT is required. If English is not your native language, an official copy of the Test of English as a Foreign Language (TOEFL) report or the International English Language Testing System (IELTS) is also required.\n" +
                "\n" +
                "Now, all you have to do is find out which engineering field best fits your skills and interests. Exploratory pre-engineering programs are offered at many high schools. Colleges also offer summer educational programs in engineering and science, and many companies offer internships or summer jobs for students interested in learning more about engineering. Experiences like these will be invaluable in your career search.\n" +
                "\n" +
                "Following is a breakdown of a few areas of engineering:\n" +
                "\n" +
                "Environmental Engineers\n" +
                "\n" +
                "Environmental Engineering is the study of ways to protect the environment. Most of us care deeply about stopping pollution and protecting our natural resources. Imagine yourself having more than just a passion for saving our environment, but also possessing the actual know-how to do something about these alarming problems! As an environmental engineer, you’ll make a real difference in the survival of our planet by finding ways of cleaning up our oceans, rivers and drinking water, developing air pollution equipment, designing more effective recycling systems, or discovering safe ways to dispose of toxic waste.\n" +
                "\n" +
                "Geological and Geophysical Engineers\n" +
                "\n" +
                "Geological and Geophysical Engineering draws on the science of geology to study the earth. This field uses engineering principles to seek and develop deposits of natural resources and design foundations for large buildings, bridges, and other structures.\n" +
                "\n" +
                "Aerospace Engineers\n" +
                "\n" +
                "Aerospace Engineers design, analyze, model, simulate, and test aircraft, spacecraft, satellites, missiles, and rockets. Aerospace technology also extends to many other applications of objects moving within gases or liquids. Examples are golf balls, high-speed trains, hydrofoil ships, or tall buildings in the wind.\n" +
                "\n" +
                "Agricultural Engineers\n" +
                "\n" +
                "Agriculutural Engineers apply knowledge of engineering technology and science to agriculture and the efficient use of biological resources. In addition to creating advances in farming and agriculture, agricultural engineers apply engineering design and analysis to protecting natural resources, develop power systems to support agriculture, and provide environmental controls.\n" +
                "\n" +
                "Bioengineers\n" +
                "\n" +
                "Bioengineers study living systems and apply that knowledge to solve various problems. They study the safety of food supplies, keep desirable organisms alive in fermentation processes, and design biologically based sensors. Bioengineering is widely used to destroy wastes and clean up contaminated soil and water.\n" +
                "\n" +
                "Ceramic and Material Engineers\n" +
                "\n" +
                "Ceramic and Material Engineers solve problems by relying on their creative and technical skills—making useful products in many forms from common as well as exotic materials. Each time we talk on the phone, use a computer, or heat food in a microwave oven, we use products made possible by the inventions and designs of engineers working with ceramics and other materials.\n" +
                "\n" +
                "Chemical Engineers\n" +
                "\n" +
                "Chemical Engineers discover and manufacture better plastics, paints, fuels, fibers, medicines, fertilizers, semiconductors, paper, and all other kinds of chemicals. Chemical Engineers also play an important role in protecting the environment, inventing cleaner technologies, calculating environmental impacts, and studying the fate of chemicals in the environment.\n" +
                "\n" +
                "Civil Engineers\n" +
                "\n" +
                "Civil Engineers oversee the construction of the buildings and infrastructure that make up our world: highways, skyscrapers, railways, bridges, and water reservoirs, as well as some of the most spectacular and high profile of all engineering feats.\n" +
                "\n" +
                "Computer Engineers\n" +
                "\n" +
                "Computer Engineering is the design, construction, implementation, and maintenance of computers and computer controlled equipment for the benefit of humankind. Most universities offer computer engineering as either a degree program of its own or as a sub-discipline of electrical engineering.\n" +
                "\n" +
                "Electrical Engineers\n" +
                "\n" +
                "Electrical Engineers develop components for some of the most fun things in our lives (MP3 players, digital cameras, or roller coasters) as well as the most essential (medical tests or communications systems). This largest field of engineering encompasses the macro as well as the micro. As an electrical engineer, you might work on robotics, computer networks, wireless communications, or medical imaging—areas that are at the very forefront of technological innovation.\n" +
                "\n" +
                "Industrial Engineers\n" +
                "\n" +
                "Industrial Engineers determine the most effective ways to use people, machines, materials, information, and energy to make a product or to provide a service. Although most industrial engineers work in manufacturing industries, they may also work in consulting services, healthcare, and communications.\n" +
                "\n" +
                "Manufacturing Engineers\n" +
                "\n" +
                "Manufacturing Engineers direct and coordinate the processes for making things—from the beginning to the end. As businesses try to make products better and at less cost, they turn to manufacturing engineers to find out how. Machine vision and robotics are some of the more advanced technologies in the manufacturing engineer’s toolkit.\n" +
                "\n" +
                "Mechanical Engineers\n" +
                "\n" +
                "Mechanical Engineers are often referred to as the general practitioners of the engineering profession, since they work in nearly every area of technology, from aerospace and automotive to computers and biotechnology.\n" +
                "\n" +
                "Nuclear Engineers\n" +
                "\n" +
                "Nuclear Engineers harness the power of the atom to benefit humankind. They search for efficient ways to capture and put to beneficial use those tiny natural bursts of energy resulting from sub-atomic particles that break apart molecules.\n" +
                "\n" +
                "Petroleum Engineers\n" +
                "\n" +
                "Petroleum Engineers study the earth to find oil and gas reservoirs. They design oil wells, storage tanks, and transportation systems. They supervise the construction and operation of oil and gas fields. Petroleum engineers help supply the world’s need for energy and chemical raw materials.", Note.Category.ENINEERING));

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
