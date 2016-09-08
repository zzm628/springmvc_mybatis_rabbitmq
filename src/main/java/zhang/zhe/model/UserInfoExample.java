package zhang.zhe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andHeadImgIsNull() {
            addCriterion("head_img is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgIsNotNull() {
            addCriterion("head_img is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgEqualTo(String value) {
            addCriterion("head_img =", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotEqualTo(String value) {
            addCriterion("head_img <>", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgGreaterThan(String value) {
            addCriterion("head_img >", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgGreaterThanOrEqualTo(String value) {
            addCriterion("head_img >=", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgLessThan(String value) {
            addCriterion("head_img <", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgLessThanOrEqualTo(String value) {
            addCriterion("head_img <=", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgLike(String value) {
            addCriterion("head_img like", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotLike(String value) {
            addCriterion("head_img not like", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgIn(List<String> values) {
            addCriterion("head_img in", values, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotIn(List<String> values) {
            addCriterion("head_img not in", values, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgBetween(String value1, String value2) {
            addCriterion("head_img between", value1, value2, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotBetween(String value1, String value2) {
            addCriterion("head_img not between", value1, value2, "headImg");
            return (Criteria) this;
        }

        public Criteria andHospitalCityIsNull() {
            addCriterion("hospital_city is null");
            return (Criteria) this;
        }

        public Criteria andHospitalCityIsNotNull() {
            addCriterion("hospital_city is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalCityEqualTo(String value) {
            addCriterion("hospital_city =", value, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityNotEqualTo(String value) {
            addCriterion("hospital_city <>", value, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityGreaterThan(String value) {
            addCriterion("hospital_city >", value, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_city >=", value, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityLessThan(String value) {
            addCriterion("hospital_city <", value, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityLessThanOrEqualTo(String value) {
            addCriterion("hospital_city <=", value, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityLike(String value) {
            addCriterion("hospital_city like", value, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityNotLike(String value) {
            addCriterion("hospital_city not like", value, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityIn(List<String> values) {
            addCriterion("hospital_city in", values, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityNotIn(List<String> values) {
            addCriterion("hospital_city not in", values, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityBetween(String value1, String value2) {
            addCriterion("hospital_city between", value1, value2, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andHospitalCityNotBetween(String value1, String value2) {
            addCriterion("hospital_city not between", value1, value2, "hospitalCity");
            return (Criteria) this;
        }

        public Criteria andAccessProfileIsNull() {
            addCriterion("access_profile is null");
            return (Criteria) this;
        }

        public Criteria andAccessProfileIsNotNull() {
            addCriterion("access_profile is not null");
            return (Criteria) this;
        }

        public Criteria andAccessProfileEqualTo(Integer value) {
            addCriterion("access_profile =", value, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessProfileNotEqualTo(Integer value) {
            addCriterion("access_profile <>", value, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessProfileGreaterThan(Integer value) {
            addCriterion("access_profile >", value, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessProfileGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_profile >=", value, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessProfileLessThan(Integer value) {
            addCriterion("access_profile <", value, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessProfileLessThanOrEqualTo(Integer value) {
            addCriterion("access_profile <=", value, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessProfileIn(List<Integer> values) {
            addCriterion("access_profile in", values, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessProfileNotIn(List<Integer> values) {
            addCriterion("access_profile not in", values, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessProfileBetween(Integer value1, Integer value2) {
            addCriterion("access_profile between", value1, value2, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessProfileNotBetween(Integer value1, Integer value2) {
            addCriterion("access_profile not between", value1, value2, "accessProfile");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorIsNull() {
            addCriterion("access_monitor is null");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorIsNotNull() {
            addCriterion("access_monitor is not null");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorEqualTo(Integer value) {
            addCriterion("access_monitor =", value, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorNotEqualTo(Integer value) {
            addCriterion("access_monitor <>", value, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorGreaterThan(Integer value) {
            addCriterion("access_monitor >", value, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_monitor >=", value, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorLessThan(Integer value) {
            addCriterion("access_monitor <", value, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorLessThanOrEqualTo(Integer value) {
            addCriterion("access_monitor <=", value, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorIn(List<Integer> values) {
            addCriterion("access_monitor in", values, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorNotIn(List<Integer> values) {
            addCriterion("access_monitor not in", values, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorBetween(Integer value1, Integer value2) {
            addCriterion("access_monitor between", value1, value2, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andAccessMonitorNotBetween(Integer value1, Integer value2) {
            addCriterion("access_monitor not between", value1, value2, "accessMonitor");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFixedTelIsNull() {
            addCriterion("fixed_tel is null");
            return (Criteria) this;
        }

        public Criteria andFixedTelIsNotNull() {
            addCriterion("fixed_tel is not null");
            return (Criteria) this;
        }

        public Criteria andFixedTelEqualTo(String value) {
            addCriterion("fixed_tel =", value, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelNotEqualTo(String value) {
            addCriterion("fixed_tel <>", value, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelGreaterThan(String value) {
            addCriterion("fixed_tel >", value, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelGreaterThanOrEqualTo(String value) {
            addCriterion("fixed_tel >=", value, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelLessThan(String value) {
            addCriterion("fixed_tel <", value, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelLessThanOrEqualTo(String value) {
            addCriterion("fixed_tel <=", value, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelLike(String value) {
            addCriterion("fixed_tel like", value, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelNotLike(String value) {
            addCriterion("fixed_tel not like", value, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelIn(List<String> values) {
            addCriterion("fixed_tel in", values, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelNotIn(List<String> values) {
            addCriterion("fixed_tel not in", values, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelBetween(String value1, String value2) {
            addCriterion("fixed_tel between", value1, value2, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andFixedTelNotBetween(String value1, String value2) {
            addCriterion("fixed_tel not between", value1, value2, "fixedTel");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andMsnIsNull() {
            addCriterion("msn is null");
            return (Criteria) this;
        }

        public Criteria andMsnIsNotNull() {
            addCriterion("msn is not null");
            return (Criteria) this;
        }

        public Criteria andMsnEqualTo(String value) {
            addCriterion("msn =", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotEqualTo(String value) {
            addCriterion("msn <>", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThan(String value) {
            addCriterion("msn >", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThanOrEqualTo(String value) {
            addCriterion("msn >=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThan(String value) {
            addCriterion("msn <", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThanOrEqualTo(String value) {
            addCriterion("msn <=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLike(String value) {
            addCriterion("msn like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotLike(String value) {
            addCriterion("msn not like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnIn(List<String> values) {
            addCriterion("msn in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotIn(List<String> values) {
            addCriterion("msn not in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnBetween(String value1, String value2) {
            addCriterion("msn between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotBetween(String value1, String value2) {
            addCriterion("msn not between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andMailAddressIsNull() {
            addCriterion("mail_address is null");
            return (Criteria) this;
        }

        public Criteria andMailAddressIsNotNull() {
            addCriterion("mail_address is not null");
            return (Criteria) this;
        }

        public Criteria andMailAddressEqualTo(String value) {
            addCriterion("mail_address =", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotEqualTo(String value) {
            addCriterion("mail_address <>", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressGreaterThan(String value) {
            addCriterion("mail_address >", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mail_address >=", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLessThan(String value) {
            addCriterion("mail_address <", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLessThanOrEqualTo(String value) {
            addCriterion("mail_address <=", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLike(String value) {
            addCriterion("mail_address like", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotLike(String value) {
            addCriterion("mail_address not like", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressIn(List<String> values) {
            addCriterion("mail_address in", values, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotIn(List<String> values) {
            addCriterion("mail_address not in", values, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressBetween(String value1, String value2) {
            addCriterion("mail_address between", value1, value2, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotBetween(String value1, String value2) {
            addCriterion("mail_address not between", value1, value2, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailCodeIsNull() {
            addCriterion("mail_code is null");
            return (Criteria) this;
        }

        public Criteria andMailCodeIsNotNull() {
            addCriterion("mail_code is not null");
            return (Criteria) this;
        }

        public Criteria andMailCodeEqualTo(String value) {
            addCriterion("mail_code =", value, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeNotEqualTo(String value) {
            addCriterion("mail_code <>", value, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeGreaterThan(String value) {
            addCriterion("mail_code >", value, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mail_code >=", value, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeLessThan(String value) {
            addCriterion("mail_code <", value, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeLessThanOrEqualTo(String value) {
            addCriterion("mail_code <=", value, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeLike(String value) {
            addCriterion("mail_code like", value, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeNotLike(String value) {
            addCriterion("mail_code not like", value, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeIn(List<String> values) {
            addCriterion("mail_code in", values, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeNotIn(List<String> values) {
            addCriterion("mail_code not in", values, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeBetween(String value1, String value2) {
            addCriterion("mail_code between", value1, value2, "mailCode");
            return (Criteria) this;
        }

        public Criteria andMailCodeNotBetween(String value1, String value2) {
            addCriterion("mail_code not between", value1, value2, "mailCode");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNull() {
            addCriterion("blood_type is null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNotNull() {
            addCriterion("blood_type is not null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeEqualTo(String value) {
            addCriterion("blood_type =", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotEqualTo(String value) {
            addCriterion("blood_type <>", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThan(String value) {
            addCriterion("blood_type >", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("blood_type >=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThan(String value) {
            addCriterion("blood_type <", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThanOrEqualTo(String value) {
            addCriterion("blood_type <=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLike(String value) {
            addCriterion("blood_type like", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotLike(String value) {
            addCriterion("blood_type not like", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIn(List<String> values) {
            addCriterion("blood_type in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotIn(List<String> values) {
            addCriterion("blood_type not in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeBetween(String value1, String value2) {
            addCriterion("blood_type between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotBetween(String value1, String value2) {
            addCriterion("blood_type not between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andEmailcodeIsNull() {
            addCriterion("emailCode is null");
            return (Criteria) this;
        }

        public Criteria andEmailcodeIsNotNull() {
            addCriterion("emailCode is not null");
            return (Criteria) this;
        }

        public Criteria andEmailcodeEqualTo(String value) {
            addCriterion("emailCode =", value, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeNotEqualTo(String value) {
            addCriterion("emailCode <>", value, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeGreaterThan(String value) {
            addCriterion("emailCode >", value, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeGreaterThanOrEqualTo(String value) {
            addCriterion("emailCode >=", value, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeLessThan(String value) {
            addCriterion("emailCode <", value, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeLessThanOrEqualTo(String value) {
            addCriterion("emailCode <=", value, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeLike(String value) {
            addCriterion("emailCode like", value, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeNotLike(String value) {
            addCriterion("emailCode not like", value, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeIn(List<String> values) {
            addCriterion("emailCode in", values, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeNotIn(List<String> values) {
            addCriterion("emailCode not in", values, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeBetween(String value1, String value2) {
            addCriterion("emailCode between", value1, value2, "emailcode");
            return (Criteria) this;
        }

        public Criteria andEmailcodeNotBetween(String value1, String value2) {
            addCriterion("emailCode not between", value1, value2, "emailcode");
            return (Criteria) this;
        }

        public Criteria andChoosetypeIsNull() {
            addCriterion("chooseType is null");
            return (Criteria) this;
        }

        public Criteria andChoosetypeIsNotNull() {
            addCriterion("chooseType is not null");
            return (Criteria) this;
        }

        public Criteria andChoosetypeEqualTo(Integer value) {
            addCriterion("chooseType =", value, "choosetype");
            return (Criteria) this;
        }

        public Criteria andChoosetypeNotEqualTo(Integer value) {
            addCriterion("chooseType <>", value, "choosetype");
            return (Criteria) this;
        }

        public Criteria andChoosetypeGreaterThan(Integer value) {
            addCriterion("chooseType >", value, "choosetype");
            return (Criteria) this;
        }

        public Criteria andChoosetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("chooseType >=", value, "choosetype");
            return (Criteria) this;
        }

        public Criteria andChoosetypeLessThan(Integer value) {
            addCriterion("chooseType <", value, "choosetype");
            return (Criteria) this;
        }

        public Criteria andChoosetypeLessThanOrEqualTo(Integer value) {
            addCriterion("chooseType <=", value, "choosetype");
            return (Criteria) this;
        }

        public Criteria andChoosetypeIn(List<Integer> values) {
            addCriterion("chooseType in", values, "choosetype");
            return (Criteria) this;
        }

        public Criteria andChoosetypeNotIn(List<Integer> values) {
            addCriterion("chooseType not in", values, "choosetype");
            return (Criteria) this;
        }

        public Criteria andChoosetypeBetween(Integer value1, Integer value2) {
            addCriterion("chooseType between", value1, value2, "choosetype");
            return (Criteria) this;
        }

        public Criteria andChoosetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("chooseType not between", value1, value2, "choosetype");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailIsNull() {
            addCriterion("subscribe_email is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailIsNotNull() {
            addCriterion("subscribe_email is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailEqualTo(Integer value) {
            addCriterion("subscribe_email =", value, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailNotEqualTo(Integer value) {
            addCriterion("subscribe_email <>", value, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailGreaterThan(Integer value) {
            addCriterion("subscribe_email >", value, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailGreaterThanOrEqualTo(Integer value) {
            addCriterion("subscribe_email >=", value, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailLessThan(Integer value) {
            addCriterion("subscribe_email <", value, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailLessThanOrEqualTo(Integer value) {
            addCriterion("subscribe_email <=", value, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailIn(List<Integer> values) {
            addCriterion("subscribe_email in", values, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailNotIn(List<Integer> values) {
            addCriterion("subscribe_email not in", values, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailBetween(Integer value1, Integer value2) {
            addCriterion("subscribe_email between", value1, value2, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andSubscribeEmailNotBetween(Integer value1, Integer value2) {
            addCriterion("subscribe_email not between", value1, value2, "subscribeEmail");
            return (Criteria) this;
        }

        public Criteria andAbiInviteIsNull() {
            addCriterion("abi_invite is null");
            return (Criteria) this;
        }

        public Criteria andAbiInviteIsNotNull() {
            addCriterion("abi_invite is not null");
            return (Criteria) this;
        }

        public Criteria andAbiInviteEqualTo(Integer value) {
            addCriterion("abi_invite =", value, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiInviteNotEqualTo(Integer value) {
            addCriterion("abi_invite <>", value, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiInviteGreaterThan(Integer value) {
            addCriterion("abi_invite >", value, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiInviteGreaterThanOrEqualTo(Integer value) {
            addCriterion("abi_invite >=", value, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiInviteLessThan(Integer value) {
            addCriterion("abi_invite <", value, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiInviteLessThanOrEqualTo(Integer value) {
            addCriterion("abi_invite <=", value, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiInviteIn(List<Integer> values) {
            addCriterion("abi_invite in", values, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiInviteNotIn(List<Integer> values) {
            addCriterion("abi_invite not in", values, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiInviteBetween(Integer value1, Integer value2) {
            addCriterion("abi_invite between", value1, value2, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiInviteNotBetween(Integer value1, Integer value2) {
            addCriterion("abi_invite not between", value1, value2, "abiInvite");
            return (Criteria) this;
        }

        public Criteria andAbiStudyIsNull() {
            addCriterion("abi_study is null");
            return (Criteria) this;
        }

        public Criteria andAbiStudyIsNotNull() {
            addCriterion("abi_study is not null");
            return (Criteria) this;
        }

        public Criteria andAbiStudyEqualTo(Integer value) {
            addCriterion("abi_study =", value, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andAbiStudyNotEqualTo(Integer value) {
            addCriterion("abi_study <>", value, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andAbiStudyGreaterThan(Integer value) {
            addCriterion("abi_study >", value, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andAbiStudyGreaterThanOrEqualTo(Integer value) {
            addCriterion("abi_study >=", value, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andAbiStudyLessThan(Integer value) {
            addCriterion("abi_study <", value, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andAbiStudyLessThanOrEqualTo(Integer value) {
            addCriterion("abi_study <=", value, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andAbiStudyIn(List<Integer> values) {
            addCriterion("abi_study in", values, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andAbiStudyNotIn(List<Integer> values) {
            addCriterion("abi_study not in", values, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andAbiStudyBetween(Integer value1, Integer value2) {
            addCriterion("abi_study between", value1, value2, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andAbiStudyNotBetween(Integer value1, Integer value2) {
            addCriterion("abi_study not between", value1, value2, "abiStudy");
            return (Criteria) this;
        }

        public Criteria andInviteCountIsNull() {
            addCriterion("invite_count is null");
            return (Criteria) this;
        }

        public Criteria andInviteCountIsNotNull() {
            addCriterion("invite_count is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCountEqualTo(Integer value) {
            addCriterion("invite_count =", value, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andInviteCountNotEqualTo(Integer value) {
            addCriterion("invite_count <>", value, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andInviteCountGreaterThan(Integer value) {
            addCriterion("invite_count >", value, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andInviteCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_count >=", value, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andInviteCountLessThan(Integer value) {
            addCriterion("invite_count <", value, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andInviteCountLessThanOrEqualTo(Integer value) {
            addCriterion("invite_count <=", value, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andInviteCountIn(List<Integer> values) {
            addCriterion("invite_count in", values, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andInviteCountNotIn(List<Integer> values) {
            addCriterion("invite_count not in", values, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andInviteCountBetween(Integer value1, Integer value2) {
            addCriterion("invite_count between", value1, value2, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andInviteCountNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_count not between", value1, value2, "inviteCount");
            return (Criteria) this;
        }

        public Criteria andDwellAddressIsNull() {
            addCriterion("dwell_address is null");
            return (Criteria) this;
        }

        public Criteria andDwellAddressIsNotNull() {
            addCriterion("dwell_address is not null");
            return (Criteria) this;
        }

        public Criteria andDwellAddressEqualTo(String value) {
            addCriterion("dwell_address =", value, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressNotEqualTo(String value) {
            addCriterion("dwell_address <>", value, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressGreaterThan(String value) {
            addCriterion("dwell_address >", value, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dwell_address >=", value, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressLessThan(String value) {
            addCriterion("dwell_address <", value, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressLessThanOrEqualTo(String value) {
            addCriterion("dwell_address <=", value, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressLike(String value) {
            addCriterion("dwell_address like", value, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressNotLike(String value) {
            addCriterion("dwell_address not like", value, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressIn(List<String> values) {
            addCriterion("dwell_address in", values, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressNotIn(List<String> values) {
            addCriterion("dwell_address not in", values, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressBetween(String value1, String value2) {
            addCriterion("dwell_address between", value1, value2, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andDwellAddressNotBetween(String value1, String value2) {
            addCriterion("dwell_address not between", value1, value2, "dwellAddress");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNull() {
            addCriterion("is_first_login is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNotNull() {
            addCriterion("is_first_login is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginEqualTo(Boolean value) {
            addCriterion("is_first_login =", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotEqualTo(Boolean value) {
            addCriterion("is_first_login <>", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThan(Boolean value) {
            addCriterion("is_first_login >", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_first_login >=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThan(Boolean value) {
            addCriterion("is_first_login <", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThanOrEqualTo(Boolean value) {
            addCriterion("is_first_login <=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIn(List<Boolean> values) {
            addCriterion("is_first_login in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotIn(List<Boolean> values) {
            addCriterion("is_first_login not in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginBetween(Boolean value1, Boolean value2) {
            addCriterion("is_first_login between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_first_login not between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("person_id like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("person_id not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}