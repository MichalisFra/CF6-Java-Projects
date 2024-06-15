package gr.aueb.cf.OOPProjects.excersizes.ch16_shape_interfaces.model_exc1;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.setId();

        Line line = new Line(10D);
        line.setId();


        Rectangle rectangle = new Rectangle(2,3);
        rectangle.setId();


        System.out.println(circle);
        System.out.println(line);
        System.out.println(rectangle);

    }

}
