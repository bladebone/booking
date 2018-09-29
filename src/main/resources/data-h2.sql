insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('C01', '지하1층', 1, true, now(), now());
insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('C02', '2층', 2, true, now(), now());
insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('C09', '3층', 3, true, now(), now());
insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('C03', '4층', 4, true, now(), now());
insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('C04', '5층', 5, true, now(), now());
insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('C05', '6층', 6, true, now(), now());
insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('C06', '드림센터', 7, true, now(), now());
insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('C07', '카라센터', 8, true, now(), now());
insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('C08', '5층 조이앤프리홀', 9, true, now(), now());
insert into site (code, title, sequence, is_alive, created_date, modified_date) values ('MTC', 'MTC', 10, true, now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0101', '이레실', 1, true, true, 'C01', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0102', '나눔터', 2, true, true, 'C01', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0103', '드림실', 3, true, true, 'C01', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0104', '글로리아1', 4, true, true, 'C01', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0105', '글로리아2', 5, true, true, 'C01', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0106', '글로리아3', 6, true, true, 'C01', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0120', '만나실', 7, true, true, 'C01', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0121', '두란노실', 8, true, true, 'C01', now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0201', '화평실', 1, true, true, 'C02', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0202', '믿음실1', 2, true, true, 'C02', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0205', '믿음실2', 3, true, true, 'C02', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0203', '새부대실', 4, true, true, 'C02', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0204', '비전채플', 5, true, true, 'C02', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0206', '오병이어실', 6, true, true, 'C02', now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0901', '킹덤센터 여호수아', 1, true, true, 'C09', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0902', '킹덤센터 갈렙', 2, true, true, 'C09', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0903', '킹덤센터 다윗', 3, true, true, 'C09', now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0301', '자모실', 1, true, true, 'C03', now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0401', '코이노니아', 1, true, true, 'C04', now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0501', '훈련센터홀', 1, true, true, 'C05', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0502', '훈련센터방', 2, true, true, 'C05', now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0603', '드림센터1', 1, true, true, 'C06', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0601', '드림센터2 - 교실1', 2, true, true, 'C06', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0605', '드림센터2 - 교실2', 3, true, true, 'C06', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0604', '드림센터3', 4, true, true, 'C06', now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0701', '카라센터', 1, true, true, 'C07', now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0801', '1번 테이블', 1, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0802', '2번 테이블', 2, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0803', '3번 테이블', 3, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0804', '4번 테이블', 4, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0805', '5번 테이블', 5, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0806', '6번 테이블', 6, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0807', '7번 테이블', 7, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0808', '8번 테이블', 8, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0809', '9번 테이블', 9, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0810', '10번 테이블', 10, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0811', '11번 테이블', 11, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0812', '12번 테이블', 12, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0813', '13번 테이블', 13, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0814', '14번 테이블', 14, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0815', '15번 테이블', 15, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0816', '16번 테이블', 16, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0817', '17번 테이블', 17, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0818', '18번 테이블', 18, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0819', '19번 테이블', 19, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0820', '20번 테이블', 20, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0821', '21번 테이블', 21, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0822', '22번 테이블', 22, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0823', '23번 테이블', 23, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0891', '바베큐존 A', 25, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0892', '바베큐존 B', 26, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0893', '바베큐존 C', 27, true, true, 'C08', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('C0894', '바베큐존 D', 28, true, true, 'C08', now(), now());

insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('MTC02', '소모임실(베드로)', 1, true, true, 'MTC', now(), now());
insert into facility (code, title, sequence, bookable, is_alive, site_id, created_date, modified_date) values ('MTC03', '소모임실(요한)', 2, true, true, 'MTC', now(), now());

insert into booking_reason (code, title, sequence, is_for_user, created_date, modified_date) values ('G01', '팀모임', 1, true, now(), now());
insert into booking_reason (code, title, sequence, is_for_user, created_date, modified_date) values ('G02', '셀모임', 2, true, now(), now());
insert into booking_reason (code, title, sequence, is_for_user, created_date, modified_date) values ('G03', '일대일', 3, true, now(), now());
insert into booking_reason (code, title, sequence, is_for_user, created_date, modified_date) values ('G04', '기도모임', 4, true, now(), now());
insert into booking_reason (code, title, sequence, is_for_user, created_date, modified_date) values ('G05', '부서모임', 5, true, now(), now());
insert into booking_reason (code, title, sequence, is_for_user, created_date, modified_date) values ('G99', '기타모임', 6, true, now(), now());

insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:06:00', 6, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:06:30', 6, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:07:00', 7, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:07:30', 7, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:08:00', 8, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:08:30', 8, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:09:00', 9, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:09:30', 9, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:10:00', 10, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:10:30', 10, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:11:00', 11, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:11:30', 11, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:12:00', 12, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('AM:12:30', 12, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:1:00', 13, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:1:30', 13, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:2:00', 14, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:2:30', 14, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:3:00', 15, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:3:30', 15, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:4:00', 16, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:4:30', 16, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:5:00', 17, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:5:30', 17, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:6:00', 18, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:6:30', 18, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:7:00', 19, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:7:30', 19, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:8:00', 20, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:8:30', 20, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:9:00', 21, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:9:30', 21, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:10:00', 22, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:10:30', 22, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:11:00', 23, 0, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:11:30', 23, 30, true, now(), now());
insert into booking_time (code, hour, minute, bookable, created_date, modified_date) values ('PM:12:00', 24, 0, false, now(), now());
