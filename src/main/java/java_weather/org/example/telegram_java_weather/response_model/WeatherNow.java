package java_weather.org.example.telegram_java_weather.response_model;

import com.github.prominence.openweathermap.api.model.weather.Weather;
import com.sun.tools.javac.Main;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


//Модель ответа
@Getter
@Setter
@NoArgsConstructor
public class WeatherNow {
    private List<Weather> weather;
    private Main main;
}
