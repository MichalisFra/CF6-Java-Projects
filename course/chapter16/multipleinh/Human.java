package gr.aueb.cf.OOPProjects.course.chapter16.multipleinh;

public class Human implements ISpeakable, IReadable{
    @Override
    public void read() {
        System.out.println("I'm reading");
    }

    @Override
    public void speak() {
        System.out.println("I'm speaking");
    }
}
