## Brief

### How to use the lesson sample code

There is one folder prepared for the lesson. 
- [Instructor's folder](./lesson-sample-code/)

Instructor to use the code provided for demonstration during the I DO segment. Learners will use the java file provided in the respective folder for practice during the WE DO segment.

### Any other announcements to instructors or learners

---

## Part 1 - Predefined and User-defined functions

Create the main method and add a line printing "Hello World"
```java
public static void main (String args[]) {
  //Java has two kinds of methods, predefined methods and user-defined methods.
  //Predefined methods are methods that are built-in with Java. Example would be println()
  System.out.println("Hello World");
  
  //User-defined methods are methods that developers create for the application
}
```

---

## Part 2 - Method Definition and Invocation

Create a new method outside the main method with the following notes:
```java
//Methods are blocks of code that runs when it is called.
//Methods are a way to reuse code by defining the code once, and being able to use it many times.
//A method needs to be defined in a class and has 3 main parts:
/*
    1. Return type - determines what data type the method should return after running.
    2. method name - the name of the method. this is important when the method needs to be called.
    3. parameters - the inputs that the method needs in order to run. Note that the parameters can be optional.
*/
/* Method Definition Syntax:
    <Scope> <return type> <name>(<parameters>){
        Code block to execute
    }
*/
public static int sum(int x, int y){
    return x + y;
}
//In this example, the method is called sum and it needs two integers to operate. It would then return the result of the operation x + y.
```

After creating this function, add this line in the main method
```java
 //To use a method, the name must be called and values should be provided. In the example in main, sum is called with values 1 and 3. Variables can also be used when calling a method.
System.out.println(sum(1, 3));
```

---

## Part 3 - More notes on methods

Create two new methods with the following notes:

```java
//When there is no need for a method to have a return value, the "void" keyword can be used.
    public static void printName(String name){
        System.out.println("Hello there, " + name);
    }

    //Parameters are optional, methods can be created without parameters:
    public static void greet(){
        System.out.println("Greetings to you all!");
    }

    //The static keyword will be discussed during the classes and objects discussion
```