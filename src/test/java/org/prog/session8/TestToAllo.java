package org.prog.session8;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestToAllo extends PageObjectTests {


    @Test
    public void myAllo() {

        AlloObjectTest allo = new AlloObjectTest(driver);


        allo.LoadPage();
        allo.FindAndInsertData();
        allo.WaitingAndLooking();


    }


}
