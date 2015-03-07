/**
 * Created by c4q-vanice on 3/7/15.
 */

import java.util.Scanner;

public class RPNCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firnum, secnum, answer, rem;
        String oper;
        System.out.println("Feed me a whole number");
        firnum = input.nextInt();
        System.out.println("Feed me another whole number");
        secnum = input.nextInt();
        System.out.println("Give me an operation (Math Please!!!)");
        oper = input.next();

        if (oper.equals("+")) {
            answer = firnum + secnum;
            System.out.println("The answer is " + answer);
        }
        if (oper.equals("-")){
            answer = firnum - secnum;
            System.out.println("The answer is " + answer);
        }
        if (oper.equals("/")) {
            answer = firnum / secnum;
            rem = firnum%secnum;
            System.out.print("The answer is " + answer);
            System.out.println(" r "+ rem);
        }
        if (oper.equals("*")) {
            answer = firnum * secnum;
            System.out.println("The answer is " + answer);
        }
    }
}
