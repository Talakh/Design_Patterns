package creational.factoryMethod.interviewers;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class Developer implements Interviewer {
    @Override
    public String askQuestions() {
        return "Asking about design patterns";
    }
}
