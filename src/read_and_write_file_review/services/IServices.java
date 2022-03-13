package read_and_write_file_review.services;

public interface IServices {
    void add();

    void display();

    void delete(String licensePlatesDelete);

    boolean searchByLicensePlates(String licensePlates);

}
