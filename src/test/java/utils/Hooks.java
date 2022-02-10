package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUp(){
        DriverFactory.getDriver(Browsers.EDGE).manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        DriverFactory.getDriver(Browsers.EDGE).manage().window().maximize();
    }
    @After
    public void tearDown(){
        DriverFactory.annihilateDriverInstance();
    }
}
