package Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Object> optional = Optional.empty();
        System.out.println(optional);

        Optional<String> optional1 = Optional.of("Hello");
        System.out.println(optional1);
        System.out.println(optional1.get());

        // kiểm tra giá trị có hay không trong optional
        System.out.println(optional1.isPresent());
        System.out.println(optional1.isEmpty());

        // if present
        optional1.ifPresent(value -> System.out.println(value + " Vinh"));


        // orElse Trả về giá trị bên trong nếu tồn tại, nếu không thì trả về giá trị mặc định.
        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println(optional2.orElse("Default Value"));

        Optional<String> optional3 = Optional.of("Doan Trong Vinh");
        System.out.println(optional3.map(String::toLowerCase).get());
        System.out.println(optional3.filter(s -> s.equals("Doan Trong Vinh 1")));
        System.out.println(optional3.filter(s -> s.equals("Doan Trong Vinh")));

    }
}
