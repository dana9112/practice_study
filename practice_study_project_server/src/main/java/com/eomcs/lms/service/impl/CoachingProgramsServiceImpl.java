package com.eomcs.lms.service.impl;

import java.util.List;
import com.eomcs.lms.dao.CoachingProgramsDao;
import com.eomcs.lms.domain.CoachingPrograms;
import com.eomcs.lms.service.CoachingProgramsService;

public class CoachingProgramsServiceImpl implements CoachingProgramsService {

  CoachingProgramsDao coachingProgramsDao;

  public CoachingProgramsServiceImpl(CoachingProgramsDao coachingProgramsDao) {
    this.coachingProgramsDao = coachingProgramsDao;
  }


  @Override
  public void add(CoachingPrograms coachingProgram) throws Exception {
    coachingProgramsDao.insert(coachingProgram);
  }

  @Override
  public List<CoachingPrograms> list() throws Exception {
    return coachingProgramsDao.findAll();
  }

  @Override
  public int delete(int no) throws Exception {
    return coachingProgramsDao.delete(no);
  }

  @Override
  public CoachingPrograms get(int no) throws Exception {
    return coachingProgramsDao.findByNo(no);
  }

  @Override
  public int update(CoachingPrograms coachingProgram) throws Exception {
    return coachingProgramsDao.update(coachingProgram);
  }



}
