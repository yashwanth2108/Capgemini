package test.java;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestcaseTest {

    @Test
    void testcase1() {
        List<String> L = new ArrayList<>(Arrays.asList("Hello World","Manav Verma","Johncena","Python","Manav","John","World"));
        Main.removeIF(L);
        List<String> S = new ArrayList<>(Arrays.asList("Johncena","Python","John"));
        Assertions.assertEquals(S.toString(),L.toString());
    }
}