package pl.zzpj.solid.ocp.usa.solution;

public class SCSpeedLimitFines implements SpeedLimitFines{
    private static final int SC_MAX_SPEED = 70;
    private static final double SC_FINE_PER_MPH_OVER = 5.0;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        if (speed > SC_MAX_SPEED) {
            return (speed - SC_MAX_SPEED) * SC_FINE_PER_MPH_OVER;
        }
        return 0;
    }
}
