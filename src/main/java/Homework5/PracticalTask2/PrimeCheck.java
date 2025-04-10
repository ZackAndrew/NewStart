package Homework5.PracticalTask2;

public class PrimeCheck {
    private int num;

    public PrimeCheck(int num) {
        this.num = num;
    }

    public boolean isPrime() {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public int getNum() {
        return num;
    }
}
