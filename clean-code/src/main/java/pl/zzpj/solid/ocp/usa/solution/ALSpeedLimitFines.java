package pl.zzpj.solid.ocp.usa.solution;

public class ALSpeedLimitFines implements SpeedLimitFines{
    private static final int AL_MAX_SPEED = 75;
    private static final double AL_FINE_PER_MPH_OVER = 4.0;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        if (speed > AL_MAX_SPEED) {
            return (speed - AL_MAX_SPEED) * AL_FINE_PER_MPH_OVER;
        }
        return 0;
    }
}
