-- 회원정보 샘플 데이터
insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(1, 'id회원', '회원1', 1, '19990102', '01011112222', 'user1@gmail.com', password('1111'), 
'user1.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유1', '목표', 0);

insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(2, 'id회원2', '회원2', 1, '19990102', '01011112222', 'user2@gmail.com', password('1111'), 
'user2.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유2', '목표2', 0);

insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(3, 'id회원3', '회원3', 1, '19990102', '01011112222', 'user3@gmail.com', password('1111'), 
'user3.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유3', '목표3', 0);

insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(4, 'id회원4', '회원4', 1, '19990102', '01011112222', 'user4@gmail.com', password('1111'), 
'user4.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유4', '목표4', 0);

insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(5, 'id회원5', '회원5', 1, '19990102', '01011112222', 'user5@gmail.com', password('1111'), 
'user5.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유5', '목표5', 0);

insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(6, 'id회원6', '회원6', 1, '19990102', '01011112222', 'user6@gmail.com', password('1111'), 
'user6.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유6', '목표6', 0);

insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(7, 'id회원7', '회원7', 1, '19990102', '01011112222', 'user7@gmail.com', password('1111'), 
'user7.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유7', '목표7', 0);

insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(8, 'id회원8', '회원8', 1, '19990102', '01011112222', 'user8@gmail.com', password('1111'), 
'user8.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유8', '목표8', 0);

insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(9, 'id회원9', '회원9', 1, '19990102', '01011112222', 'user9@gmail.com', password('1111'), 
'user9.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유9', '목표9', 0);

insert into members(member_no, id, name, gender, birth, tel, email, password, 
photo, create_date, withdrawal, withdrawal_date, withdrawal_reason, goal, goal_in)
value(10, 'id회원10', '회원10', 1, '19990102', '01011112222', 'user10@gmail.com', password('1111'), 
'user10.jpg', '2020-01-01', 1, '2021-01-01', '탈퇴이유10', '목표10', 0);

-- 체중 샘플 데이터

insert into weight(weight_no, member_no, weight, measure_date)
value (1, 1, 65, '2020-04-02');

insert into weight(weight_no, member_no, weight, measure_date)
value (1, 1, 64, '2020-04-03');

insert into weight(weight_no, member_no, weight, measure_date)
value (3, 2, 70, '2020-04-02');

insert into weight(weight_no, member_no, weight, measure_date)
value (4, 3, 80, '2020-04-02');

insert into weight(weight_no, member_no, weight, measure_date)
value (5, 4, 100, '2020-04-02');

insert into weight(weight_no, member_no, weight, measure_date)
value (6, 5, 95, '2020-04-02');

insert into weight(weight_no, member_no, weight, measure_date)
value (7, 6, 67, '2020-04-02');

insert into weight(weight_no, member_no, weight, measure_date)
value (8, 7, 54, '2020-04-02');

insert into weight(weight_no, member_no, weight, measure_date)
value (8, 8, 99, '2020-04-02');

insert into weight(weight_no, member_no, weight, measure_date)
value (9, 8, 97, '2020-04-03');

insert into weight(weight_no, member_no, weight, measure_date)
value (9, 9, 77, '2020-04-02');

insert into weight(weight_no, member_no, weight, measure_date)
value (10, 10, 66, '2020-04-02');


-- 코칭프로그램 샘플데이터

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (1, 1, '4주안에 복근만들기', '4주안에 복근을 만들 수 있습니다', 450000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (2, 1, '4주안에 팔뚝살 빼기', '4주안에 팔뚝을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (3, 2, '4주안에 뱃살 없애기1', '4주안에 뱃살을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (4, 2, '4주안에 뱃살 없애기2', '4주안에 뱃살을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (5, 3, '4주안에 뱃살 없애기3', '4주안에 뱃살을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (6, 4, '4주안에 뱃살 없애기4', '4주안에 뱃살을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (7, 5, '4주안에 뱃살 없애기5', '4주안에 뱃살을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (8, 6, '4주안에 뱃살 없애기6', '4주안에 뱃살을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (9, 7, '4주안에 뱃살 없애기7', '4주안에 뱃살을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (10, 8, '4주안에 뱃살 없애기8', '4주안에 뱃살을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (11, 9, '4주안에 뱃살 없애기9', '4주안에 뱃살을 뺄 수 있습니다', 350000);

insert into coaching_programs(program_no, coach_no, name, introduce, fee)
value (12, 10, '4주안에 뱃살 없애기10', '4주안에 뱃살을 뺄 수 있습니다', 350000);






