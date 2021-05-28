package net.techwave.rest;

import net.techwave.model.StockQuote;
import net.techwave.producer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sq")
public class StockQuoteRestController
{
    @Autowired
    private ProducerService service;

    @PostMapping("/send")
    public ResponseEntity<String> sendToProducer(@RequestBody StockQuote stockQuote){
        service.sendData(stockQuote);
        return ResponseEntity.ok("SENT TO KAFKA");
    }
}
