import java.util.function.IntPredicate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    public static void main(String[] args) {
        calculatingDiscount(300, 25);

//        Testing();
    }

    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     */
    public static IntPredicate calculatingDiscount(double purchaseAmount, double discountAmount) {
        double result;
        if (discountAmount>100){
            throw new ArithmeticException("Error! Скидка не может быть > 100%");
        }
        if (discountAmount<0){
            throw new ArithmeticException("Error! Скидка не может быть < 0");
        }
        else if (purchaseAmount < 0){
            throw new ArithmeticException("Ошибка! Сумма покупки не может быть отрицательна!");
        }
        else if (purchaseAmount == 0) {
            throw new ArithmeticException("Сумма покупки не может быть 0");
        }
        else  {
            result = purchaseAmount *(100-discountAmount)/100;
        }
        System.out.printf("Сумма покупки  " + purchaseAmount + ", скидка " + discountAmount+
        " Сумма с  учетом скидки составила " + result);
        return null;
    }

    public static void Testing() {
        assertThat(calculatingDiscount(1200, 20));   // Положительная проверка
        assertThat(calculatingDiscount(2550, 150));  //Проверка скидки > 100%
        assertThat(calculatingDiscount(-1587, 25));  //Проверка отрицательной цены
        assertThat(calculatingDiscount(78500, -29));   //Проверка отрицательной скидки
        assertThat(calculatingDiscount(0, 25));      //Проверка нулевой цены
    }
}








        // Проверка базового функционала с целыми числами:
//        if (8 != Calculator.calculation(2, 6, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (0 != Calculator.calculation(2, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (14 != Calculator.calculation(2, 7, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (2 != Calculator.calculation(100, 50, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        // Случаи с неправильными аргументами
//        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
//        try {
//            Calculator.calculation(8, 4, '_');
//        } catch (IllegalStateException e) {
//            if (!e.getMessage().equals("Unexpected value operator: _")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
//
//        // Проверка базового функционала с целыми числами, с использованием утверждений:
//        assert 8 == Calculator.calculation(2, 6, '+');
//        assert 0 == Calculator.calculation(2, 2, '-');
//        assert 14 == Calculator.calculation(2, 7, '*');
//        assert 2 == Calculator.calculation(100, 50, '/');
//
//        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
//        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
//        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
//        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
//        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
//
//        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//        assertThatThrownBy(() ->
//                Calculator.calculation(8, 4, '_')
//        ).isInstanceOf(IllegalStateException.class);
//
//        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
//        System.out.println(Calculator.squareRootExtraction(169));