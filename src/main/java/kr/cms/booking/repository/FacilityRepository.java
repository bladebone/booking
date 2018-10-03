package kr.cms.booking.repository;

import kr.cms.booking.domain.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Long> {

    int countBySiteId(String siteId);
}
