//package LinkedList;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.junit.runner.Result;
//import static org.junit.runner.JUnitCore.runClasses;
//import java.util.*;
//
//public class SinglyLinkedTest {
//    public static void main(String[] args) {
//        Result result = runClasses(SinglyLinkedTest);
//        System.out.println("Test run = " + result.getRunCount() +
//                "\nTests failed = " + result.getFailures());
//    }
//
//    protected SinglyLinkedTest<String> list;
//
//    @Before
//    public void runBeforeEachTest(){
//        list = new SinglyLinkedTest<String>();
//    }
//
//    @Test
//    public void testSize1(){
//        assertEquals(0, list.size());
//    }
//
//    @Test
//    public void testAdd(){
//        list.addToFront("Osaka");
//        list.addToFront("Nagoya");
//        list.addToFront("Tokyo");
//        assertEquals((""));
//    }
//}
