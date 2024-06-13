package gr.aueb.cf.OOPProjects.course.chapter16.defaultmehtods;

public interface IWelcome {
    void saySomething(String message);

    default void sayHelloCoding(){
        System.out.print("Hello");
        sayCoding();
    }

    private void sayCoding() {
        System.out.println("Coding");
    }

    static void sayHelloCF() {
        System.out.print("Hello");
        IWelcome.sayCF();
    }
    private static void sayCF() {
        System.out.println("CF");
    }
}
