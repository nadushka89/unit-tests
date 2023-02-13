package seminars.first.model;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double number) {
        if (number == 0) {
            throw new ArithmeticException("It is not possible to extract the root from 0");
        }
        if (number < 0) {
            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
        }

        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        }
        while ((t - squareRoot) != 0);
        return squareRoot;

        // или просто return Math.sqrt(number);
    }
}

//    /**
//     * @param purchaseAmount сумма покупки
//     * @param discountAmount размер скидки
//     * @return возвращает сумму покупки с учетом скидки
//     */
//    public static double calculatingDiscount(double purchaseAmount, double discountAmount) {
//        if (purchaseAmount == 0) {
//            throw new ArithmeticException("Сумма покупки не может быть 0");
//        }
//        if (purchaseAmount < 0) {
//            throw new ArithmeticException("Ошибка! Сумма покупки не может быть отрицательна!");
//        }
//        if (purchaseAmount > 0 && purchaseAmount < 1000) {
//            discountAmount = 0;
//            return purchaseAmount = purchaseAmount - (purchaseAmount * discountAmount);
//        }
//        if (purchaseAmount >= 1000 && purchaseAmount < 2000) {
//            discountAmount = 0.05;
//            return purchaseAmount = purchaseAmount - (purchaseAmount * discountAmount);
//        }
//        if (purchaseAmount >= 2000 && purchaseAmount < 5000) {
//            discountAmount = 0.1;
//            return purchaseAmount = purchaseAmount - (purchaseAmount * discountAmount);
//        }
//        if (purchaseAmount >= 5000 && purchaseAmount < 15000) {
//            discountAmount = 0.15;
//            return purchaseAmount = purchaseAmount - (purchaseAmount * discountAmount);
//        }
//        if (purchaseAmount >= 15000) {
//            discountAmount = 0.2;
//            return purchaseAmount = purchaseAmount - (purchaseAmount * discountAmount);
//        }
//        return purchaseAmount;
//    }
//}