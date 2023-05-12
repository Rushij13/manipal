package org.example;

import org.testng.annotations.Test;

public class group {

    @Test(groups = {"sanity"})
    public void testcase1(){
        System.out.println("in testcase1");
    }
    @Test(groups = {"sanity"})
    public void testcase2(){
        System.out.println("in testcase2");
    }
    @Test(groups = {"sanity"})
    public void testcase3(){
        System.out.println("in testcase3");
    }
    @Test(groups = {"Regression"})
    public void testcase4(){
        System.out.println("in testcase4");
    }
    @Test(groups = {"Regression"})
    public void testcase5(){
        System.out.println("in testcase5");
    }
    @Test(groups = {"Regression"})
    public void testcase6(){
        System.out.println("in testcase6");
    }

}
