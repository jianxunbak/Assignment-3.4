import java.util.Arrays;

enum Position {
    MANAGER, CEO, STAFF
}

enum EPayment {
    PAYNOW, GRABPAY, FAVEPAY
}

public class LearnMethods {

    public static void main(String[] args) {
        System.out.println("Employee bonus: " + calcBonus(5000));
        // System.out.println("Staff bonus: " + calcBonus(5000, 0.2));
        System.out.printf("Staff bonus: $%.2f\n", calcBonus(5000, 0.2));
        System.out.println("CEO bonus: " + calcBonus(20000, 1.5));

        System.out.println("CEO Bonus: " + calcBonus(20000, Position.CEO));
        System.out.println("Manager Bonus: " + calcBonus(10000, Position.MANAGER));
        System.out.println("Staff Bonus: " + calcBonus(5000, Position.STAFF));

        double[] salaries1 = { 1000, 2000, 3000 };
        double[] salaries2 = { 3000, 4000, 5000, 2500, 7500, 2100, 3000, 4000, 5000, 2500, 7500, 2100 };
        System.out.println("Variable Worker 1 bonus: " + calcBonus(salaries1));
        System.out.println("Variable Worker 2 bonus: " + calcBonus(salaries2));

        // VendingMachine myVendingMachine = new VendingMachine();
        // myVendingMachine.makePayment(10.0); // cash
        // myVendingMachine.makePayment(EPayment.GRABPAY); // cashless, no amount needed
        // myVendingMachine.makePayment(EPayment.FAVEPAY);
        // myVendingMachine.makePayment(EPayment.PAYNOW);

        double[] salaries2Copy = Arrays.copyOf(salaries2, salaries2.length);
        System.out.println("Variable Worker 2 bonus with ignore: " + calcBonus(salaries2Copy, 2));

        adjustSalaries(salaries2, 1000);

        // int myInt = 10;
        // modifyInt(myInt);

        // Wrapper classes and String are immutable objects in Java
        // means Java will not change its value even though it is a reference type
        // All other reference types will get mutated (mutable objects)
        Integer myInteger = 10;
        modifyInteger(myInteger);
        System.out.println("myInteger: " + myInteger);

        String myString = "If you love me, don't change me";
        modifyString(myString);
        System.out.println("myString: " + myString);

    }

    // factorial
    // 1! = 1
    // 2! = 2 x 1 = 2
    // 3! = 3 x 2 x 1 = 6
    // Iterative
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= 1;
        }
        return result;
    }

    // Recursive - a function calls itself to repeat functionality
    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /*
     * factorialRecursive(5)
     * 5 * factorialRecursive(4)
     * 5 * 4 * factorialRecursive(3)
     * 5 * 4 * 3 * factorialRecursive(2)
     * 5 * 4 * 3 * 2 * factorialRecursive(1)
     * 5 * 4 * 3 * 2 * 1 * factorialRecursive(0)
     */

    public static void modifyInt(int number) {
        number = 88;
    }

    public static void modifyInteger(Integer number) {
        number = 88;
    }

    public static void modifyString(String str) {
        str = "modified!";
    }

    public static void adjustSalaries(double[] salaries, double adjustment) {
        // Adjust all salaries by the adjustment amount
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] += adjustment;
        }
    }

    public static double calcBonus(double[] salaries, int ignoreMonth) {

        // Simulate that we ignore the salary by mutating the arr
        salaries[ignoreMonth + 1] = 0;

        double annualSalary = 0;
        for (double salary : salaries) {
            annualSalary += salary;
        }

        return calcBonus(annualSalary / salaries.length);
    }

    public static double calcBonus(double salary) {
        return salary * 0.1;
    }

    public static double calcBonus(double salary, double bonusRate) {
        return salary * bonusRate;
    }

    public static double calcBonus(double salary, Position position) {
        return switch (position) {
            case CEO -> salary * 3;
            case MANAGER -> salary * 0.2;
            case STAFF -> salary * 0.1;
        };
    }

    public static double calcBonus(double[] salaries) {
        if (salaries.length < 6) {
            return 0;
        }

        double annualSalary = 0;
        for (double salary : salaries) {
            annualSalary += salary;
        }

        // return (annualSalary / salaries.length) * 0.1;
        return calcBonus(annualSalary / salaries.length);
    }

}

class VendingMachine {
    public void makePayment(double amount) {
        System.out.println("Accepting cash payment of: " + amount);
        dispenseDrink();
    }

    public void makePayment(EPayment payment) {
        boolean paymentSuccess = switch (payment) {
            case PAYNOW -> connectPayNow();
            case GRABPAY -> connectGrabPay();
            case FAVEPAY -> connectFavePay();
        };

        if (paymentSuccess) {
            dispenseDrink();
        } else {
            System.out.println("Payment unsuccessful");
        }
    }

    private void dispenseDrink() {
        System.out.println("Dispensing drink...");
    }

    private boolean connectPayNow() {
        System.out.println("Connecting to PayNow...");
        System.out.println("PayNow success!");
        return true;
    }

    private boolean connectFavePay() {
        System.out.println("Connecting to FavePay...");
        System.out.println("FavePay success!");
        return true;
    }

    private boolean connectGrabPay() {
        System.out.println("Connecting to GrabPay...");
        System.out.println("GrabPay failed!");
        return false;
    }

}
