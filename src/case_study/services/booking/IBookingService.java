package case_study.services.booking;

import case_study.models.booking.Booking;
import case_study.services.IService;

import java.util.Set;

public interface IBookingService extends IService {
    Set<Booking> getList();
}
