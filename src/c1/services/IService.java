package c1.services;


import c1.models.Record;
import c1.utils.NotFoundMedicalRecordException;

import java.util.List;

public interface IService<T> {
    void add(T object);

    void displayList();


    void remove(T object);

    List<Record> getList();

    Record findObjectByRecordCode(String recordCode) throws NotFoundMedicalRecordException;

}
