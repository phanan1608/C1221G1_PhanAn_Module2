package ss12_java_collection_framework.exercise.exercise_1_arraylist_linkedlist_in_java_collection;


import java.util.Comparator;

public class SortDown implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
