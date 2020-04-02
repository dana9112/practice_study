-- 운동태그
insert into workout_tags(tag_no, name)
  values (1,'하체튼튼');
insert into workout_tags(tag_no, name)
  values (2,'상체튼튼');
insert into workout_tags(tag_no, name)
  values (3,'근육위주');
insert into workout_tags(tag_no, name)
  values (4,'대회위주');
insert into workout_tags(tag_no, name)
  values (5,'체력위주');
insert into workout_tags(tag_no, name)
  values (6,'체중감략');
insert into workout_tags(tag_no, name)
  values (7,'제활위주');
insert into workout_tags(tag_no, name)
  values (8,'생활개선');
  
-- 코칭방식
insert into coaching_systems(coaching_system_no, name)
  values (1, '온라인');
insert into coaching_systems(coaching_system_no, name)
  values (2, '오프라인');

--코칭프로그램방식
insert into program_coaching_system(coanig_system_no, program_no)
  values (1, 1);
insert into program_coaching_system(coanig_system_no, program_no)
  values (1, 2);
insert into program_coaching_system(coanig_system_no, program_no)
  values (1, 3);
insert into program_coaching_system(coanig_system_no, program_no)
  values (1, 4);
insert into program_coaching_system(coanig_system_no, program_no)
  values (1, 5);
insert into program_coaching_system(coanig_system_no, program_no)
  values (2, 6);
insert into program_coaching_system(coanig_system_no, program_no)
  values (2, 7);
insert into program_coaching_system(coanig_system_no, program_no)
  values (2, 8);
insert into program_coaching_system(coanig_system_no, program_no)
  values (2, 9);
insert into program_coaching_system(coanig_system_no, program_no)
  values (2, 10);
  
-- 코칭프로그램운동태그
insert into coaching_program_tags(tag_no, program_no)
  values (1,1)
insert into coaching_program_tags(tag_no, program_no)
  values (1,2)
insert into coaching_program_tags(tag_no, program_no)
  values (2,3)
insert into coaching_program_tags(tag_no, program_no)
  values (3,3)
insert into coaching_program_tags(tag_no, program_no)
  values (3,4)
insert into coaching_program_tags(tag_no, program_no)
  values (4,2)
insert into coaching_program_tags(tag_no, program_no)
  values (5,6)
insert into coaching_program_tags(tag_no, program_no)
  values (6,5)
insert into coaching_program_tags(tag_no, program_no)
  values (6,3)
insert into coaching_program_tags(tag_no, program_no)
  values (8,3)
  

-- 음식게시판댓글
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (1,1,1,'후회된다. 내일부터 다시 시작하자', '2020-01-01');
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (2,2,1,'샐러드만 먹으니 배고프다.', '2020-02-01');
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (3,3,3,'후회된다. 내일부터 다시 시작하자1', '2020-03-01');
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (4,4,3,'후회된다. 내일부터 다시 시작하자2', '2020-04-01');
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (5,5,4,'후회된다. 내일부터 다시 시작하자3', '2020-05-01');
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (6,6,4,'후회된다. 내일부터 다시 시작하자4', '2020-06-01');
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (7,7,5,'후회된다. 내일부터 다시 시작하자5', '2020-07-01');
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (8,8,6,'후회된다. 내일부터 다시 시작하자6', '2020-08-01');
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (9,9,7,'후회된다. 내일부터 다시 시작하자7', '2020-09-01');
insert int food_board_comments(comment_no, food_board_no, coach_no, content, create_date)
  values into (10,10,9,'후회된다. 내일부터 다시 시작하자8', '2020-10-01');
  
  
-- 회원코칭프로그램일정
insert into member_program_calendar (calendar_no, member_program_no, plan, workout_date)
  values into (1,1,'하체위주', '2020-01-01');
insert into member_program_calendar (calendar_no, member_program_no, plan, workout_date)
  values into (1,1,'하체위주', '2020-01-01');
insert into member_program_calendar (calendar_no, member_program_no, plan, workout_date)
  values into (1,1,'하체위주', '2020-01-01');
insert into member_program_calendar (calendar_no, member_program_no, plan, workout_date)
  values into (1,1,'하체위주', '2020-01-01');
insert into member_program_calendar (calendar_no, member_program_no, plan, workout_date)
  values into (1,1,'하체위주', '2020-01-01');
insert into member_program_calendar (calendar_no, member_program_no, plan, workout_date)
  values into (1,1,'하체위주', '2020-01-01');
insert into member_program_calendar (calendar_no, member_program_no, plan, workout_date)
  values into (1,1,'하체위주', '2020-01-01');
insert into member_program_calendar (calendar_no, member_program_no, plan, workout_date)
  values into (1,1,'하체위주', '2020-01-01');
insert into member_program_calendar (calendar_no, member_program_no, plan, workout_date)
  values into (1,1,'하체위주', '2020-01-01');




  