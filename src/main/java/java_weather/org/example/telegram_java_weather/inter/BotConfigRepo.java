package java_weather.org.example.telegram_java_weather.inter;

import java_weather.org.example.telegram_java_weather.BotConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
//пустой интерфейс
public interface BotConfigRepo extends MongoRepository<BotConfig, BigInteger> {

}
