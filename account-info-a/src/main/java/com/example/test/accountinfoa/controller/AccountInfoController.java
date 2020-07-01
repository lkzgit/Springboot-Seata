package com.example.test.accountinfoa.controller;

import com.example.test.accountinfoa.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author HanLiBin
 * @version V1.0
 */
@RestController
public class AccountInfoController {
    @Autowired
    private AccountInfoService accountInfoService;

    @GetMapping("/bank1/transfer/{amount}")
    public String transfer(@PathVariable Double amount) {
        accountInfoService.updateAccountBalance("1", amount);
        return "bank1-" + amount;
    }
}
