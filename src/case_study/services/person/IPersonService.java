package case_study.services.person;

import case_study.models.person.Person;
import case_study.services.IService;

import java.util.List;

public interface IPersonService extends IService {
    void edit(int index, Person person);

    List<Person> getList();

}

