public class Main {
    public static void main(String[] args) {

        // test cases
        numberToWords(706);
        numberToWords(-1);
        numberToWords(100);
        numberToWords(509);
        numberToWords(65945);
        numberToWords(0);
        numberToWords(-254);
        numberToWords(45000);

    }

    public static void numberToWords(int number) { // Method that prints the digits of an integer in words

        int reverse = reverse(number);

        if (reverse < 0) {
            System.out.println( number +" is an invalid Value");
            return;
        }

        System.out.println("The number " + number + " in it's parts are:");

        int i = 0;
        int nextDigit;
        while(reverse > 0) { // While loop that goes through the reversed number and prints
                             // from right to left
            nextDigit = reverse % 10;
            reverse /= 10;
            i ++;

            switch (nextDigit) { // Enhanced switch statement that prints to the user

                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");

            }
        }

        int digitCount = getDigitCount(number);

        while (i < digitCount) {   // makes sure zeros are printed when a number ends with 0
            System.out.println("Zero");
            i++;
        }

    }

    public static int reverse(int number) { // This method reverses the numbers order so the logic for
        int nextDigit;                  // method numbersToWords prints in the correct order
        int reversedNumber = 0;

        while(number != 0) {
            reversedNumber *= 10;
            nextDigit = number % 10;
            reversedNumber += nextDigit;
            number /= 10;
        }

        return reversedNumber;
    }
    public static int getDigitCount(int number) { // Method to get the count of digits
                                                  // in a number. Otherwise, 100 would print 1
        if(number < 0) { // Returns negative -1 if a negative value is entered
            return -1;
        }

        if (number == 0){  // Special if statement specifically for the input of "0".
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= number; i *= 10) { // Finds the amount of digits in a number
            count++;
        }
        return count;

    }

}

