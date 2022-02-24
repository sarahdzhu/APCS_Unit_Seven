import org.junit.jupiter.api.*;

import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArrayListMethods_Tests {

        @Test
        @Order(1)
        public void numberListTest() {
                ArrayList<Integer> expected = new ArrayList<>();
                expected.add(0);
                expected.add(9);
                expected.add(10);
                expected.add(7);
                expected.add(-1);

                assertEquals(expected, ArrayListMethods.numberList());
        }


        @Test
        @Order(2)
        public void firstAndLastTest() throws FileNotFoundException {
                System.setIn(new FileInputStream("files/file1.txt"));
                ArrayList<Double> expected = new ArrayList<>();
                expected.add(6.0);
                expected.add(10.0);
                expected.add(-31.1);
                ArrayList<Double> actual = ArrayListMethods.firstAndLast();


                assertEquals(expected, actual);
        }

        @Test
        @Order(2)
        public void firstAndLastTestTwo() throws FileNotFoundException {
                System.setIn(new FileInputStream("files/file2.txt"));
                ArrayList<Double> expected = new ArrayList<>();
                expected.add(13.0);
                expected.add(14.5);
                expected.add(2.23);
                ArrayList<Double> actual = ArrayListMethods.firstAndLast();
                assertEquals(expected, actual);
        }

        @Test
        @Order(3)
        public void firstAndLastTestThree() throws FileNotFoundException {
                System.setIn(new FileInputStream("files/file3.txt"));
                ArrayList<Double> expected = new ArrayList<>();
                expected.add(1.0);
                expected.add(4.5);
                expected.add(4.5);
                ArrayList<Double> actual = ArrayListMethods.firstAndLast();
                assertEquals(expected, actual);
        }

        @Test
        @Order(3)
        public void firstAndLastTestFour() throws FileNotFoundException {
                System.setIn(new FileInputStream("files/file4.txt"));
                ArrayList<Double> expected = new ArrayList<>();
                expected.add(0.0);
                expected.add(0.0);
                expected.add(0.0);
                ArrayList<Double> actual = ArrayListMethods.firstAndLast();
                assertEquals(expected, actual);
        }

/*
    @Test
    public void double23One() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        assertFalse(ArrayListMethods.double23(a));
    }

    @Test
    public void double23OTwo() {
        ArrayList<Integer> a = new ArrayList<>();
        assertFalse(ArrayListMethods.double23(a));
    }

    @Test
    public void double23OThree() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(2);
        assertTrue(ArrayListMethods.double23(a));
    }

    @Test
    public void double23OFour() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(3);
        assertTrue(ArrayListMethods.double23(a));
    }

    @Test
    public void double23OFive() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        assertFalse(ArrayListMethods.double23(a));
    }

    @Test
    public void double23OSix() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        assertFalse(ArrayListMethods.double23(a));
    }

 */

    /*
    @Test
    public void commonEndOne() {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(7);
        b.add(3);
        assertTrue(ArrayListMethods.commonEnd(a, b));
    }
    @Test
    public void commonEndTwo() {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(7);
        b.add(3);
        b.add(2);
        assertFalse(ArrayListMethods.commonEnd(a, b));
    }

    @Test
    public void commonEndThree() {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(1);
        b.add(3);
        assertTrue(ArrayListMethods.commonEnd(a, b));
    }
    */

}
