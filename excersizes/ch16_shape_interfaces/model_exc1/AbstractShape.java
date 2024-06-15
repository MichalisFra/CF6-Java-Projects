package gr.aueb.cf.OOPProjects.excersizes.ch16_shape_interfaces.model_exc1;


import java.util.Random;


public abstract class AbstractShape implements  IShape{
    private long id;
    private static final Random random = new Random(System.currentTimeMillis());

    public void setId(){
        this.id = Math.abs(random.nextLong());
    }

    @Override
    public long getId() {
        return id;
    }
}
