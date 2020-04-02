-- 회원정보
DROP TABLE IF EXISTS members RESTRICT;

-- 코치
DROP TABLE IF EXISTS coaches RESTRICT;

-- 코칭프로그램
DROP TABLE IF EXISTS coaching_programs RESTRICT;

-- 운동태그
DROP TABLE IF EXISTS workout_tags RESTRICT;

-- 코칭방식
DROP TABLE IF EXISTS coaching_systems RESTRICT;

-- 코칭프로그램게시판
DROP TABLE IF EXISTS coaching_program_boards RESTRICT;

-- 회원코칭프로그램
DROP TABLE IF EXISTS member_coaching_programs RESTRICT;

-- toDoList
DROP TABLE IF EXISTS to_do_list RESTRICT;

-- 운동내역
DROP TABLE IF EXISTS workout_list RESTRICT;

-- 음식게시판
DROP TABLE IF EXISTS food_boards RESTRICT;

-- 음식게시판댓글
DROP TABLE IF EXISTS food_board_comments RESTRICT;

-- 체중
DROP TABLE IF EXISTS weight RESTRICT;

-- 회원코칭프로그램일정
DROP TABLE IF EXISTS member_program_calendar RESTRICT;

-- 첨부파일
DROP TABLE IF EXISTS calendar_files RESTRICT;

-- 코칭프로그램운동태그
DROP TABLE IF EXISTS coaching_program_tags RESTRICT;

-- 운동
DROP TABLE IF EXISTS workout RESTRICT;

-- 코칭프로그램방식
DROP TABLE IF EXISTS program_coaching_systems RESTRICT;

-- 회원정보
CREATE TABLE members (
  member_no         INTEGER      NOT NULL COMMENT '일반회원번호', -- 일반회원번호
  id                VARCHAR(50)  NOT NULL COMMENT '아이디', -- 아이디
  name              VARCHAR(30)  NOT NULL COMMENT '이름', -- 이름
  gender            INTEGER      NOT NULL COMMENT '성별', -- 성별
  birth             VARCHAR(20)  NOT NULL COMMENT '생년월일', -- 생년월일
  tel               VARCHAR(20)  NOT NULL COMMENT '휴대폰번호', -- 휴대폰번호
  email             VARCHAR(50)  NOT NULL COMMENT '이메일', -- 이메일
  password          VARCHAR(50)  NOT NULL COMMENT '비밀번호', -- 비밀번호
  photo             VARCHAR(255) NULL     COMMENT '사진', -- 사진
  create_date       DATE         NOT NULL DEFAULT now() COMMENT '가입일', -- 가입일
  withdrawal        INTEGER      NULL     COMMENT '탈퇴여부', -- 탈퇴여부
  withdrawal_date   DATE         NULL     DEFAULT now() COMMENT '탈퇴날짜', -- 탈퇴날짜
  withdrawal_reason TEXT         NULL     COMMENT '탈퇴이유', -- 탈퇴이유
  goal              TEXT         NULL     COMMENT '목표', -- 목표
  goal_in           INTEGER      NULL     COMMENT '목표달성여부' -- 목표달성여부
)
COMMENT '회원정보';

-- 회원정보
ALTER TABLE members
  ADD CONSTRAINT PK_members -- 회원정보 기본키
    PRIMARY KEY (
      member_no -- 일반회원번호
    );

-- 회원정보 유니크 인덱스
CREATE UNIQUE INDEX UIX_members
  ON members ( -- 회원정보
    id ASC,    -- 아이디
    tel ASC,   -- 휴대폰번호
    email ASC  -- 이메일
  );

ALTER TABLE members
  MODIFY COLUMN member_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '일반회원번호';

-- 코치
CREATE TABLE coaches (
  coach_no          INTEGER      NOT NULL COMMENT '코치번호', -- 코치번호
  id                VARCHAR(50)  NOT NULL COMMENT '아이디', -- 아이디
  name              VARCHAR(30)  NOT NULL COMMENT '이름', -- 이름
  gender            INTEGER      NOT NULL COMMENT '성별', -- 성별
  birth             VARCHAR(20)  NOT NULL COMMENT '생년월일', -- 생년월일
  tel               VARCHAR(20)  NOT NULL COMMENT '휴대폰번호', -- 휴대폰번호
  email             VARCHAR(50)  NOT NULL COMMENT '이메일', -- 이메일
  password          VARCHAR(50)  NOT NULL COMMENT '비밀번호', -- 비밀번호
  photo             VARCHAR(255) NOT NULL COMMENT '사진', -- 사진
  area              VARCHAR(255) NOT NULL COMMENT '수업가능지역', -- 수업가능지역
  career            TEXT         NULL     COMMENT '경력사항', -- 경력사항
  certification     TEXT         NULL     COMMENT '보유자격증', -- 보유자격증
  introduce         TEXT         NOT NULL COMMENT '강사소개', -- 강사소개
  members           INTEGER      NULL     COMMENT '회원수', -- 회원수
  create_date       DATE         NOT NULL DEFAULT now() COMMENT '가입일', -- 가입일
  bank              VARCHAR(30)  NULL     COMMENT '은행', -- 은행
  account           VARCHAR(30)  NULL     COMMENT '계좌번호', -- 계좌번호
  work_type         VARCHAR(50)  NOT NULL COMMENT '유형', -- 유형
  address           VARCHAR(255) NULL     COMMENT '주소', -- 주소
  latitude          VARCHAR(50)  NULL     COMMENT '위도', -- 위도
  longitude         VARCHAR(50)  NULL     COMMENT '경도', -- 경도
  withdrawal        INTEGER      NULL     COMMENT '탈퇴여부', -- 탈퇴여부
  withdrawal_date   DATE         NULL     COMMENT '탈퇴날짜', -- 탈퇴날짜
  withdrawal_reason TEXT         NULL     COMMENT '탈퇴이유' -- 탈퇴이유
)
COMMENT '코치';

-- 코치
ALTER TABLE coaches
  ADD CONSTRAINT PK_coaches -- 코치 기본키
    PRIMARY KEY (
      coach_no -- 코치번호
    );

-- 코치 유니크 인덱스
CREATE UNIQUE INDEX UIX_coaches
  ON coaches ( -- 코치
    id ASC,      -- 아이디
    tel ASC,     -- 휴대폰번호
    email ASC,   -- 이메일
    account ASC  -- 계좌번호
  );

ALTER TABLE coaches
  MODIFY COLUMN coach_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '코치번호';

-- 코칭프로그램
CREATE TABLE coaching_programs (
  program_no INTEGER     NOT NULL COMMENT '프로그램번호', -- 프로그램번호
  coach_no   INTEGER     NOT NULL COMMENT '코치번호', -- 코치번호
  name       VARCHAR(30) NOT NULL COMMENT '프로그램명', -- 프로그램명
  introduce  TEXT        NOT NULL COMMENT '소개', -- 소개
  fee        INTEGER     NOT NULL COMMENT '수강료' -- 수강료
)
COMMENT '코칭프로그램';

-- 코칭프로그램
ALTER TABLE coaching_programs
  ADD CONSTRAINT PK_coaching_programs -- 코칭프로그램 기본키
    PRIMARY KEY (
      program_no -- 프로그램번호
    );

ALTER TABLE coaching_programs
  MODIFY COLUMN program_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '프로그램번호';

-- 운동태그
CREATE TABLE workout_tags (
  tag_no INTEGER     NOT NULL COMMENT '운동태그번호', -- 운동태그번호
  name   VARCHAR(30) NOT NULL COMMENT '태그명' -- 태그명
)
COMMENT '운동태그';

-- 운동태그
ALTER TABLE workout_tags
  ADD CONSTRAINT PK_workout_tags -- 운동태그 기본키
    PRIMARY KEY (
      tag_no -- 운동태그번호
    );

ALTER TABLE workout_tags
  MODIFY COLUMN tag_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '운동태그번호';

-- 코칭방식
CREATE TABLE coaching_systems (
  coaching_system_no INTEGER     NOT NULL COMMENT '코칭방식번호', -- 코칭방식번호
  name               VARCHAR(30) NOT NULL COMMENT '코칭방식이름' -- 코칭방식이름
)
COMMENT '코칭방식';

-- 코칭방식
ALTER TABLE coaching_systems
  ADD CONSTRAINT PK_coaching_systems -- 코칭방식 기본키
    PRIMARY KEY (
      coaching_system_no -- 코칭방식번호
    );

ALTER TABLE coaching_systems
  MODIFY COLUMN coaching_system_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '코칭방식번호';

-- 코칭프로그램게시판
CREATE TABLE coaching_program_boards (
  program_board_no INTEGER NOT NULL COMMENT '게시글번호', -- 게시글번호
  coach_no         INTEGER NOT NULL COMMENT '코치번호', -- 코치번호
  program_no       INTEGER NOT NULL COMMENT '프로그램번호', -- 프로그램번호
  content          TEXT    NOT NULL COMMENT '내용', -- 내용
  create_date      DATE    NOT NULL DEFAULT now() COMMENT '등록일' -- 등록일
)
COMMENT '코칭프로그램게시판';

-- 코칭프로그램게시판
ALTER TABLE coaching_program_boards
  ADD CONSTRAINT PK_coaching_program_boards -- 코칭프로그램게시판 기본키
    PRIMARY KEY (
      program_board_no -- 게시글번호
    );

ALTER TABLE coaching_program_boards
  MODIFY COLUMN program_board_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '게시글번호';

-- 회원코칭프로그램
CREATE TABLE member_coaching_programs (
  member_program_no INTEGER     NOT NULL COMMENT '회원코칭프로그램번호', -- 회원코칭프로그램번호
  member_no         INTEGER     NOT NULL COMMENT '일반회원번호', -- 일반회원번호
  program_no        INTEGER     NOT NULL COMMENT '프로그램번호', -- 프로그램번호
  remark            TEXT        NULL     COMMENT '특이사항', -- 특이사항
  status            VARCHAR(50) NOT NULL COMMENT '상태', -- 상태
  request_date      DATETIME    NOT NULL DEFAULT now() COMMENT '신청일', -- 신청일
  pay_date          DATETIME    NULL     COMMENT '결제일', -- 결제일
  start_date        DATE        NOT NULL COMMENT '시작일', -- 시작일
  end_date          DATE        NOT NULL COMMENT '종료일', -- 종료일
  star_rate         INTEGER     NULL     COMMENT '별점', -- 별점
  review            TEXT        NULL     COMMENT '후기', -- 후기
  review_date       DATETIME    NULL     COMMENT '후기작성일', -- 후기작성일
  etc               TEXT        NULL     COMMENT '비고' -- 비고
)
COMMENT '회원코칭프로그램';

-- 회원코칭프로그램
ALTER TABLE member_coaching_programs
  ADD CONSTRAINT PK_member_coaching_programs -- 회원코칭프로그램 기본키
    PRIMARY KEY (
      member_program_no -- 회원코칭프로그램번호
    );

ALTER TABLE member_coaching_programs
  MODIFY COLUMN member_program_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원코칭프로그램번호';

-- toDoList
CREATE TABLE to_do_list (
  to_do_list_no INTEGER NOT NULL COMMENT '해야할일번호', -- 해야할일번호
  member_no     INTEGER NOT NULL COMMENT '일반회원번호', -- 일반회원번호
  memo          TEXT    NOT NULL COMMENT '해야할것', -- 해야할것
  create_date   DATE    NOT NULL DEFAULT now() COMMENT '등록일' -- 등록일
)
COMMENT 'toDoList';

-- toDoList
ALTER TABLE to_do_list
  ADD CONSTRAINT PK_to_do_list -- toDoList 기본키
    PRIMARY KEY (
      to_do_list_no -- 해야할일번호
    );

ALTER TABLE to_do_list
  MODIFY COLUMN to_do_list_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '해야할일번호';

-- 운동내역
CREATE TABLE workout_list (
  workout_list_no INTEGER  NOT NULL COMMENT '운동내역번호', -- 운동내역번호
  member_no       INTEGER  NOT NULL COMMENT '일반회원번호', -- 일반회원번호
  workout_no      INTEGER  NOT NULL COMMENT '운동번호', -- 운동번호
  workout_date    DATETIME NOT NULL DEFAULT now() COMMENT '시행날짜', -- 시행날짜
  workout_amount  INTEGER  NOT NULL COMMENT '운동량', -- 운동량
  kcal            INTEGER  NULL     COMMENT '소모칼로리' -- 소모칼로리
)
COMMENT '운동내역';

-- 운동내역
ALTER TABLE workout_list
  ADD CONSTRAINT PK_workout_list -- 운동내역 기본키
    PRIMARY KEY (
      workout_list_no -- 운동내역번호
    );

ALTER TABLE workout_list
  MODIFY COLUMN workout_list_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '운동내역번호';

-- 음식게시판
CREATE TABLE food_boards (
  food_board_no     INTEGER      NOT NULL COMMENT '음식게시판번호', -- 음식게시판번호
  member_program_no INTEGER      NULL     COMMENT '회원코칭프로그램번호', -- 회원코칭프로그램번호
  photo             VARCHAR(255) NULL     COMMENT '사진', -- 사진
  content           TEXT         NOT NULL COMMENT '내용', -- 내용
  modified_date     DATE         NOT NULL DEFAULT now() COMMENT '수정일' -- 수정일
)
COMMENT '음식게시판';

-- 음식게시판
ALTER TABLE food_boards
  ADD CONSTRAINT PK_food_boards -- 음식게시판 기본키
    PRIMARY KEY (
      food_board_no -- 음식게시판번호
    );

ALTER TABLE food_boards
  MODIFY COLUMN food_board_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '음식게시판번호';

-- 음식게시판댓글
CREATE TABLE food_board_comments (
  comment_no    INTEGER NOT NULL COMMENT '댓글번호', -- 댓글번호
  food_board_no INTEGER NOT NULL COMMENT '음식게시판번호', -- 음식게시판번호
  coach_no      INTEGER NULL     COMMENT '코치번호', -- 코치번호
  content       TEXT    NOT NULL COMMENT '내용', -- 내용
  create_date   DATE    NOT NULL DEFAULT now() COMMENT '등록일' -- 등록일
)
COMMENT '음식게시판댓글';

-- 음식게시판댓글
ALTER TABLE food_board_comments
  ADD CONSTRAINT PK_food_board_comments -- 음식게시판댓글 기본키
    PRIMARY KEY (
      comment_no -- 댓글번호
    );

ALTER TABLE food_board_comments
  MODIFY COLUMN comment_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '댓글번호';

-- 체중
CREATE TABLE weight (
  weight_no    INTEGER NOT NULL COMMENT '체중번호', -- 체중번호
  member_no    INTEGER NOT NULL COMMENT '일반회원번호', -- 일반회원번호
  weight       INTEGER NOT NULL COMMENT '몸무게', -- 몸무게
  measure_date DATE    NOT NULL DEFAULT now() COMMENT '측정일' -- 측정일
)
COMMENT '체중';

-- 체중
ALTER TABLE weight
  ADD CONSTRAINT PK_weight -- 체중 기본키
    PRIMARY KEY (
      weight_no -- 체중번호
    );

ALTER TABLE weight
  MODIFY COLUMN weight_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '체중번호';

-- 회원코칭프로그램일정
CREATE TABLE member_program_calendar (
  calendar_no       INTEGER NOT NULL COMMENT '회원코칭프로그램일정번호', -- 회원코칭프로그램일정번호
  member_program_no INTEGER NOT NULL COMMENT '회원코칭프로그램번호', -- 회원코칭프로그램번호
  plan              TEXT    NOT NULL COMMENT '운동계획', -- 운동계획
  workout_date      DATE    NOT NULL DEFAULT now() COMMENT '시행일' -- 시행일
)
COMMENT '회원코칭프로그램일정';

-- 회원코칭프로그램일정
ALTER TABLE member_program_calendar
  ADD CONSTRAINT PK_member_program_calendar -- 회원코칭프로그램일정 기본키
    PRIMARY KEY (
      calendar_no -- 회원코칭프로그램일정번호
    );

ALTER TABLE member_program_calendar
  MODIFY COLUMN calendar_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원코칭프로그램일정번호';

-- 첨부파일
CREATE TABLE calendar_files (
  file_no     INTEGER      NOT NULL COMMENT '첨부파일번호', -- 첨부파일번호
  calendar_no INTEGER      NOT NULL COMMENT '회원코칭프로그램일정번호', -- 회원코칭프로그램일정번호
  path        VARCHAR(255) NOT NULL COMMENT '파일경로', -- 파일경로
  file_type   VARCHAR(255) NOT NULL COMMENT '파일유형' -- 파일유형
)
COMMENT '첨부파일';

-- 첨부파일
ALTER TABLE calendar_files
  ADD CONSTRAINT PK_calendar_files -- 첨부파일 기본키
    PRIMARY KEY (
      file_no -- 첨부파일번호
    );

ALTER TABLE calendar_files
  MODIFY COLUMN file_no INTEGER NOT NULL AUTO_INCREMENT COMMENT '첨부파일번호';

-- 코칭프로그램운동태그
CREATE TABLE coaching_program_tags (
  tag_no     INTEGER NOT NULL COMMENT '운동태그번호', -- 운동태그번호
  program_no INTEGER NOT NULL COMMENT '프로그램번호' -- 프로그램번호
)
COMMENT '코칭프로그램운동태그';

-- 코칭프로그램운동태그
ALTER TABLE coaching_program_tags
  ADD CONSTRAINT PK_coaching_program_tags -- 코칭프로그램운동태그 기본키
    PRIMARY KEY (
      tag_no,     -- 운동태그번호
      program_no  -- 프로그램번호
    );

-- 운동
CREATE TABLE workout (
  workout_no INTEGER     NOT NULL COMMENT '운동번호', -- 운동번호
  name       VARCHAR(30) NOT NULL COMMENT '이름', -- 이름
  unit       VARCHAR(50) NOT NULL COMMENT '운동단위' -- 운동단위
)
COMMENT '운동';

-- 운동
ALTER TABLE workout
  ADD CONSTRAINT PK_workout -- 운동 기본키
    PRIMARY KEY (
      workout_no -- 운동번호
    );

-- 코칭프로그램방식
CREATE TABLE program_coaching_systems (
  coaching_system_no INTEGER NOT NULL COMMENT '코칭방식번호', -- 코칭방식번호
  program_no         INTEGER NOT NULL COMMENT '프로그램번호' -- 프로그램번호
)
COMMENT '코칭프로그램방식';

-- 코칭프로그램방식
ALTER TABLE program_coaching_systems
  ADD CONSTRAINT PK_program_coaching_systems -- 코칭프로그램방식 기본키
    PRIMARY KEY (
      coaching_system_no, -- 코칭방식번호
      program_no          -- 프로그램번호
    );

-- 코칭프로그램
ALTER TABLE coaching_programs
  ADD CONSTRAINT FK_coaches_TO_coaching_programs -- 코치 -> 코칭프로그램
    FOREIGN KEY (
      coach_no -- 코치번호
    )
    REFERENCES coaches ( -- 코치
      coach_no -- 코치번호
    );

-- 코칭프로그램게시판
ALTER TABLE coaching_program_boards
  ADD CONSTRAINT FK_coaching_programs_TO_coaching_program_boards -- 코칭프로그램 -> 코칭프로그램게시판
    FOREIGN KEY (
      program_no -- 프로그램번호
    )
    REFERENCES coaching_programs ( -- 코칭프로그램
      program_no -- 프로그램번호
    );

-- 코칭프로그램게시판
ALTER TABLE coaching_program_boards
  ADD CONSTRAINT FK_coaches_TO_coaching_program_boards -- 코치 -> 코칭프로그램게시판
    FOREIGN KEY (
      coach_no -- 코치번호
    )
    REFERENCES coaches ( -- 코치
      coach_no -- 코치번호
    );

-- 회원코칭프로그램
ALTER TABLE member_coaching_programs
  ADD CONSTRAINT FK_members_TO_member_coaching_programs -- 회원정보 -> 회원코칭프로그램
    FOREIGN KEY (
      member_no -- 일반회원번호
    )
    REFERENCES members ( -- 회원정보
      member_no -- 일반회원번호
    );

-- 회원코칭프로그램
ALTER TABLE member_coaching_programs
  ADD CONSTRAINT FK_coaching_programs_TO_member_coaching_programs -- 코칭프로그램 -> 회원코칭프로그램
    FOREIGN KEY (
      program_no -- 프로그램번호
    )
    REFERENCES coaching_programs ( -- 코칭프로그램
      program_no -- 프로그램번호
    );

-- toDoList
ALTER TABLE to_do_list
  ADD CONSTRAINT FK_members_TO_to_do_list -- 회원정보 -> toDoList
    FOREIGN KEY (
      member_no -- 일반회원번호
    )
    REFERENCES members ( -- 회원정보
      member_no -- 일반회원번호
    );

-- 운동내역
ALTER TABLE workout_list
  ADD CONSTRAINT FK_members_TO_workout_list -- 회원정보 -> 운동내역
    FOREIGN KEY (
      member_no -- 일반회원번호
    )
    REFERENCES members ( -- 회원정보
      member_no -- 일반회원번호
    );

-- 운동내역
ALTER TABLE workout_list
  ADD CONSTRAINT FK_workout_TO_workout_list -- 운동 -> 운동내역
    FOREIGN KEY (
      workout_no -- 운동번호
    )
    REFERENCES workout ( -- 운동
      workout_no -- 운동번호
    );

-- 음식게시판
ALTER TABLE food_boards
  ADD CONSTRAINT FK_member_coaching_programs_TO_food_boards -- 회원코칭프로그램 -> 음식게시판
    FOREIGN KEY (
      member_program_no -- 회원코칭프로그램번호
    )
    REFERENCES member_coaching_programs ( -- 회원코칭프로그램
      member_program_no -- 회원코칭프로그램번호
    );

-- 음식게시판댓글
ALTER TABLE food_board_comments
  ADD CONSTRAINT FK_food_boards_TO_food_board_comments -- 음식게시판 -> 음식게시판댓글
    FOREIGN KEY (
      food_board_no -- 음식게시판번호
    )
    REFERENCES food_boards ( -- 음식게시판
      food_board_no -- 음식게시판번호
    );

-- 음식게시판댓글
ALTER TABLE food_board_comments
  ADD CONSTRAINT FK_coaches_TO_food_board_comments -- 코치 -> 음식게시판댓글
    FOREIGN KEY (
      coach_no -- 코치번호
    )
    REFERENCES coaches ( -- 코치
      coach_no -- 코치번호
    );

-- 체중
ALTER TABLE weight
  ADD CONSTRAINT FK_members_TO_weight -- 회원정보 -> 체중
    FOREIGN KEY (
      member_no -- 일반회원번호
    )
    REFERENCES members ( -- 회원정보
      member_no -- 일반회원번호
    );

-- 회원코칭프로그램일정
ALTER TABLE member_program_calendar
  ADD CONSTRAINT FK_member_coaching_programs_TO_member_program_calendar -- 회원코칭프로그램 -> 회원코칭프로그램일정
    FOREIGN KEY (
      member_program_no -- 회원코칭프로그램번호
    )
    REFERENCES member_coaching_programs ( -- 회원코칭프로그램
      member_program_no -- 회원코칭프로그램번호
    );

-- 첨부파일
ALTER TABLE calendar_files
  ADD CONSTRAINT FK_member_program_calendar_TO_calendar_files -- 회원코칭프로그램일정 -> 첨부파일
    FOREIGN KEY (
      calendar_no -- 회원코칭프로그램일정번호
    )
    REFERENCES member_program_calendar ( -- 회원코칭프로그램일정
      calendar_no -- 회원코칭프로그램일정번호
    );

-- 코칭프로그램운동태그
ALTER TABLE coaching_program_tags
  ADD CONSTRAINT FK_workout_tags_TO_coaching_program_tags -- 운동태그 -> 코칭프로그램운동태그
    FOREIGN KEY (
      tag_no -- 운동태그번호
    )
    REFERENCES workout_tags ( -- 운동태그
      tag_no -- 운동태그번호
    );

-- 코칭프로그램운동태그
ALTER TABLE coaching_program_tags
  ADD CONSTRAINT FK_coaching_programs_TO_coaching_program_tags -- 코칭프로그램 -> 코칭프로그램운동태그
    FOREIGN KEY (
      program_no -- 프로그램번호
    )
    REFERENCES coaching_programs ( -- 코칭프로그램
      program_no -- 프로그램번호
    );

-- 코칭프로그램방식
ALTER TABLE program_coaching_systems
  ADD CONSTRAINT FK_coaching_systems_TO_program_coaching_systems -- 코칭방식 -> 코칭프로그램방식
    FOREIGN KEY (
      coaching_system_no -- 코칭방식번호
    )
    REFERENCES coaching_systems ( -- 코칭방식
      coaching_system_no -- 코칭방식번호
    );

-- 코칭프로그램방식
ALTER TABLE program_coaching_systems
  ADD CONSTRAINT FK_coaching_programs_TO_program_coaching_systems -- 코칭프로그램 -> 코칭프로그램방식
    FOREIGN KEY (
      program_no -- 프로그램번호
    )
    REFERENCES coaching_programs ( -- 코칭프로그램
      program_no -- 프로그램번호
    );