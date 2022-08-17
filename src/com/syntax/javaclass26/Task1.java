package com.syntax.javaclass26;

public class Task1 {
    /* Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
}

interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{// not allowed extends because is an interfase
    @Override
    public void openBrowser() {
        System.out.println("Opening the browser in Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the browser in Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Google Chrome window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the element in Google Chrome");
    }

}

class FireFoxDriver implements WebDriver{// not allowed extends because is an interfase
    @Override
    public void openBrowser() {
        System.out.println("Opening the browser in FireFoxDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the browser in FireFoxDriver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing FireFoxDriver window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the element in FireFoxDriver");
    }

}