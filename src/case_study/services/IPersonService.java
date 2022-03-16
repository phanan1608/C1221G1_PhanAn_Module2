package case_study.services;

import case_study.models.Person;

import java.util.List;

public interface IPersonService extends IService {
    void edit(int index, Person person);

    List<Person> getList();

}

