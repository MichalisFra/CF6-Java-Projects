package gr.aueb.cf.OOPProjects.exercises.ch16_shape_interfaces.model_exc1;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                " id= " + getId() +
                ", width= " + width +
                ", height= " + height;
    }
}
