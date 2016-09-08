package zhang.zhe.model;

import java.util.Date;

public class UserInfo {
    private Integer id;

    private Byte type;

    private String nickname;

    private String realname;

    private String password;

    private Date registerDate;

    private Byte status;

    private Date birthday;

    private String gender;

    private String headImg;

    private String hospitalCity;

    private Integer accessProfile;

    private Integer accessMonitor;

    private String email;

    private String fixedTel;

    private String phone;

    private String qq;

    private String msn;

    private String mailAddress;

    private String mailCode;

    private String bloodType;

    private String city;

    private String district;

    private String emailcode;

    private Integer choosetype;

    private Integer subscribeEmail;

    private Integer abiInvite;

    private Integer abiStudy;

    private Integer inviteCount;

    private String dwellAddress;

    private String identity;

    private Boolean isFirstLogin;

    private String personId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity == null ? null : hospitalCity.trim();
    }

    public Integer getAccessProfile() {
        return accessProfile;
    }

    public void setAccessProfile(Integer accessProfile) {
        this.accessProfile = accessProfile;
    }

    public Integer getAccessMonitor() {
        return accessMonitor;
    }

    public void setAccessMonitor(Integer accessMonitor) {
        this.accessMonitor = accessMonitor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFixedTel() {
        return fixedTel;
    }

    public void setFixedTel(String fixedTel) {
        this.fixedTel = fixedTel == null ? null : fixedTel.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn == null ? null : msn.trim();
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress == null ? null : mailAddress.trim();
    }

    public String getMailCode() {
        return mailCode;
    }

    public void setMailCode(String mailCode) {
        this.mailCode = mailCode == null ? null : mailCode.trim();
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType == null ? null : bloodType.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getEmailcode() {
        return emailcode;
    }

    public void setEmailcode(String emailcode) {
        this.emailcode = emailcode == null ? null : emailcode.trim();
    }

    public Integer getChoosetype() {
        return choosetype;
    }

    public void setChoosetype(Integer choosetype) {
        this.choosetype = choosetype;
    }

    public Integer getSubscribeEmail() {
        return subscribeEmail;
    }

    public void setSubscribeEmail(Integer subscribeEmail) {
        this.subscribeEmail = subscribeEmail;
    }

    public Integer getAbiInvite() {
        return abiInvite;
    }

    public void setAbiInvite(Integer abiInvite) {
        this.abiInvite = abiInvite;
    }

    public Integer getAbiStudy() {
        return abiStudy;
    }

    public void setAbiStudy(Integer abiStudy) {
        this.abiStudy = abiStudy;
    }

    public Integer getInviteCount() {
        return inviteCount;
    }

    public void setInviteCount(Integer inviteCount) {
        this.inviteCount = inviteCount;
    }

    public String getDwellAddress() {
        return dwellAddress;
    }

    public void setDwellAddress(String dwellAddress) {
        this.dwellAddress = dwellAddress == null ? null : dwellAddress.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Boolean getIsFirstLogin() {
        return isFirstLogin;
    }

    public void setIsFirstLogin(Boolean isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }
}