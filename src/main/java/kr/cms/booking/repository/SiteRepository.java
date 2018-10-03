package kr.cms.booking.repository;

import kr.cms.booking.domain.Site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository extends JpaRepository<Site, Long> {

    Site findByCode(String code);
}
