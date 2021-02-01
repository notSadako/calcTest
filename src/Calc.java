public class Calc {
    int number1;
    int number2;
    char operator;

    String numbers;
    int result;

    public Calc(int result) {
        this.result = result;
    }

    public Calc(int number1, int number2, char operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public Calc() {
        this.numbers = numbers;
    }

    // метод для вычисления
    public int calculate(int number1, int number2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
        }
        return result;
    }

    //метод для перевоа римских цифр в арабские при вводе
    public int toRoman(String numbers) {
        if (numbers.equals("I")) {
            int number = 1;
            return number;
        } else if (numbers.equals("II")) {
            int number = 2;
            return number;
        } else if (numbers.equals("III")) {
            int number = 3;
            return number;
        } else if (numbers.equals("IV")) {
            int number = 4;
            return number;
        } else if (numbers.equals("V")) {
            int number = 5;
            return number;
        } else if (numbers.equals("VI")) {
            int number = 6;
            return number;
        } else if (numbers.equals("VII")) {
            int number = 7;
            return number;
        } else if (numbers.equals("VIII")) {
            int number = 8;
            return number;
        } else if (numbers.equals("IX")) {
            int number = 9;
            return number;
        } else if (numbers.equals("X")) {
            int number = 10;
            return number;
        } else {
            int number = 0;
            return number;
        }
    }

    //Метод для перевода в арабские цифры
    public String getRoman(int number) {

        String riman[] = {"M","XM","CM","D","XD","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (number > 0 || arab.length == (i - 1)) {
            while ((number - arab[i]) >= 0) {
                number -= arab[i];
                result.append(riman[i]);
            }
            i++;
        }
        return result.toString();
    }


}

