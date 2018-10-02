package kr.cms.booking.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Service
public class ConstService {

    public List<Map<String, Object>> dayOfWeekList() {
        List<Map<String, Object>> dayOfWeekList = new ArrayList<>();

        Map<String, Object> dayOfWeek = new HashMap<>();
        dayOfWeek.put("eng", "sun");
        dayOfWeek.put("kor", "일");
        dayOfWeekList.add(dayOfWeek);

        dayOfWeek = new HashMap<>();
        dayOfWeek.put("eng", "mon");
        dayOfWeek.put("kor", "월");
        dayOfWeekList.add(dayOfWeek);

        dayOfWeek = new HashMap<>();
        dayOfWeek.put("eng", "tue");
        dayOfWeek.put("kor", "화");
        dayOfWeekList.add(dayOfWeek);

        dayOfWeek = new HashMap<>();
        dayOfWeek.put("eng", "wed");
        dayOfWeek.put("kor", "수");
        dayOfWeekList.add(dayOfWeek);

        dayOfWeek = new HashMap<>();
        dayOfWeek.put("eng", "thu");
        dayOfWeek.put("kor", "목");
        dayOfWeekList.add(dayOfWeek);

        dayOfWeek = new HashMap<>();
        dayOfWeek.put("eng", "fri");
        dayOfWeek.put("kor", "금");
        dayOfWeekList.add(dayOfWeek);

        dayOfWeek = new HashMap<>();
        dayOfWeek.put("eng", "sat");
        dayOfWeek.put("kor", "토");
        dayOfWeekList.add(dayOfWeek);

        return dayOfWeekList;
    }


}
