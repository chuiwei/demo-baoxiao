package com.newrunway.baoxiao.service;

import com.newrunway.baoxiao.entity.Baoxiaoitem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BaoxiaoitemRepository extends MongoRepository<Baoxiaoitem, String> {
    Baoxiaoitem findByName(String name);
}
