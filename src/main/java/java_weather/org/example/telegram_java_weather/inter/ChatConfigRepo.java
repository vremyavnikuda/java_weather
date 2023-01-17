package java_weather.org.example.telegram_java_weather.inter;

import java_weather.org.example.telegram_java_weather.ChatConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

public interface ChatConfigRepo extends MongoRepository<ChatConfig, BigInteger> {
    ChatConfig findAllByChatId(Long chatId);
    void deleteByChatId(Long chatId);
}
