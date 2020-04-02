-- toDoList 예제 데이터
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(1, 1, '자전거10분타기', '2020-01-01');
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(2, 2, '30분걷기', '2020-01-02');
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(3, 2, '근력운동3셋트', '2020-01-03');
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(4, 3, '하체운동3셋트', '2020-02-01');
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(5, 3, '점심샐러드먹기', '2020-02-02');
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(6, 4, '일요일등산하기', '2020-02-03');
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(7, 5, '아침운동30분하기', '2020-03-01');
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(8, 6, '식단조절하기', '2020-03-02');
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(9, 6, '상체운동하기', '2020-03-03');
insert into to_do_list(to_do_list_no, member_no, memo, create_date)
  values(10, 7, '일주일에 3일이상 운동하기', '2020-03-04');

  
-- 운동내역 예제 데이터
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(1, 1, '2020-01-01', '60', '800');
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(1, 2, '2020-01-02', '40', '500');
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(1, 3, '2020-01-03', '100', '1000');
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(2, 1, '2020-02-01', '120', '1200');
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(2, 2, '2020-02-01', '30', '400');
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(3, 1, '2020-03-03', '10', '50');
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(4, 2, '2020-03-05', '70', '900');
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(5, 3, '2020-04-03', '60', '400');
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(6, 4, '2020-04-03', '80', '800');
insert into workout_list(member_no, workout_no, workout_date, workout_amount, kcal)
  values(7, 3, '2020-05-01', '40', '500');
  
  
-- 운동 예제 데이터
insert into workout(workout_no, name, unit)
  values(1, '조깅', '분');
insert into workout(workout_no, name, unit)
  values(2, '수영', '분');
insert into workout(workout_no, name, unit)
  values(3, '등산', '분');
insert into workout(workout_no, name, unit)
  values(4, '서핑', '분');
insert into workout(workout_no, name, unit)
  values(5, '헬스', '분');
insert into workout(workout_no, name, unit)
  values(6, '걷기', '걸음수');
insert into workout(workout_no, name, unit)
  values(7, '요가', '분');
insert into workout(workout_no, name, unit)
  values(8, '필라테스', '분');
insert into workout(workout_no, name, unit)
  values(9, '테니스', '분');
insert into workout(workout_no, name, unit)
  values(10, '배드민턴', '분');
  
  
-- 캘린터 첨부파일
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(1, 1, 'user/user/com/bitcamp', 'a.gif');
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(2, 1, 'user/user/com/bitcamp1', 'a1.gif');
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(3, 2, 'user/user/com/bitcamp2', 'b1.mp4');
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(3, 3, 'user/user/com/bitcamp2', 'b2.png');
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(4, 4, 'user/user/com/bitcamp3', 'c1.png');
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(4, 4, 'users/users/com/bitcamp3', 'd1.gif');
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(7, 5, 'users/users/com/bitcamp4', 'a3.mp4');
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(8, 1, 'users/users/com/bitcamp5', 'e1.gif');
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(9, 2, 'users/users/com/bitcamp6', 'e2.gif');
insert into calendar_files(file_no, calendar_no, path, filetype)
  values(10, 4, 'users/users/com/bitcamp9', 'e3.mp4');
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  