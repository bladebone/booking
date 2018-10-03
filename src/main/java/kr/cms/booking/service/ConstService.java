package kr.cms.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.*;

@AllArgsConstructor
@Service
public class ConstService {

    public List<Map<String, Object>> dayOfWeekList() {
        List<Map<String, Object>> dayOfWeekList = new ArrayList<>();

        Map<String, Object> dayOfWeekMap;
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            dayOfWeekMap = new HashMap<>();
            dayOfWeekMap.put("eng", dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ROOT));
            dayOfWeekMap.put("kor", dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREA));
            dayOfWeekList.add(dayOfWeekMap);
        }

        return dayOfWeekList;
    }


}
