package gr.aueb.cf.OOPProjects.course.chapter16.defaultmehtods;

public class CodingFactory implements IWelcome {
    @Override
    public void saySomething(String message) {
        System.out.println(message);
    }

    @Override
    public void sayHelloCoding() {
        IWelcome.super.sayHelloCoding();
        System.out.println("\u2764".repeat(5)); //black heart
    }
}
