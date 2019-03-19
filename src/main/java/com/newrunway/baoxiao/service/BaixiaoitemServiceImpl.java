package com.newrunway.baoxiao.service;

import com.newrunway.baoxiao.entity.Baoxiaoitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaixiaoitemServiceImpl implements BaoxiaoitemService{
    @Autowired
    private BaoxiaoitemRepository baoxiaoitemRepository;
    public void save(Baoxiaoitem baoxiaoitem){
        baoxiaoitemRepository.save(baoxiaoitem);
    }
    public Baoxiaoitem findByName(String name){
       return baoxiaoitemRepository.findByName(name);
    }
}
