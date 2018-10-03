package kr.cms.booking.repository;

import kr.cms.booking.domain.BookingReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingReasonRepository extends JpaRepository<BookingReason, Long> {
}
