package com.HiltiProject.step_definitions;

import com.HiltiProject.utilities.Driver;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void setup(){
        Driver.get().manage().window().maximize();
    }
}
