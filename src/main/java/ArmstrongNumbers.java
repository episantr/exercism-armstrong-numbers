class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int digit;
        int sum = 0;
        int numberOfDigits = Integer.toString(numberToCheck).length();
        int tempNumber = numberToCheck;

        for (int i = 1; i < numberToCheck; i = i * 10) {
            digit = (tempNumber % (i * 10)) / i;
            sum += Math.pow(digit, numberOfDigits);
            tempNumber = tempNumber - digit;
        }

        return sum == numberToCheck;
    }

}
