import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter an expression (or [EXIT] to quit): ");
            String input = scanner.nextLine().trim();
            try {
                System.out.println(mytruecalc(input));
            }
            catch (Myexption err) {
                System.out.println("the err : " + err.getMessage() + "the cause : " + err.getCause() );
            }
        } while (true);
    }

    public static Object mytruecalc(String equ) throws Myexption {
        String[] trueequ = equ.split("\\s+");
        // System.out.println(trueequ.length);
        if (equ.equals("exit")) {
            
            return "exited";
       }
       
        if (trueequ.length < 2) {
            throw new Myexption(equ, null, "the size of equ is not enough");

        }
        else if (trueequ.length == 2) {
            if (trueequ[0].equals("-")) {
                return -Integer.parseInt(trueequ[1]);
            }
            else {
                throw new Myexption(equ, null, "oprand aer wrong");
            }
        }
        else if (trueequ.length == 3) {
            int x, y;
            String op = trueequ[1];
            try {
                x = Integer.parseInt(trueequ[0]);
                y = Integer.parseInt(trueequ[2]);

            } catch (NumberFormatException err) {
                throw new Myexption(equ, err.getCause(), "the opreand are false");

            }
            switch (op) {
                case "-":
                    return x - y;
                case "+":
                    return x + y;
                case "*":
                    return x * y;
                case "/":
                    try {
                        return x / y;
                    } catch (Exception err) {
                        throw new Myexption(equ, err.getCause(), "you cannot devide by zero");
                    }
            }

        }
        
        throw new Myexption(equ, null, "the equ is big");
        }
}
