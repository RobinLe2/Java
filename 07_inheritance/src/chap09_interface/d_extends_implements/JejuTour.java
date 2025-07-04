package chap09_interface.d_extends_implements;

public class JejuTour extends Domestic implements Trip {
    @Override
    public void foodTrip() {
        System.out.println("고등어");
    }

    @Override
    public void sightseeing() {
        System.out.println("제주");
    }
}
