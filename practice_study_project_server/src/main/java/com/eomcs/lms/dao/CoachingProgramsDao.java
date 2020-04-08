package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.CoachingPrograms;

public interface CoachingProgramsDao {

  public int insert(CoachingPrograms coachingProgram) throws Exception;

  public List<CoachingPrograms> findAll() throws Exception;

  public CoachingPrograms findByNo(int no) throws Exception;

  public int update(CoachingPrograms coachingProgram) throws Exception;

  public int delete(int no) throws Exception;



}
