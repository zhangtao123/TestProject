package observer;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/14
 * Time: 15:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        /*目前状况布告板*/
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        /*统计布告板*/
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        /*预测布告板*/
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}