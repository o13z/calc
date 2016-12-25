package calc.command;


/**
 * The real CalculatorInvoker class / Receiver
 */
public class CalculatorReceiver {
    private double rez = 0;

    public void doAction(char operation, int x, int y) {
        if (operation == '+') {
            add(x, y);
        } else if (operation == '-') {
            sub(x, y);
        } else if (operation == '*') {
            mult(x, y);
        } else if (operation == '/') {
            div(x, y);
        } else {
            System.out.println("Invalid operation");
        }
    }

//    public double doOperation(char operation, int x, int y) {
//        double rezult = 0;
//        switch (operation) {
//            case '+':
//                rezult = add(x, y);
//                break;
//            case '-':
//                rezult = sub(x, y);
//                break;
//            case  '*':
//                rezult = mult(x, y);
//                break;
//            case '/':
//                rezult = div(x, y);
//                break;
//            default:
//                System.out.println("Invalid operation");
//                break;
//        }
//        return rezult;
//    }

    private void add(double x, double y) {
        rez = x+y;
        System.out.println(x + " + " + y + " = " + rez);
    }

    private void sub(double x, double y) {
        rez = x-y;
        System.out.println(x + " - " + y + " = " + rez);
    }

    private void mult(double x, double y) {
        rez = x*y;
        System.out.println(x + " x " + y + " = " + rez);
    }

    private void div(double x, double y) {
        rez = x/y;
        System.out.println(x + " / " + y + " = " + rez);
    }
}
