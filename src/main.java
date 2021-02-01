import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение в строку через пробел. \nНа вход допускаются только числа от 1 до 10 включительно и операторы (*, /, +, -)");

        //ввод выражения в одну строку
        String value = scan.nextLine();
        //создание массива строк
        String[] array = value.split(" ");


        Calc number = new Calc();


        String sNumber1 = array[0];
        String sNumber2 = array[2];

        int number1 = number.toRoman(sNumber1);
        int number2 = number.toRoman(sNumber2);
        String op = array[1];
        char operator = op.charAt(0);

        if (((number1 == 0) && (number2 != 0)) || ((number1 != 0) && (number2 == 0))) {
            System.out.println("Цифры должны быть или римскими или арабскими");
            System.exit(0);
        } else if (number1 == 0 && number2 == 0) {
            number1 = Integer.parseInt(array[0]);
            number2 = Integer.parseInt(array[2]);
            Calc result = new Calc(number1, number2, operator);
            boolean comparison = (number1 >= 1 && number1 <= 10) && (number2 >= 1 && number2 <= 10);
            if (comparison == true) {
                System.out.println(result.calculate(number1, number2, operator));
            } else System.out.println("Ошибка. Числа должны быть от 1 до 10 включительно");
        } else if (number1 != 0 && number2 != 0) {
            Calc result = new Calc(number1, number2, operator);
            Calc resultRoman = new Calc();
            System.out.println(resultRoman.getRoman(result.calculate(number1, number2, operator)));

        }




    }
}
