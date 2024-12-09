package Compare.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class NameComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProductName().compareTo(o2.getProductName());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Iphone 13", 200.9));
        products.add(new Product("Samsung Galaxy S21", 180.5));
        products.add(new Product("Xiaomi Mi 11", 150.7));
        products.add(new Product("Google Pixel 6", 210.0));
        products.add(new Product("OnePlus 9 Pro", 195.3));
        products.add(new Product("Sony Xperia 5 III", 175.2));
        products.add(new Product("Oppo Find X3 Pro", 220.1));

//        products.sort(new NameComparator());

        products.sort(new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductName().compareTo(o2.getProductName());
//                return Integer.compare((int) o1.getPrice(), (int) o2.getPrice());
            }
        });

        products.sort(Comparator.comparing(Product::getProductName).thenComparing(Product::getPrice));

        System.out.println(products);

    }
}
