package case_study.services.booking;

import case_study.models.booking.Contract;
import case_study.services.IService;

public interface IContactService extends IService {
    void edit(int index, Contract contract);
}
