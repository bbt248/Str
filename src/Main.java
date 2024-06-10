import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<CustomerWithId> customers = Arrays.asList(
                new CustomerWithId(1, "Євген", "Петренко"),
                new CustomerWithId(2, "Олександра", "Бугаєнко"),
                new CustomerWithId(3, "Михайло", "Василенко"),
                new CustomerWithId(4, "Петро", "Бондаренко"),
                new CustomerWithId(5, "Микола", "Коваленко")
        );

        Map<Integer, Customer> customerMap = customers.stream()
                .collect(Collectors.toMap(
                        CustomerWithId::getId,
                        customer -> new Customer(customer.firstName, customer.lastName)
                ));

        System.out.println("Значення:");
        customerMap.values().forEach(System.out::println);

        System.out.println("\nКлюч:");
        customerMap.keySet().forEach(System.out::println);

        System.out.println("\nЗаписи:");
        customerMap.forEach((key, value) -> System.out.println("Ключ: " + key + ", Значення: " + value));
    }
}