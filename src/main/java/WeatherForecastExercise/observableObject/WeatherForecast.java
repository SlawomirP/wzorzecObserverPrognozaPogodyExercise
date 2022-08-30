package WeatherForecastExercise.observableObject;

import WeatherForecastExercise.interfaces.Observable;
import WeatherForecastExercise.interfaces.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable{

    private int temperature;
    private int pressure;
    private Set<Observer> registeredObserver;

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.registeredObserver = new HashSet<>();
    }
    public void updateForecast(int updateTemperature, int updatePressure){
        this.temperature = updateTemperature;
        this.pressure = updatePressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.registeredObserver.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.registeredObserver.remove(observer);

    }

    @Override
    public void notifyObservers() {
        registeredObserver.stream()
                .forEach(observer -> observer.updateForecast(this));
    }

    public int getTemperature() {
        return this.temperature;
    }

    public int getPressure() {
        return this.pressure;
    }
}
