package StepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.After;


public class Hooks {

    @After
    public  void afterScenario(){
        DriverManager.getDriver().driver.quit();
        DriverManager.getDriver().driver = null;
    }
}