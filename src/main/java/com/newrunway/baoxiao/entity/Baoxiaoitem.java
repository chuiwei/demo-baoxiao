package com.newrunway.baoxiao.entity;

import org.springframework.data.annotation.Id;

public class Baoxiaoitem {
    @Id
    private String id;
    private String name;
    private String num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
