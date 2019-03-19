package com.newrunway.baoxiao.service.bankcard;

import com.newrunway.baoxiao.entity.Bankcard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankcardRepository extends MongoRepository<Bankcard, String> {
}
