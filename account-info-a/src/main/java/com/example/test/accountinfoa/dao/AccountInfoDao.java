package com.example.test.accountinfoa.dao;

import com.example.test.accountinfoa.pojo.AccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountInfoDao extends JpaRepository<AccountInfo, Integer> {
    @Modifying
    @Query("update AccountInfo set accountBalance = accountBalance +?1 where accountNo=?2")
    void updateAccountBalance(Double amount, String accountNo);
}
