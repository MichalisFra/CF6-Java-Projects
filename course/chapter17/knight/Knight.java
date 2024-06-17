package gr.aueb.cf.OOPProjects.course.chapter17.knight;

public class Knight implements IKnight{


    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();
    }
}
