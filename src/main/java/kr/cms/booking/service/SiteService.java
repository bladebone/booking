package kr.cms.booking.service;

import kr.cms.booking.dto.SiteResponseDto;
import kr.cms.booking.repository.SiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SiteService {
    private SiteRepository siteRepository;
    private FacilityService facilityService;

    @Transactional(readOnly = true)
    public List<SiteResponseDto> findAll() {
        return siteRepository.findAll()
                .stream().map(SiteResponseDto::new)
                .map(siteResponseDto -> {
                    siteResponseDto.setFacilityCount(facilityService.countBySiteId(siteResponseDto.getCode()));
                    return siteResponseDto;
                })
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public SiteResponseDto findByCode(String code) {
        return new SiteResponseDto(siteRepository.findByCode(code));
    }
}
