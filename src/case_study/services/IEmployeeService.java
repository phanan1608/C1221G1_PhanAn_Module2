package case_study.services;

import case_study.models.Person;

import java.util.List;

public interface IEmployeeService extends IService {
    void edit(int index, Person person);

    List<Person> getListEmployee();
}
