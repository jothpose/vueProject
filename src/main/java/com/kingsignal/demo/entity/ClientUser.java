package com.kingsignal.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class ClientUser implements Serializable {
    private String account;
    private String passWord;
    private Date birthday;
}
