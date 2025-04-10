package Homework3.PracticalTask1;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.setNum1(Calc.getNumber("Enter 1 num: "));
        calc.setNum2(Calc.getNumber("Enter 2 num: "));
        System.out.println(calc.getTotal(calc.getNum1(), calc.getNum2()));
        System.out.println(calc.getAverage(calc.getNum1(), calc.getNum2()));
    }

}
