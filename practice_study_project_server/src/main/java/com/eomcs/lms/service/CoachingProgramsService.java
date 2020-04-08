package com.eomcs.lms.service;

import java.util.List;
import com.eomcs.lms.domain.CoachingPrograms;

public interface CoachingProgramsService {
  void add(CoachingPrograms coachingProgram) throws Exception;

  List<CoachingPrograms> list() throws Exception;

  int delete(int no) throws Exception;

  CoachingPrograms get(int no) throws Exception;

  int update(CoachingPrograms coachingProgram) throws Exception;
}

