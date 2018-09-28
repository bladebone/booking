package kr.cms.booking.service;

import kr.cms.booking.domain.Facility;

import java.util.List;

public interface FacilityService {

    List<Facility> findAll();

    void insert(Facility facilityInfo);

    void update(Facility facilityInfo);

    void delete(Facility facilityInfo);
}
