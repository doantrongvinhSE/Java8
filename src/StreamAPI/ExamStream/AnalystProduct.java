package StreamAPI.ExamStream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class AnalystProduct {
    // filter item by price
    public List<Product> filterByPrice(List<Product> products, int price) {
        return products.stream().filter(p -> p.price() > price).toList();
    }

    // tính tổng số lượng sản phẩm còn lại
    public int totalQuality(List<Product> products) {
        return products.stream().mapToInt(quality -> quality.quality()).sum();
    }

    // tìm giá cao nhất 
    public Product mostExpensive(List<Product> products) {
        return products.stream().max(Comparator.comparing(Product::price)).get();
    }

    // sort theo giá cao đến thấp
    public List<Product> sortUp(List<Product> products) {
        return products.stream().sorted(Comparator.comparing(Product::price).reversed()).limit(4).toList();
    }
     
}
