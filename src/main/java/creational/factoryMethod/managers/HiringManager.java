package creational.factoryMethod.managers;

import creational.factoryMethod.interviewers.Interviewer;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public abstract class HiringManager {
    abstract Interviewer makeInterviewer();
    public String takeInterview(){
        Interviewer interviewer = makeInterviewer();
        return interviewer.askQuestions();
    }
}
