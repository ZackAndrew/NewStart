package Practice.Exceptions;

public class Demo {
    public static void main(String[] args) {
        int i = 0;
        int b = 0;
        try {
            b = 13 / i;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("Something went wrong " + e.getCause());
        }


        System.out.println("Hello");
    }
}
