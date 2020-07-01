package com.example.test.accountinfoa.service.impl;


import com.example.test.accountinfoa.dao.AccountInfoDao;
import com.example.test.accountinfoa.fegin.Bank2Client;
import com.example.test.accountinfoa.service.AccountInfoService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    private Bank2Client bank2Client;
    @Autowired
    private AccountInfoDao accountInfoDao;

    @Transactional
    @GlobalTransactional
    @Override
    public void updateAccountBalance(String accountNo, Double amount) {
        // 扣减张三金额
        accountInfoDao.updateAccountBalance(amount * -1, accountNo);
        // 调用李四微服务，进行转账
        String transfer = bank2Client.transfer(amount);
        if ("Fallback".equals(transfer)) {
            throw new RuntimeException("调用李四的服务转账失败");
        }
        if (amount == 3) {
            int i = 1 / 0;
        }
    }
}
