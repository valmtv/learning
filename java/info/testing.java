assert // keyword used to test assumptions
// java -ea testing
// java -enableassertions testing
// used to check the assumptions

int n = 0;
assert n != 0 : "n is zero"; // if n is zero, then the message will be printed
// only with java -ea 
//
//JUnit is a testing framework for Java
// create a test class with public void methods for testing
// @Test annotation is used to mark the method as a test method
// @BeforeClass, @AfterClass, @Before, @After annotations are used to run the methods before and after the test methods
// @Ignore annotation is used to ignore the test method
// @RunWith annotation is used to run the test class
// @Suite annotation is used to run the test suite
// @Parameterized annotation is used to run the test with different parameters
// @Rule annotation is used to run the test with different rules
// @FixMethodOrder annotation is used to run the test in a specific order
// @Test(expected = Exception.class) annotation
// @Test(timeout = 100) annotation
// @Test(expected = Exception.class, timeout = 100) annotation
// @Test(timeout = 100, expected = Exception.class) annotation
// @BeforeAll, @AfterAll annotations
// @BeforeEach, @AfterEach annotations
// order of execution: @BeforeAll, Constructor(), @BeforeEach, @Test, @AfterEach, @AfterAll
// order of execution: @BeforeClass, @Before, @Test, @After, @AfterClass
// package org.junit
// import org.junit.jupiter.api;
// import static org.junit.jupiter.api.Assertions.*; // static import ( not the best idea)
// 
// assertEquals(double expected, double actual, double delta) // delta is the difference between the expected and actual values
// Assertions class 

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }
}

class Printer {
    public int printOne() {
        return 1;
    }
    public int printTwo() {
        return 2;
    }
}

public class PrinterTest {
    @Test
    public void testPrintOne() {
        Printer printer = new Printer();
        int result = printer.printOne();
        assertEquals(1, result);
    }
    @Test
    public void testPrintTwo() {
        Printer printer = new Printer();
        int result = printer.printTwo();
        assertEquals(2, result);
    }
}


//Maven
// Convention over configuration - easier configuration in standart cases, but less elastic than ant
mvn // command line tool for Maven
//


//JDB - Java Debugger
// jdb // command line tool for debugging
// jdb -classpath . testing // run the debugger with the classpath

//JDB commands
// run // run the program
// stop in testing.main // set a breakpoint in the main method
// step // step into the next method
// next // step over the next method
// cont // continue the execution
// list // list the source code
// locals // list the local variables
// print n // print the value of n
// dump // dump the stack trace
// thread // list the threads
// thread 1 // switch to thread 1
// suspend // suspend the execution
// resume // resume the execution
// clear // clear the breakpoint
// clear testing.main // clear the breakpoint in the main method
// exit // exit the debugger
// help // list the commands
// help command // get help for the command 
//
finalize() // method called by the garbage collector before the object is destroyed
// recommended to use try-finally block instead of finalize method
// finalize method is called by the garbage collector, but it is not guaranteed when it will be called
// finalize method is called only once
// finalize method is called by the finalizer thread
// finalize method is called by the garbage collector when the object is: 
// unreachable, garbage collected, finalized, destroyed, collected by the finalizer thread

// Garbage Collector decides when to destroy the object and free the memory when the object is unreachable
// (no references to the object)
// Garbage Collector is a daemon, low priority, background, non-blocking, concurrent thread
//
// Inheritance
// class A extends B // A is a subclass of B
// class A implements B // A is a subclass of B
// class A extends B implements C // A is a subclass of B and a subclass of C
// Initialization order: static fields, static blocks, instance fields, instance blocks, constructor 
// super() // call the constructor of the superclass
// super.method() // call the method of the superclass
// super.field // access the field of the superclass
//
// Polymorphism
// method overloading - same method name, different parameters
// method overriding - same method name, same parameters, different implementation
//


