package Homework4.Task3;

import java.util.Scanner;

public class HTTPErrorApp {
    public static void main(String[] args) {

        System.out.println("Print HTTP error code (e.g. 400, 401, 402): ");
        Scanner scan = new Scanner(System.in);
        HTTPError error = HTTPError.getError(scan.nextInt());
        if (error != null)
            System.out.println(error);
        else
            System.out.println("incorrect code");
    }
}
