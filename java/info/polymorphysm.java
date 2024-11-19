// POLYMORPHISM
// Polymorphism is the ability of a single function to operate on different types of data.
// In Java, this is achieved by method overloading and method overriding.
// Method overloading is when two or more methods in the same class have the same method name but different parameters.
// Method overriding is when a subclass provides a specific implementation of a method that is already provided by its parent class.
// In this example, we have a class called Animal with a method called makeSound. We then create two subclasses of Animal called Dog and Cat.
// The Dog class overrides the makeSound method to print "Woof" and the Cat class overrides the makeSound method to print "Meow".
// We then create instances of Dog and Cat and call the makeSound method on them to see the polymorphic behavior in action.
// Output:
// Woof
// Meow
// Code:
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}


public class polymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        // we can create Animal class and assign Dog and Cat objects to it

        dog.makeSound();
        cat.makeSound();
    }
}

// access example
class Data {
  private void f() {System.out.println("Data.f()");}
  protected void g() {System.out.println("Data.g()");}
}

class Text extends Data {
  // public void f() { super.f(); } // error: f() has private access in Data 
  public void f() {System.out.println("Text.f()");}
  public void g() { super.g(); }
}

  Data d = new Text();
  // d.f(); // error: f() has private access in Data
  d.g(); // Data.g() possible only in same package
  ((Text)d).f(); // Text.f() possible only in same package
  ((text)d).g(); // Data.g() possible only in same package
  // also we dont want to write ((Text)d).f(); everytime we can use
  // Text t = (Text)d;
  // t.f();

// another exmaple

class Data {
  public void g() {System.out.println("public");}
}  
class Text extends Data {
  private void g() {System.out.println("private");}
} 
// can't override g() in Text because it is public in Data
// private void g() {System.out.println("private");}
// ^ error: g() in Text cannot override g() in Data       
//  because Data class "promises" g() to be public
//
// !!! default access is package access


// abstract methods and classes
// Abstract classes are classes that cannot be instantiated and are used to define a common interface for subclasses.
// Abstract methods are methods that are declared in an abstract class but do not have an implementation.
// Subclasses of an abstract class must provide an implementation for all abstract methods.
// In this example, we have an abstract class called Shape with an abstract method called draw.
// We then create two subclasses of Shape called Circle and Rectangle that provide an implementation for the draw method.
// We create instances of Circle and Rectangle and call the draw method on them to see the polymorphic behavior in action.
// Output:
// Drawing a circle
// Drawing a rectangle
// Code:
abstract class Shape {
    public abstract void draw();
    // abstract method has no body
    // abstract method must be implemented in subclass
    // abstract method must be in abstract class
    // abstract class can have non-abstract methods , fields, constructors
    // static methods, final methods, private methods, private fields, private constructors
    // static methods and so on
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
// a class inheriting from abstract class has to define all abstract methdods
// if not it has to be abstract too

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
// we dont need to create object of Shape class because it is abstract
// Shape s = new Shape(); // error: Shape is abstract; cannot be instantiated
// we can create object of Circle and Rectangle classes because they are not abstract
//
