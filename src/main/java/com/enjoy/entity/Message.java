package com.enjoy.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Message {
    private Long id;    //id

    private String msg; //消息

    private Date sendTime;  //时间戳
}

