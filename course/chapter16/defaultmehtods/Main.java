package gr.aueb.cf.OOPProjects.course.chapter16.defaultmehtods;

public class Main {
    public static void main(String[] args) {

        IWelcome welcomeCF = new CodingFactory();

        welcomeCF.sayHelloCoding();
        welcomeCF.saySomething("Harro!");
    }
}
