package net.techwave.model;

import lombok.Data;

import java.util.Date;

@Data
public class StockQuote
{
    private Integer id;
    private String stockCode;
    private Double sharePrice;
    private Date serviceDate;
}
