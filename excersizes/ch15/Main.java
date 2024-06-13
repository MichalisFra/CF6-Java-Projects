package gr.aueb.cf.OOPProjects.excersizes.ch15;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(4);

        System.out.println("P1: " +p1.getDistanceFromOrigin());
        System.out.println("P1: " +PointUtil.distanceFromOrigin(p1));

        Point p2 = new Point2D(4, 2);


        System.out.println("P2: "+p2.getDistanceFromOrigin());
        System.out.println("P2: " +PointUtil.distanceFromOrigin(p2));

        Point p3 = new Point3D(4, 2, 2);

        System.out.println("P3: " +p3.getDistanceFromOrigin());
        System.out.println("P3: " +PointUtil.distanceFromOrigin(p3));


    }
}

