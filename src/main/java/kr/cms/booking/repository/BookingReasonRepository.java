package kr.cms.booking.repository;

import kr.cms.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingReasonRepository extends JpaRepository<Booking, Long> {
}
