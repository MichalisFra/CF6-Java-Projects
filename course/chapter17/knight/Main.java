package gr.aueb.cf.OOPProjects.course.chapter17.knight;

public class Main {

    public static void killTheDragon() {
        System.out.println("Kill the dragon");
    }

    public static void saveThePrincess() {
        System.out.println("Save the princess");
    }

    public static void main(String[] args) {
        IKnight mario = new Knight();
        IKnight stGeorge = new Knight();

        mario.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the princess.");
            }
        });

        stGeorge.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                killTheDragon();
            }
        });

        /**
         * It works ONLY for a Functional Interface like {@link IMission}
         */
        mario.embarkOnMission(() -> System.out.println("Save the princes λ") );
        stGeorge.embarkOnMission(() -> killTheDragon());

        stGeorge.embarkOnMission(Main::killTheDragon); //method reference
        mario.embarkOnMission(Main::saveThePrincess);
    }


}
