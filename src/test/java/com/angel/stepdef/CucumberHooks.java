package com.angel.stepdef;

import com.angel.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class CucumberHooks extends BaseTest {

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    package com.angel.stepdef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;

    public class CucumberHooks {
        public static WebDriver driver;

        @Before
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        @After
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }
