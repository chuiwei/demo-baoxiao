package com.newrunway.baoxiao.service.bankcard;

import com.newrunway.baoxiao.entity.Bankcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankcardServiceImpl implements BankcardService {
    @Autowired
    private BankcardRepository bankcardRepository;
    @Override
    public void save(Bankcard bankcard) {
        bankcardRepository.save(bankcard);
    }
}
