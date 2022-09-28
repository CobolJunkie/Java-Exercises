package com.coboljunkie.MasterClassUdemy.Banking;

public class Accountmgr {
    public static void main(String[] args) {
    Account account1 = new Account(10001,"Bob", "Wheeler","bob@wheeler.com","555-117",0);
    System.out.println(account1.GetBalance());
    account1.deposit(209);
    account1.deposit(109);
    account1.deposit(49);
    System.out.println(account1.GetBalance());
    account1.withdrawal(10000);
    System.out.println(account1.GetBalance());
    }
}
