package com.class18;

public class Account {
    private double actualAccBalance;
    public double AccBalance;
    private String userName;
    private String password;
    String actualPassword;
    String actualUserName;
    public boolean login(String enterUserName,String enteredPassword){

        return (userName.equals(actualUserName)&&password.equals(actualPassword));
    }
    public boolean signUp(String enterUserName,String enteredPassword,double AccBalance){
        if(enterUserName.length()>15){
            return false;
        }else{
            actualUserName=enterUserName;
            actualPassword=enteredPassword;
            actualAccBalance=AccBalance;
            return true;
        }
    }
    boolean transferFund(String password,double enterAccountBalance){
        if(actualAccBalance>=enterAccountBalance&&password.equals(actualPassword)){
            actualAccBalance=actualAccBalance-enterAccountBalance;
        return true;
        }else{
            return false;
        }
    }
}
