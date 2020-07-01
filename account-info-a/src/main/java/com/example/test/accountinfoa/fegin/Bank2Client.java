package com.example.test.accountinfoa.fegin;


import com.example.test.accountinfoa.fegin.fallback.Bank2ClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "account-info-b", fallback = Bank2ClientFallback.class)
public interface Bank2Client {

    @RequestMapping("/bank2/transfer")
    public String transfer(@RequestParam("amount") Double amount);
}
