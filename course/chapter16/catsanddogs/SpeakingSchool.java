package gr.aueb.cf.OOPProjects.course.chapter16.catsanddogs;

public class SpeakingSchool {
    private final Cat cat = new Cat();

    public SpeakingSchool() {

    }

    public void learnToSpeak() {
        cat.speak();
    }
}
