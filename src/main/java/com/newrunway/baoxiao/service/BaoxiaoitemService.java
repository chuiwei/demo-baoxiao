package com.newrunway.baoxiao.service;

import com.newrunway.baoxiao.entity.Baoxiaoitem;
import org.springframework.stereotype.Repository;

@Repository
public interface BaoxiaoitemService {
    void save(Baoxiaoitem baoxiaoitem);
    Baoxiaoitem findByName(String name);
}
