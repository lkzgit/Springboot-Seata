package com.example.test.accountinfoa.dao;

import com.example.test.accountinfoa.pojo.AccountInfo;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountInfoDao extends JpaRepository<AccountInfo, Integer> {

    @Modifying
    @Query("update AccountInfo set accountBalance = accountBalance +?2 where accountNo=?1")
    void updateAccountBalance(String accountNo, Double amount);
}
