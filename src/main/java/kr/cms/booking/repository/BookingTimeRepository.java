package kr.cms.booking.repository;

import kr.cms.booking.domain.BookingTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingTimeRepository extends JpaRepository<BookingTime, Long> {
}
