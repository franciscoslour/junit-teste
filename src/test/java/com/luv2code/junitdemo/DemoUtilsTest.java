package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class DemoUtilsTest {

    DemoUtils demoUtils;


    @BeforeEach
    void setupBeforeEach(){
        this.demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

  /*
    @AfterEach
    void tearDeownAfterEach(){
        System.out.println("@AfterEach executes after the execution of each test method\n");
    }

    @AfterAll
    static void teardDownAfterEachClass(){
        System.out.println("@AfterAll Executes only once before all test method");
    }*/

    @Test
    @DisplayName("Equals and not equals")
    void testEqualsAndNotEquals(){

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(9, 1), "9+1 must not be 6");

    }


    @Test
    @DisplayName("Null and not null")
    void testNullAndNotNull(){

        String str1 = null;
        String str2 = "Fransicso";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");

    }

    @Test
    @DisplayName("Same and not same")
    void testSameAndNotSame(){

        String str1 = "Fransicso";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object should refer to be equal");
        assertNotSame(str1, demoUtils.getAcademy(), "Object should not refer to be equal");

    }

    @Test
    @DisplayName("Tru or false")
    void testTrueFlase(){
        int gradeOne = 10;
        int gradeTwo = 9;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "Grade one should be greater than grade two");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "Grade two should not be greater than grade one");

    }



}