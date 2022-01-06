package arraysAndStrings;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().intToRoman(1994));
    }

    public String intToRoman(int number) {
        String result = "";
        if(number<10){
            return handler2(number);
        }
        if (number >= 1000) {
            result += handler1(number, "M", 1000);
            number = number % 1000;
        }
        if (number >= 500) {
            result += handler1(number, "D", 500);
            number = number % 500;
        }
        if (number >= 100) {
            result += handler1(number, "C", 100);
            number = number % 500;
        }
        if (number >= 50) {
            result += handler1(number, "L", 50);
            number = number % 50;
        }
        if (number >= 10) {
            result += handler1(number, "X", 10);
        }
        return result;
    }

    private String handler1(int number, String str, int den) {
        String result="";
        int rem = number / den;
        if (rem == 4) {
            result += specialCase4(str);
        }else if (rem == 9) {
            result += specialCase9(str);
        } else {
            result += str + handler2(rem);
        }
        return result;
    }
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

    private String specialCase4(String str) {
        switch (str) {
            case "V":
                return "IV";
            case "L":
                return "XL";
            case "D":
                return "CD";
            default:
                return "";
        }
    }

    private String specialCase9(String str) {
        switch (str) {
            case "X":
                return "IX";
            case "L":
                return "XC";
            case "D":
                return "CM";
            default:
                return "";
        }
    }

    private String handler2(int number) {
        String result = "";
        if (number == 4) {
            return "IV";
        } else if (number == 9) {
            return "IX";
        }
        if (number >= 5) {
            result += "V";
            number = number % 5;
        }
        while (number > 0) {
            result += "I";
            number--;
        }
        return result;
    }
}
