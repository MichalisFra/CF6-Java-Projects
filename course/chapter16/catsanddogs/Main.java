package gr.aueb.cf.OOPProjects.course.chapter16.catsanddogs;

public class Main {

    public static void main(String[] args) {
        ISpeakable alice = new Cat("Alice");

        ISpeakable bob = new Dog("Bob", 3D);

        alice.speak();
        bob.speak();
    }

    public static void doSpeak(ISpeakable speakable) {
        speakable.speak();
    }
}
