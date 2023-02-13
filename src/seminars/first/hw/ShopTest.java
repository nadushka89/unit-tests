package seminars.first.hw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
//    1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
//     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
//     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
//
    public static void main(String[] args) {
        Product pie = new Product(300, "Pie");
        Product sugar = new Product(150, "Sugar");
        Product cheese = new Product(520, "Cheese");
//        Product meat = new Product(700, "Мeat");
        Product pasta = new Product(68, "Pasta");
        Product sweet = new Product(960, "Sweet");
        Product apple = new Product(120, "Apple");


        Shop box = new Shop();
        box.addBox(pie);
        box.addBox(sugar);
        box.addBox(cheese);
        box.addBox(apple);


        System.out.println("Отсортированный список");
        box.getSortedListProducts();
        for (Product p: box) {
            if (box.equals(p)){
                System.out.println(p);
            }else {
                assert false: p + " не существует";
            }
        }

        System.out.println("Самый дорогой продукт");
        System.out.println(box.getMostExpensiveProduct());

        assertThat(box).containsSequence(pie);
        assertThat(box).containsSequence(sugar);
        assertThat(box).containsSequence(cheese);
        //assertThat(box).containsSequence(apple);
        //assertThat(box).containsSequence(pasta);


        assertThat(pie.getTitle()).contains("Pie");
        assertThat(pie.getCost()).isEqualTo(300);

        assertThat(cheese.getTitle())
                .isNotEmpty()
                .contains("Cheese")
                .hasSize(6);

        assertThat(box.getProducts())
                .contains(pie, sugar, pasta)
                .isNotEmpty()
                .hasSize(3);
    }
}






















//        System.out.println("Неотсортированный список");
//        for (Product p: box) {
//            if (box.equals(p)){
//                System.out.println(p);
//            }else {
//                assert false: "Товара " + p + "не существует";
//            }
//        }

