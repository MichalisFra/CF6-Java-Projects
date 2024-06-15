package gr.aueb.cf.OOPProjects.excersizes.ch16_shape_interfaces.exc2;


/**
 * Rectangle represents a geometric shape with width, height, area, and circumference.
 * It extends {@link AbstractShape} and implements {@link IRectangle} interface.
 */
public class Rectangle extends AbstractShape implements IRectangle{
    private final double width;
    private final double height;

    /**
     * Constructor
     * @param width
     * @param height
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        setId();
    }


    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public long getCircumference() {
        return (long) (2*width + 2*height);
    }


    @Override
    public String toString() {
        return "Rectangle {" +
                "id = " + getId() +
                ", width = " + width +
                ", height = " + height +
                ", area = " + getArea() +
                ", circumference = " + getCircumference() +
                '}';
    }
}
