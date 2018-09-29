package kr.cms.booking.domain;

import kr.cms.booking.repository.BookingRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingRepositoryTest {

    @Autowired
    BookingRepository bookingRepository;

    @After
    public void cleanup() {
        bookingRepository.deleteAll();
    }

    @Test
    public void 예약정보저장_불러오기() {
        bookingRepository.save(Booking.builder()
                .facilityId(11)
                .year(2018)
                .weekOfYear(1)
                .bookingDate(LocalDateTime.now())
                .bookingTimeId(11)
                .meetingTitleId(2)
                .userId(5899)
                .build());

        List<Booking> bookingList = bookingRepository.findAll();

        Booking booking = bookingList.get(0);
        assertThat(booking.getYear(), is(2018));
        assertThat(booking.getUserId(), is(5899L));
    }

    @Test
    public void BaseTimeEntity_등록() {
        //given
        LocalDateTime now = LocalDateTime.now();
        bookingRepository.save(Booking.builder()
                .facilityId(11)
                .year(2018)
                .weekOfYear(1)
                .bookingDate(LocalDateTime.now())
                .bookingTimeId(11)
                .meetingTitleId(2)
                .userId(5899)
                .build());

        //when
        List<Booking> postsList = bookingRepository.findAll();

        //then
        Booking booking = postsList.get(0);
        assertTrue(booking.getCreatedDate().isAfter(now));
        assertTrue(booking.getModifiedDate().isAfter(now));
    }
}
