package case_study.services.person;

import case_study.models.person.Person;
import case_study.services.IService;

public interface IPersonService extends IService {
    void edit(int index, Person person);
}

