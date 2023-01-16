package java_weather.org.example.telegram_java_weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "bot_config")


public class BotConfig {
    @Id
    private BigInteger id;

    //имя бота
    private String name;

    //токен telegram
    private String accessToken;

    //шаблон API ссылки (получать данный о текущей погоде)
    //http://api.openweathermap.org/data/2.5/weather?q={city}&appid={key}&units=metric&lang=ru
    private String nowWeatherAPIToken;

    //кнопки перенаправления пользователя на сторонние ресурсы
    //https://api.telegram.org/bot{token}/answerCallbackQuery?callback_query_id={id}
    private String telegramCallbackAnswerTemp;

    //место, где будут храниться наши команды бота
    private List<Command>commands;
    private String nowWeatherApiTemp;

    public String getNowWeatherApiTemp() {
        return nowWeatherApiTemp;
    }

    public void setNowWeatherApiTemp(String nowWeatherApiTemp) {
        this.nowWeatherApiTemp = nowWeatherApiTemp;
    }
}
