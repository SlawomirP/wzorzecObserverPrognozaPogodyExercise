package WeatherForecastExercise.media;

import WeatherForecastExercise.interfaces.Observer;
import WeatherForecastExercise.observableObject.WeatherForecast;

public class Internet implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet weatherforecast -> temperature: " + weatherForecast.getTemperature() + ", pressure: "+
                weatherForecast.getPressure());
    }
}
