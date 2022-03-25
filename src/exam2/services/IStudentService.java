package exam2.services;

import exam2.models.Student;
import exam2.utils.NotFoundStudentException;

import java.util.List;

public interface IStudentService extends IService {
    void add(Student object);

    @Override
    void displayList();

    void remove(Student object);

    List<Student> getList();

    void search(String searchInformation);

    Student findObjectByStudentCode(int studentCode) throws NotFoundStudentException;

}
