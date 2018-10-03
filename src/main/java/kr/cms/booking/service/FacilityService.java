package kr.cms.booking.service;

import kr.cms.booking.dto.FacilityResponseDto;
import kr.cms.booking.repository.FacilityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class FacilityService {
    private FacilityRepository facilityRepository;

    @Transactional(readOnly = true)
    public List<FacilityResponseDto> findAll() {
        return facilityRepository.findAll()
                .stream().map(FacilityResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public int countBySiteId(String siteId) {
        return facilityRepository.countBySiteId(siteId);
    }

    /*
    void insert(Facility facilityInfo);

    void update(Facility facilityInfo);

    void delete(Facility facilityInfo);
    */
}
