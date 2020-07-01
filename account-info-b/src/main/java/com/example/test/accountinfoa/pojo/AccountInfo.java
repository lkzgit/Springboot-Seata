package com.example.test.accountinfoa.pojo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
public class AccountInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private String accountName;
    @Column
    private String accountNo;
    @Column
    private String accountPassword;
    @Column
    private double accountBalance;
}
