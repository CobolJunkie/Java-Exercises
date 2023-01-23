package com.coboljunkie.mcu.banking;

class Account {
    private int account_number;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerPhoneNumber;
    private double balance = 0;

    public Account(){
        System.out.println("Empty Constructor called");
    }

    public Account(int account_number, String customerFirstName, String customerLastname, String customerEmail, String customerPhoneNumber, double balance) {
        this.account_number = account_number;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.balance = balance;
    }

    public void deposit(double deposit) {
        System.out.println("Original Balance" + balance);
        System.out.println("Deposit Value +" + deposit);
        balance = balance + deposit;
        System.out.println("Final Balance:" + balance);

    }

    public void withdrawal(double amount) {
    if( balance >= amount){
        System.out.println("Original Balance" + balance);
        System.out.println("Withdrawal Value -" + amount);
        balance = balance - amount;
        System.out.println("Balance remaining:" + balance);
    }
    else{
        System.out.println("Insufficient Balance:" + balance);
        System.out.println("Transaction cancelled");
    }

    }

    public double GetBalance() {
        return balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

}