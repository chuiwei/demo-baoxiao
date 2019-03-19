package com.newrunway.baoxiao.entity;

import org.springframework.data.annotation.Id;

public class Bankcard {
    @Id
    private String id;
    private String bankcardName;
    private String bankcardNo;
    private String bankOfDeposit;

    public String getBankcardName() {
        return bankcardName;
    }

    public void setBankcardName(String bankcardName) {
        this.bankcardName = bankcardName;
    }

    public String getBankcardNo() {
        return bankcardNo;
    }

    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo;
    }

    public String getBankOfDeposit() {
        return bankOfDeposit;
    }

    public void setBankOfDeposit(String bankOfDeposit) {
        this.bankOfDeposit = bankOfDeposit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
