package creational.factoryMethod.managers;

import creational.factoryMethod.interviewers.Developer;
import creational.factoryMethod.interviewers.Interviewer;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class DevelopmentManager extends HiringManager {
    @Override
    Interviewer makeInterviewer() {
        return new Developer();
    }
}
