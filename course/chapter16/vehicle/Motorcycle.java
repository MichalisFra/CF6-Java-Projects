package gr.aueb.cf.OOPProjects.course.chapter16.vehicle;

public class Motorcycle implements IVehicle{


    @Override
    public void start() {
        System.out.println("Motorcycle was started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle has stopped.");
    }
}
