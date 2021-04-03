package com.class24.demo4;

public class WebDriverTester {
    public static void main(String[] args) {
        /*WebDriver webDriver=new chrome();
        webDriver.loginMethod();
        webDriver.openMethod();
        webDriver.closedMethod();
        webDriver.signUpMethod();
        webDriver.downloadMethod();*/



        WebDriver[]webDrivers={new chrome(),new FireFox()};
        for (WebDriver webDriver1:webDrivers){
            webDriver1.loginMethod();
            webDriver1.openMethod();
            webDriver1.closedMethod();
            webDriver1.signUpMethod();
            webDriver1.downloadMethod();
        }
    }
}
