package java_weather.org.example.telegram_java_weather;

import java_weather.org.example.telegram_java_weather.enu.BotState;
import java_weather.org.example.telegram_java_weather.inter.ChatConfigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatConfigService {
    @Autowired
    private ChatConfigRepo chatConfigRepo;
    public boolean isChatInit(Long chatId){
        return chatConfigRepo.findAllByChatId(chatId) !=null;
    }

    //создание нового чата
    public void initChat(Long chatId){
        chatConfigRepo.save(new ChatConfig(chatId, BotState.DEFAULT));
    }
    public void deleteChat(Long chatId){
        chatConfigRepo.deleteByChatId(chatId);
    }

    public void setBotState(Long chatId,BotState botState){
        ChatConfig chatConfig=chatConfigRepo.findAllByChatId(chatId);
        chatConfig.setCity(chatConfig.getCity());
        chatConfigRepo.save(chatConfig);
    }

    public String getCity(Long chatId){
        return chatConfigRepo.findAllByChatId(chatId).getCity();
    }
}
