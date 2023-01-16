package java_weather.org.example.telegram_java_weather;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

public interface BotConfigRepo extends MongoRepository<BotConfig, BigInteger> {

}
