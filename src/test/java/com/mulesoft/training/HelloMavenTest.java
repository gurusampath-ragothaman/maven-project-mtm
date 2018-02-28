package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mvn-proj1Flow", "hello gurusampath");
    }
    
    @Override
    protected String getConfigFile() {
        return "mvn-proj1.xml";
    }

}
