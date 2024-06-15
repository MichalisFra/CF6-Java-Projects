package gr.aueb.cf.OOPProjects.exercises.ch13;

public class PointMain {

    public static void main(String[] args) {

        Point myPoint = new Point(10,20,3);

        System.out.println("XY Distance: "+ myPoint.getXYDistance());
        System.out.println("YZ Distance: "+ myPoint.getYZDistance());
        System.out.println("XZ Distance: "+ myPoint.getXZDistance());
        System.out.println(myPoint.getXYZDistance());



    }
}
