package Q4;

public class ReverseNum {

        public static void main(String[] args) {

            int number = 9876;
            int reverse = 0;

            while (number > 0) {
                int lastDigit = number % 10;
                reverse = reverse * 10 + lastDigit;
                number = number / 10;
            }

            System.out.println("Reversed Number = " + reverse);
        }
}
