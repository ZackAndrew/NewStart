package Homework12.Task1;

public class DivApp {

    double div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("You can't divide by 0");
        }
        return (double) a / b;  // This should work for 0 / 3
    }

    public static void main(String[] args) {
        DivApp app = new DivApp();
        try {
            System.out.println(app.div(3, 2));  // Expected: 1.5
            System.out.println(app.div(0, 3));  // Expected: 0.0
            System.out.println(app.div(2, 0));  // Expected: Error message
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // Expected: "You can't divide by 0"
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
