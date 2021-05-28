package net.techwave.producer;

import net.techwave.model.StockQuote;
import net.techwave.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService
{
    @Value("${my.app.topic.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate template;

    public void sendData(StockQuote stockQuote){
        String jsonData = JsonUtil.toJson(stockQuote);
        template.send(topicName,jsonData);
    }
}
