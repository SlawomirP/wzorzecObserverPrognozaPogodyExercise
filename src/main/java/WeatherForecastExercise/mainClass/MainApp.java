package WeatherForecastExercise.mainClass;

import WeatherForecastExercise.media.Internet;
import WeatherForecastExercise.media.Radio;
import WeatherForecastExercise.media.Tv;
import WeatherForecastExercise.observableObject.WeatherForecast;

public class MainApp {
    public static void main(String[] args) {
        WeatherForecast weatherForecast1 = new WeatherForecast(25, 1003);

        Tv tv = new Tv();
        Radio radio = new Radio();
        Internet internet = new Internet();

        weatherForecast1.registerObserver(tv);
        weatherForecast1.registerObserver(radio);
        weatherForecast1.registerObserver(internet);

        weatherForecast1.notifyObservers();
        System.out.println();

        weatherForecast1.updateForecast(1, 1500);

        weatherForecast1.notifyObservers();
        System.out.println();
        weatherForecast1.unregisterObserver(tv);
        weatherForecast1.updateForecast(25, 1002);
        weatherForecast1.notifyObservers();


    }
}
