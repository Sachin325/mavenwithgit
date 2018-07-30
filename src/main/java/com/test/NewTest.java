package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	
	public static String driverPath = "D:\\Projects\\mavenwithgit\\browserDrivers\\chromedriver\\";
	public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass() throws IOException {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @Test
  public void testmethod1() {

	  System.out.println("run test1");
  }
  
  @Test
  public void testmethod2() {

	  System.out.println("run test2");
  }
  
}
