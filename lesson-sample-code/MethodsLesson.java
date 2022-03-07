public class MethodsLesson {
    public static void main (String args[]){
        //Java has two kinds of methods, predefined methods and user-defined methods.
        //Predefined methods are methods that are built-in with Java. Example would be println()
        System.out.println("Hello World");
        
        //User-defined methods are methods that developers create for the application

         //To use a method, the name must be called and values should be provided. In the example in main, sum is called with values 1 and 3. Variables can also be used when calling a method.
        System.out.println(sum(1, 3));

        int num1 = 99;
        int num2 = 81;
        System.out.println(sum(num1, num2));

        printName("Claire");
    }

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

    //When there is no need for a method to have a return value, the "void" keyword can be used.
    public static void printName(String name){
        System.out.println("Hello there, " + name);
    }

    //Parameters are optional, methods can be created without parameters:
    public static void greet(){
        System.out.println("Greetings to you all!");
    }

    //The static keyword will be discussed during the classes and objects discussion


}