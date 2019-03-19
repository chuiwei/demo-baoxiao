package com.newrunway.baoxiao.controller;

import com.newrunway.baoxiao.entity.Baoxiaoitem;
import com.newrunway.baoxiao.service.BaoxiaoitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private BaoxiaoitemService baoxiaoitemService;

    @GetMapping("/findByName")
    public Baoxiaoitem findByName(@RequestParam("name") String name){
        Baoxiaoitem result = baoxiaoitemService.findByName(name);
        return result;
    }
}
