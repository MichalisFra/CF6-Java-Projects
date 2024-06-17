package gr.aueb.cf.OOPProjects.course.chapter16.skeletal2;

public class Square extends AbstractRectangle implements ISquare{
    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(),2) + Math.pow(getHeight(),2));
    }
}
