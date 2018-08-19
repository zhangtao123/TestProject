package observer.display;

import observer.DisplayElement;
import observer.Observer;
import observer.Subject;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/14
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Forecast: Improving weather on the way!");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}