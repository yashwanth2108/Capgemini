package Test;


import com.company.Main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class TestCase {

    @Test
    public void testcase_1()
    {
        assertEquals(Main.checkArmstrong(153),"a Armstrong Number");
    }
    @Test
    public void testcase_2()
    {
        assertEquals(Main.checkArmstrong(371),"a Armstrong Number");
    }
    @Test
    public void testcase_3()
    {
        assertEquals(Main.checkArmstrong(273),"Not a Armstrong Number");
    }
    @Test
    public void testcase_4()
    {
        assertEquals(Main.checkArmstrong(1966),"Not a Armstrong Number");
    }
    @Test
    public void testcase_5()
    {
        assertEquals(Main.checkArmstrong(407),"a Armstrong Number");
    }
    @Test
    public void testcase_6()
    {
        assertEquals(Main.checkArmstrong(370),"a Armstrong Number");
    }
}
