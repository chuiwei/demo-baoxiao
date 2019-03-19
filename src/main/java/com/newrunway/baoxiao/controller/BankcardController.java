package com.newrunway.baoxiao.controller;

import com.newrunway.baoxiao.entity.Bankcard;
import com.newrunway.baoxiao.service.bankcard.BankcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankcard")
public class BankcardController {

    @Autowired
    private BankcardService bankcardService;
    @PostMapping("/register")
    public Object register(Bankcard bankcard){
        bankcardService.save(bankcard);
        return bankcard;
    }
}
