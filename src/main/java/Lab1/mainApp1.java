package Lab1;

public class mainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        System.out.println("welcome to scientific calculator");
        System.out.println("program started ...");
        System.out.println(b + " to power " + n + " = " + myLibrary.Power(b, n));
        System.out.println(n + "! = " + myLibrary.factorial(n));
        System.out.println("add third print line");
    }
}