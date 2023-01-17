package java_weather.org.example.telegram_java_weather.response_model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Weather {
    private String main;
    private String description;
}
