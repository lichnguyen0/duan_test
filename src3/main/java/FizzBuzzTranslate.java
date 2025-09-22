public class FizzBuzzTranslate {

    public static String translate(int number) {
        if (number <= 0 || number >= 100) {
            throw new IllegalArgumentException("Number must be between 1 and 99");
        }

        String numStr = String.valueOf(number);
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        boolean contains3 = numStr.contains("3");
        boolean contains5 = numStr.contains("5");

        if (divisibleBy3 || contains3) {
            if (divisibleBy5 || contains5) {
                return "FizzBuzz";
            }
            return "Fizz";
        }

        if (divisibleBy5 || contains5) {
            return "Buzz";
        }

        return readNumber(number);
    }

    private static String readNumber(int number) {
        String[] units = {"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};

        if (number < 10) return units[number];

        int tens = number / 10;
        int ones = number % 10;
        String tensStr = units[tens] + " mươi";
        if (ones == 0) return tensStr;
        return tensStr + " " + units[ones];
    }
}
