package WeatherForecastExercise.interfaces;

import WeatherForecastExercise.observableObject.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatcherForecast);
}
