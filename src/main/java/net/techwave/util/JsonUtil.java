package net.techwave.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.techwave.model.StockQuote;

public interface JsonUtil
{

    static String toJson(StockQuote stockQuote){
        try {
            return new ObjectMapper().writeValueAsString(stockQuote);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}