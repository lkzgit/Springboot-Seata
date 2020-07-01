package com.example.test.accountinfoa.controller;

import com.example.test.accountinfoa.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author HanLiBin
 * @version V1.0
 */
@RestController
public class AccountInfoController {
    @Autowired
    private AccountInfoService accountInfoService;

    @GetMapping("/bank2/transfer")
    public String transfer(@RequestParam("amount") Double amount) {
        accountInfoService.updateAccountBalance("2", amount);
        return "bank2-" + amount;
    }
}
