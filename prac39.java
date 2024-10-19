import java.util.Arrays;

public class prac39{
    
    
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 8, 1, 3};
        System.out.println("Before sorting (Integers): " + Arrays.toString(intArray));
        sortArray(intArray);
        System.out.println("After sorting (Integers): " + Arrays.toString(intArray));

        String[] stringArray = {"Banana", "Apple", "Orange", "Mango"};
        System.out.println("Before sorting (Strings): " + Arrays.toString(stringArray));
        sortArray(stringArray);
        System.out.println("After sorting (Strings): " + Arrays.toString(stringArray));

        Product[] productArray = {
            new Product("Laptop", 1200.0),
            new Product("Smartphone", 800.0),
            new Product("Tablet", 400.0),
            new Product("Monitor", 200.0)
        };
        System.out.println("Before sorting (Products by Price):");
        for (Product p : productArray) {
            System.out.println(p);
        }
        sortArray(productArray);
        System.out.println("After sorting (Products by Price):");
        for (Product p : productArray) {
            System.out.println(p);
        }
    }
}

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

