package collection_review.services.impl;

public interface IServices<E> {
    void add(E object);

    void displayList();

    void searchByName(String name);

    void displayFullName();
}
