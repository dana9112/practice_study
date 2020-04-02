-- food_boards 예제 데이터
insert into food_boards(photo, content)
  values('cat1.jpg', '귀여운 고양이1와 식사했어요!');
insert into food_boards(photo, content)
  values('cat2.jpg', '귀여운 고양이2와 식사했어요!');
insert into food_boards(photo, content)
  values('cat3.jpg', '귀여운 고양이3와 식사했어요!');
insert into food_boards(photo, content)
  values('cat4.jpg', '귀여운 고양이4와 식사했어요!');
insert into food_boards(photo, content)
  values('cat5.jpg', '귀여운 고양이5와 식사했어요!');
insert into food_boards(member_program_no, photo, content)
  values(1, 'cat6.jpg', '귀여운 고양이6와 식사했어요!');
insert into food_boards(member_program_no, photo, content)
  values(2, 'cat7.jpg', '귀여운 고양이7와 식사했어요!');
insert into food_boards(member_program_no, photo, content)
  values(3, 'cat8.jpg', '귀여운 고양이8와 식사했어요!');
insert into food_boards(member_program_no, photo, content)
  values(4, 'cat9.jpg', '귀여운 고양이9와 식사했어요!');
insert into food_boards(member_program_no, photo, content)
  values(5, 'cat10.jpg', '귀여운 고양이10와 식사했어요!');

-- member_coaching_programs 예제 데이터
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(1, 1, '허리가 아파요', '진행완료', '2020-01-01', '2020-01-01', '2020-01-10', '2020-02-01',
         5, '후기입니다', '2020-02-01', null);
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(2, 2, '허리가 아파요', '진행 완료', '2020-01-01', '2020-01-01', '2020-01-10', '2020-02-01',
         5, '후기입니다', '2020-02-01', null);
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(3, 3, '허리가 아파요', '진행 완료', '2020-01-01', '2020-01-01', '2020-01-10', '2020-02-01',
         5, '후기입니다', '2020-02-01', null);
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(4, 4, '허리가 아파요', '진행 완료', '2020-01-01', '2020-01-01', '2020-01-10', '2020-02-01',
         5, '후기입니다', '2020-02-01', null);
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(5, 5, '허리가 아파요', '진행 완료', '2020-01-01', '2020-01-01', '2020-01-10', '2020-02-01',
         5, '후기입니다', '2020-02-01', null);
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(6, 5, '허리가 아파요', '진행중', '2020-01-01', '2020-01-01', '2020-01-10', '2020-05-01',
         null, null, '2020-02-01', null);
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(7, 4, '허리가 아파요', '진행중', '2020-01-01', '2020-01-01', '2020-01-10', '2020-05-01',
         null, null, '2020-02-01', null);
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(8, 3, '허리가 아파요', '요청대기중', '2020-01-01', null, '2020-04-10', '2020-05-01',
         null, null, '2020-02-01', null);
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(9, 2, '허리가 아파요', '요청거절됨', '2020-01-01', null, '2020-04-10', '2020-05-01',
         null, null, '2020-02-01', '허리가 아프신 분은 수강이 힘드세요.');
insert into food_boards(member_no, program_no, remark, status, request_date, pay_date,
                        start_date, end_date, star_rate, review, review_date, etc)
  values(10, 1, '허리가 아파요', '결제대기중', '2020-01-01', null, '2020-04-10', '2020-05-01',
         null, null, '2020-02-01', null);
