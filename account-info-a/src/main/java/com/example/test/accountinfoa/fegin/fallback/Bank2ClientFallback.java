package com.example.test.accountinfoa.fegin.fallback;

import com.example.test.accountinfoa.fegin.Bank2Client;
import org.springframework.stereotype.Component;

@Component
public class Bank2ClientFallback implements Bank2Client {
    @Override
    public String transfer(Double amount) {
        return "Fallback";
    }
}
