package Homework5.PracticalTask3;

public class App {
    public static void main(String[] args) {
        RandomArrayAnalyzer analyzer = new RandomArrayAnalyzer();
        analyzer.setRandomNumbers(10);
        System.out.println(analyzer);
        System.out.println("Biggest number of array " + analyzer.getBiggestNum(analyzer.getRandomArray()));
        System.out.println("Sum of positive numbers " + analyzer.sumOfPositiveNumbers(analyzer.getRandomArray()));
        System.out.println("Number of Positive values " + analyzer.getNumberOfPositiveValues());
        System.out.println("Number of Negative values " + analyzer.getNumberOfNegativeValues());
        if (analyzer.getNumberOfPositiveValues() > analyzer.getNumberOfNegativeValues()) {
            System.out.println("There are more positive values in the array.");
        } else if (analyzer.getNumberOfPositiveValues() < analyzer.getNumberOfNegativeValues()) {
            System.out.println("There are more negative values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }
}
