package observer;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/14
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 * Description: 布告板实现
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {


    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}