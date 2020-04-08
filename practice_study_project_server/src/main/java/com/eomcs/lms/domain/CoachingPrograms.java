package com.eomcs.lms.domain;

public class CoachingPrograms {

  int programNo;
  int coachNo;
  private String name;
  private String introduce;
  private int fee;



  @Override
  public String toString() {
    return "CoachingPrograms [programNo=" + programNo + ", coachNo=" + coachNo + ", name=" + name
        + ", introduce=" + introduce + ", fee=" + fee + "]";
  }


  public static CoachingPrograms valueOf(String csv) {
    String[] data = csv.split(",");

    CoachingPrograms coachingProgram = new CoachingPrograms();
    coachingProgram.setProgramNo(Integer.parseInt(data[0]));
    coachingProgram.setCoachNo(Integer.parseInt(data[1]));
    coachingProgram.setName(data[2]);
    coachingProgram.setIntroduce(data[3]);
    coachingProgram.setFee(Integer.parseInt(data[4]));
    return coachingProgram;
  }


  public String toCsvString() {
    return String.format("%d, %d, %s, %s, %d", //
        this.getProgramNo(), this.getCoachNo(), this.getName(), this.getIntroduce(), this.getFee());
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + coachNo;
    result = prime * result + fee;
    result = prime * result + ((introduce == null) ? 0 : introduce.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + programNo;
    return result;
  }



  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CoachingPrograms other = (CoachingPrograms) obj;
    if (coachNo != other.coachNo)
      return false;
    if (fee != other.fee)
      return false;
    if (introduce == null) {
      if (other.introduce != null)
        return false;
    } else if (!introduce.equals(other.introduce))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (programNo != other.programNo)
      return false;
    return true;
  }



  public int getProgramNo() {
    return programNo;
  }

  public void setProgramNo(int programNo) {
    this.programNo = programNo;
  }

  public int getCoachNo() {
    return coachNo;
  }

  public void setCoachNo(int coachNo) {
    this.coachNo = coachNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  public int getFee() {
    return fee;
  }

  public void setFee(int fee) {
    this.fee = fee;
  }



}
