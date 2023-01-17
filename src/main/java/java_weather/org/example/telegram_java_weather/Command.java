package java_weather.org.example.telegram_java_weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Command {

    //команды бота
    private String name;

    //ответ бота
    private String description;
}
