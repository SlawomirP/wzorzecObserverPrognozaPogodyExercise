package WeatherForecastExercise.media;

import WeatherForecastExercise.interfaces.Observer;
import WeatherForecastExercise.observableObject.WeatherForecast;

public class Tv implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TV weatherforecast -> temperature: " + weatherForecast.getTemperature() + ", pressure: "+
                weatherForecast.getPressure());
    }
}
