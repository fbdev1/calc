public abstract class Chisla {
    int firstOp;
    int secondOp;

    char dejstvie;

    int otvet(){

        switch (dejstvie) {
            case '+':
                return addition();

            case '-':
                return subtract();

            case '/':
                return divide();

            case '*':
                return multiply();

            default:
                return 0;

        }
    }

    int addition() {
        return firstOp + secondOp;
    }


    int subtract() {
        return firstOp - secondOp;
    }

    int multiply() {
        return firstOp * secondOp;
    }


    int divide() throws NullPointerException {
        try {
            return firstOp / secondOp;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
            return 0;
        }
    }
}
