package StreamAPI.ExamStream;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> products = geProducts();

        AnalystProduct analystProduct = new AnalystProduct();
        List<Product> filtered = analystProduct.filterByPrice(products, 800);
        System.out.println(filtered);

        int totalProduct = analystProduct.totalQuality(products);

        System.out.println("Total item: " + totalProduct);


        System.out.println("Most Expensive Item: " + analystProduct.mostExpensive(products));

        System.out.println("4 item expensive: " + analystProduct.sortUp(products));





    }

    private static List<Product> geProducts() {
        return List.of(
                new Product(1, "Laptop", "Electronics", 1000.0, 50),
                new Product(2, "Smartphone", "Electronics", 800.0, 100),
                new Product(3, "Headphones", "Electronics", 200.0, 150),
                new Product(4, "T-Shirt", "Fashion", 20.0, 300),
                new Product(5, "Jeans", "Fashion", 40.0, 200),
                new Product(6, "Bread", "Food", 2.0, 500),
                new Product(7, "Milk", "Food", 1.5, 400),
                new Product(8, "Eggs", "Food", 0.5, 600),
                new Product(9, "Refrigerator", "Electronics", 1200.0, 20),
                new Product(10, "Shoes", "Fashion", 60.0, 250),
                new Product(11, "Watch", "Fashion", 150.0, 180),
                new Product(12, "Pizza", "Food", 8.0, 320),
                new Product(13, "Tablet", "Electronics", 600.0, 70),
                new Product(14, "Camera", "Electronics", 700.0, 90),
                new Product(15, "Sofa", "Furniture", 500.0, 15),
                new Product(16, "Table", "Furniture", 300.0, 10),
                new Product(17, "Chair", "Furniture", 100.0, 25),
                new Product(18, "Book", "Stationery", 10.0, 400),
                new Product(19, "Notebook", "Stationery", 5.0, 350),
                new Product(20, "Pen", "Stationery", 2.0, 600));
    }
}
