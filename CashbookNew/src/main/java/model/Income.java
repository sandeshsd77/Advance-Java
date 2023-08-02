package model;

import lombok.ToString;

import java.sql.Date;
import java.sql.Time;

public class Income {
    private int id;
    private Date date;
    private Time time;
    private int amount;
    private String remarks;
    private String category;
    private String paymentMode;

    @ToString.Exclude
    private int userId;
}
