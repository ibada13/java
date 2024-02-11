import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x;
        do {
            System.out.print("Enter an expression (or [EXIT] to quit): ");
            // String input = scanner.nextLine().trim();
           x= Analyseetcal(args.toString());

       } while (x);
       
    }

    public static boolean Analyseetcal(String input) {
        try {
            int x = mytruecalc(input.split("\\s+"));
            System.out.println("the inputs  is : " + input);
            System.out.println("the result is : "+ x);
            
        }
        catch (ExitEx e) {
            System.out.println(e.getMessage());
            return false;
        }
        catch (Exception err) {
            System.out.println("the err : " + err.getMessage() + "  the cause : " + err.getCause());
        }
        return true;
    }

    public static int mytruecalc(String[] trueequ) throws Myexption {
        // String[] trueequ = equ.split("\\s+");
        String equ = trueequ.toString();
        // System.out.println(trueequ.length);
        if (equ.equals("exit")) {
            
            throw new ExitEx();
       }
       
        if (trueequ.length < 2) {
            throw new Myexption(equ, null, "the size of equ is not enough");

        }
        else if (trueequ.length == 2) {
            if (trueequ[0].equals("-")) {
                try{
                    
                    return -Integer.parseInt(trueequ[1]);
                } catch (NumberFormatException e) {
                    throw new Myexption(equ, e, "invalid oprand");
                }
            }

        }
        else if (trueequ.length == 3) {
            int x, y;
            String op = trueequ[1];
            try {
                x = Integer.parseInt(trueequ[0]);
                y = Integer.parseInt(trueequ[2]);

            } catch (NumberFormatException err) {
                throw new EntreeIllegaleException(equ, err, "Argument Illégal");

            }
            switch (op) {
                case "-":
                    throw new EntreeIllegaleException(equ, null, "Opérateur Illégal");
                
                    
                case "+":
                    return x + y;
                case "*":
                    throw new EntreeIllegaleException(equ, null, "Opérateur Illégal");
                case "/":
                    try {
                        return x / y;
                    } catch (ArithmeticException err) {
                        throw new Myexption(equ, err, "you cannot devide by zero");
                    }
            }

        }
        
        throw new EntreeIllegaleException(equ, null, "Nombre de Tokens Illégal");
        }
}
