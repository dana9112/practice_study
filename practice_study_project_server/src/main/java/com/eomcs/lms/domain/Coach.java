package com.eomcs.lms.domain;

import java.io.Serializable;
import java.sql.Date;

public class Coach implements Serializable {

  private static final long serialVersionUID = 20200131L;

  private int no;
  private String id;
  private String name;
  private int gender;
  private String birth;
  private String tel;
  private String email;
  private String password;
  private String photo;
  private String area;
  private String career;
  private String certification;
  private String introduce;
  private int members;
  private Date create_date;
  private String bank;
  private String account;
  private String work_type;
  private String address;
  private String latitude;
  private String longitude;
  private int withdrawal;
  private Date withdrawal_date;
  private String withdrawal_reason;

  @Override
  public String toString() {
    return "Coach [no=" + no + ", id=" + id + ", name=" + name + ", gender=" + gender + ", birth="
        + birth + ", tel=" + tel + ", email=" + email + ", password=" + password + ", photo="
        + photo + ", area=" + area + ", career=" + career + ", certification=" + certification
        + ", introduce=" + introduce + ", members=" + members + ", create_date=" + create_date
        + ", bank=" + bank + ", account=" + account + ", work_type=" + work_type + ", address="
        + address + ", latitude=" + latitude + ", longitude=" + longitude + ", withdrawal="
        + withdrawal + ", withdrawal_date=" + withdrawal_date + ", withdrawal_reason="
        + withdrawal_reason + "]";
  }

  public static Coach valueOf(String csv) {
    String[] data = csv.split(",");

    Coach coach = new Coach();
    coach.setNo(Integer.parseInt(data[0]));
    coach.setId(data[1]);
    coach.setName(data[2]);
    coach.setGender(Integer.parseInt((data[3])));
    coach.setBirth(data[4]);
    coach.setTel(data[5]);
    coach.setEmail(data[6]);
    coach.setPassword(data[7]);
    coach.setPhoto(data[8]);
    coach.setArea(data[9]);
    coach.setCareer(data[10]);
    coach.setCertification(data[11]);
    coach.setIntroduce(data[12]);
    coach.setMembers(Integer.parseInt(data[13]));
    coach.setCreate_date(Date.valueOf(data[14]));
    coach.setBank(data[15]);
    coach.setAccount(data[16]);
    coach.setWork_type(data[17]);
    coach.setAddress(data[18]);
    coach.setLatitude(data[19]);
    coach.setLongitude(data[20]);
    coach.setWithdrawal(Integer.parseInt(data[21]));
    coach.setWithdrawal_date(Date.valueOf(data[22]));
    coach.setWithdrawal_reason(data[23]);
    return coach;
  }

  public String toCsvString() {
    return String.format(
        "%d, %s, %s, %d, %s, %s, %s, %s, %s, %s, %s, %s, %s, %d, %d, %s, %s, %s, %s, %s, %s, %d, %d, %s", //
        this.getNo(), this.getId(), this.getName(), this.getGender(), this.getBirth(), //
        this.getTel(), this.getEmail(), this.getPassword(), this.getPhoto(), this.getArea(), //
        this.getCareer(), this.getCertification(), this.getIntroduce(), this.getMembers(), //
        this.getCreate_date(), this.getBank(), this.getAccount(), this.getWork_type(), //
        this.getAddress(), this.getLatitude(), this.getLongitude(), this.getWithdrawal(), //
        this.getWithdrawal_date(), this.getWithdrawal_reason());
  }


  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }

  public String getBirth() {
    return birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getCareer() {
    return career;
  }

  public void setCareer(String career) {
    this.career = career;
  }

  public String getCertification() {
    return certification;
  }

  public void setCertification(String certification) {
    this.certification = certification;
  }

  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  public int getMembers() {
    return members;
  }

  public void setMembers(int members) {
    this.members = members;
  }

  public Date getCreate_date() {
    return create_date;
  }

  public void setCreate_date(Date create_date) {
    this.create_date = create_date;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getWork_type() {
    return work_type;
  }

  public void setWork_type(String work_type) {
    this.work_type = work_type;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public int getWithdrawal() {
    return withdrawal;
  }

  public void setWithdrawal(int withdrawal) {
    this.withdrawal = withdrawal;
  }

  public Date getWithdrawal_date() {
    return withdrawal_date;
  }

  public void setWithdrawal_date(Date withdrawal_date) {
    this.withdrawal_date = withdrawal_date;
  }

  public String getWithdrawal_reason() {
    return withdrawal_reason;
  }

  public void setWithdrawal_reason(String withdrawal_reason) {
    this.withdrawal_reason = withdrawal_reason;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((account == null) ? 0 : account.hashCode());
    result = prime * result + ((address == null) ? 0 : address.hashCode());
    result = prime * result + ((area == null) ? 0 : area.hashCode());
    result = prime * result + ((bank == null) ? 0 : bank.hashCode());
    result = prime * result + ((birth == null) ? 0 : birth.hashCode());
    result = prime * result + ((career == null) ? 0 : career.hashCode());
    result = prime * result + ((certification == null) ? 0 : certification.hashCode());
    result = prime * result + ((create_date == null) ? 0 : create_date.hashCode());
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    result = prime * result + gender;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((introduce == null) ? 0 : introduce.hashCode());
    result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
    result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
    result = prime * result + members;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + no;
    result = prime * result + ((password == null) ? 0 : password.hashCode());
    result = prime * result + ((photo == null) ? 0 : photo.hashCode());
    result = prime * result + ((tel == null) ? 0 : tel.hashCode());
    result = prime * result + withdrawal;
    result = prime * result + ((withdrawal_date == null) ? 0 : withdrawal_date.hashCode());
    result = prime * result + ((withdrawal_reason == null) ? 0 : withdrawal_reason.hashCode());
    result = prime * result + ((work_type == null) ? 0 : work_type.hashCode());
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
    Coach other = (Coach) obj;
    if (account == null) {
      if (other.account != null)
        return false;
    } else if (!account.equals(other.account))
      return false;
    if (address == null) {
      if (other.address != null)
        return false;
    } else if (!address.equals(other.address))
      return false;
    if (area == null) {
      if (other.area != null)
        return false;
    } else if (!area.equals(other.area))
      return false;
    if (bank == null) {
      if (other.bank != null)
        return false;
    } else if (!bank.equals(other.bank))
      return false;
    if (birth == null) {
      if (other.birth != null)
        return false;
    } else if (!birth.equals(other.birth))
      return false;
    if (career == null) {
      if (other.career != null)
        return false;
    } else if (!career.equals(other.career))
      return false;
    if (certification == null) {
      if (other.certification != null)
        return false;
    } else if (!certification.equals(other.certification))
      return false;
    if (create_date == null) {
      if (other.create_date != null)
        return false;
    } else if (!create_date.equals(other.create_date))
      return false;
    if (email == null) {
      if (other.email != null)
        return false;
    } else if (!email.equals(other.email))
      return false;
    if (gender != other.gender)
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (introduce == null) {
      if (other.introduce != null)
        return false;
    } else if (!introduce.equals(other.introduce))
      return false;
    if (latitude == null) {
      if (other.latitude != null)
        return false;
    } else if (!latitude.equals(other.latitude))
      return false;
    if (longitude == null) {
      if (other.longitude != null)
        return false;
    } else if (!longitude.equals(other.longitude))
      return false;
    if (members != other.members)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (no != other.no)
      return false;
    if (password == null) {
      if (other.password != null)
        return false;
    } else if (!password.equals(other.password))
      return false;
    if (photo == null) {
      if (other.photo != null)
        return false;
    } else if (!photo.equals(other.photo))
      return false;
    if (tel == null) {
      if (other.tel != null)
        return false;
    } else if (!tel.equals(other.tel))
      return false;
    if (withdrawal != other.withdrawal)
      return false;
    if (withdrawal_date == null) {
      if (other.withdrawal_date != null)
        return false;
    } else if (!withdrawal_date.equals(other.withdrawal_date))
      return false;
    if (withdrawal_reason == null) {
      if (other.withdrawal_reason != null)
        return false;
    } else if (!withdrawal_reason.equals(other.withdrawal_reason))
      return false;
    if (work_type == null) {
      if (other.work_type != null)
        return false;
    } else if (!work_type.equals(other.work_type))
      return false;
    return true;
  }



}
