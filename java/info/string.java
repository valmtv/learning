check out Console class 
import java.io.*;
FileREader - class for reading character files
catch (Throwable e) {
 // throwable is a superclass for all exceptions and errors
}

// TOOLS
// apache ant 
// Maven
// Gradle

import static java.lang.Math.PI;
// used to import static members of a class

// everything except primitives are objects
// and everything is created as a reference
// so when you pass an object to a method, you are passing a reference to the object
// to create objects, use the "new" keyword
//
//
// classes named in plural form (e.g. "Arrays") are collections of objects 
// classes named in singular form (e.g. "Array") are objects 
//
// some methods have parallel versions that work with arrays
// e.g. Arrays.sort() and Arrays.parallelSort()
//
// Record classes are a new feature in Java 14
// they are a way to create classes that are just data containers
// they are immutable so private final fields are used for all data
// they are a shorthand way to create classes that have a constructor, getters, equals, hashCode, and toString
// we can override constructors, methods, and fields for records
//
// constructor initialization might be done 
// this(name, 12); // calls another constructor with 2 agruments
//
// compact constructor syntax for records
public record Person(String name, int age) {
  public Person {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
// and so on will just add this for contructor
//
