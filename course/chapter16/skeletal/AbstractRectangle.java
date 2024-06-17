package gr.aueb.cf.OOPProjects.course.chapter16.skeletal;

public abstract class AbstractRectangle implements IRectangle {

    private double width;
    private double height;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public boolean isSquare() {
        return width==height;
    }
}