import java.util.Scanner;


public class Calc {
    public static void main(String[] args) {
        class formatOfInputException extends IndexOutOfBoundsException {
            formatOfInputException(String msg) {
                super(msg);
            }
        }


        String[] arrayOfOperands;
        String str;
        char operation;


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение для расчета в формате 2 + 2, для завершения работы введите \"!\"");
        while (!sc.hasNext("!")) {

            str = sc.nextLine().replaceAll("\\s", "");

            try {
                arrayOfOperands = str.split("[+-/*]");
                operation = str.replaceAll("\\w", "").charAt(0);

                if (!str.matches("[0-9|IVXLC]{1,3}+(\\+|\\-|\\*|\\/)+[0-9|IVXLC]{1,3}")) {
                    throw new formatOfInputException("Формат введенных данных не соответствуют условиям задачи, требуемый формат: Операнд1 +,-,/,* Операнд2");
                }


                if (Character.isDigit(str.charAt(0))) {
                    Arabiс ar = new Arabiс(Integer.parseInt(arrayOfOperands[0]), Integer.parseInt(arrayOfOperands[1]), operation);
                    System.out.println(ar.otvet());
                } else {
                    Roman ro = new Roman(arrayOfOperands, operation);
                    System.out.println(RomanNumeral.arabicToRoman(ro.otvet()));
                }
            } catch (formatOfInputException e) {
                System.out.println(e.getMessage());
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Формат введенных данных не соответствуют условиям задачи, требуемый формат: Операнд1 действие Операнд2");
            }
        }
        sc.close();
    }


}
