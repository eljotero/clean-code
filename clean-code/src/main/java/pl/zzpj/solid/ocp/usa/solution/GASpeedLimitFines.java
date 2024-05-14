package pl.zzpj.solid.ocp.usa.solution;


public class GASpeedLimitFines implements SpeedLimitFines {
    private static final int GA_MAX_SPEED = 80;
    private static final double GA_FINE_PER_MPH_OVER = 3.0;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        if (speed > GA_MAX_SPEED) {
            return (speed - GA_MAX_SPEED) * GA_FINE_PER_MPH_OVER;
        }
        return 0;
    }
}