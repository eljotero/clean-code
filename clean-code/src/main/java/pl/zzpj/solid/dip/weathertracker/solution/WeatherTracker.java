package pl.zzpj.solid.dip.weathertracker.solution;

public class WeatherTracker {
    private Phone phone;
    private Emailer emailer;
    private String currentConditions;

    public WeatherTracker(Phone phone, Emailer emailer) {
        this.phone = phone;
        this.emailer = emailer;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}