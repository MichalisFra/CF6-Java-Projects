package gr.aueb.cf.OOPProjects.excersizes.ch16_shape_interfaces.exc2;

public class Main {
    public static void main(String[] args) {

        Rectangle square = new Rectangle(2,2);
        Circle circle = new Circle(10.0);
        Circle circ2 = new Circle(20);
        Line line = new Line(50.0);

        System.out.println(square);
        System.out.println(circle);
        System.out.println(circ2);
        System.out.println(line);
    }
}
