package gr.aueb.cf.OOPProjects.excersizes.ch16_shape_interfaces.exc2;

/**
 * Circle represents a geometric shape with a radius, diameter, area, and circumference.
 * It extends {@link AbstractShape} and implements {@link ICircle} interface.
 */
public class Circle extends  AbstractShape implements ICircle{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        setId();
    }

    @Override
    public double getDiameter() {
        return 2*radius;
    }

    @Override
    public double getArea() {
        return 3.14*Math.pow(radius,2);
    }

    @Override
    public long getCircumference() {
        return (long) (2*3.14*radius);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "id = " + getId() +
                ", radius = " + radius +
                ", area = " + getArea() +
                ", circumference = " + getCircumference() +
                '}';
    }
}
