package com.example.test.accountinfoa.service.impl;


import com.example.test.accountinfoa.dao.AccountInfoDao;
import com.example.test.accountinfoa.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    private AccountInfoDao accountInfoDao;

    @Transactional
    @Override
    public void updateAccountBalance(String accountNo, Double amount) {
        // 李四增加金额
        accountInfoDao.updateAccountBalance(accountNo, amount);
        if (amount == 6) {
            int i = 1 / 0;
        }
    }
}
