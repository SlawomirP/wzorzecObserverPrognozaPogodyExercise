package WeatherForecastExercise.media;

import WeatherForecastExercise.interfaces.Observer;
import WeatherForecastExercise.observableObject.WeatherForecast;

public class Radio implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio weatherforecast -> temperature: " + weatherForecast.getTemperature() + ", pressure: "+
                weatherForecast.getPressure());
    }
}
