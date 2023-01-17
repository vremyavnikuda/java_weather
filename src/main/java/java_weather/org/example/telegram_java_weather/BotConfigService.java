package java_weather.org.example.telegram_java_weather;
import java_weather.org.example.telegram_java_weather.inter.BotConfigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


//класс для работы с конфигурацией бота
@Service
public class BotConfigService {

    @Autowired
    //пустой интерфейс, наследуемый от MongoRepository<BotConfig, BigInteger>
    private BotConfigRepo botConfigRepo;

    public String getTelegramCallbackAnswerTemp(){
        return this.botConfigRepo.findAll().get(0).getTelegramCallbackAnswerTemp();
    }

    public String getNowApiTemp(){
        return this.botConfigRepo.findAll().get(0).getNowWeatherApiTemp();
    }

    public List<Command> getAllCommands(){
        return botConfigRepo.findAll().get(0).getCommands();
    }

    public String getBotUsername(){
        return botConfigRepo.findAll().get(0).getName();
    }

    public String getBotAccessToken(){
        return botConfigRepo.findAll().get(0).getAccessToken();
    }
}
