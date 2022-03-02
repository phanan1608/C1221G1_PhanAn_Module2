package ss12_java_collection_framework.exercise.exercise_1_arraylist_linkedlist_in_java_collection;


import java.util.Comparator;

public class SortUp implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
