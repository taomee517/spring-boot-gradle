package com.demo.gradle.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TerminalPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TerminalPOExample() {
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

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(Integer value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(Integer value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(Integer value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(Integer value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(Integer value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<Integer> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<Integer> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(Integer value1, Integer value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(Integer value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(Integer value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(Integer value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(Integer value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<Integer> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<Integer> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andLevelCodeIsNull() {
            addCriterion("level_code is null");
            return (Criteria) this;
        }

        public Criteria andLevelCodeIsNotNull() {
            addCriterion("level_code is not null");
            return (Criteria) this;
        }

        public Criteria andLevelCodeEqualTo(String value) {
            addCriterion("level_code =", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotEqualTo(String value) {
            addCriterion("level_code <>", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeGreaterThan(String value) {
            addCriterion("level_code >", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("level_code >=", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeLessThan(String value) {
            addCriterion("level_code <", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeLessThanOrEqualTo(String value) {
            addCriterion("level_code <=", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeLike(String value) {
            addCriterion("level_code like", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotLike(String value) {
            addCriterion("level_code not like", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeIn(List<String> values) {
            addCriterion("level_code in", values, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotIn(List<String> values) {
            addCriterion("level_code not in", values, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeBetween(String value1, String value2) {
            addCriterion("level_code between", value1, value2, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotBetween(String value1, String value2) {
            addCriterion("level_code not between", value1, value2, "levelCode");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIsNull() {
            addCriterion("service_end_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIsNotNull() {
            addCriterion("service_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeEqualTo(Date value) {
            addCriterion("service_end_time =", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotEqualTo(Date value) {
            addCriterion("service_end_time <>", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeGreaterThan(Date value) {
            addCriterion("service_end_time >", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("service_end_time >=", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeLessThan(Date value) {
            addCriterion("service_end_time <", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("service_end_time <=", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIn(List<Date> values) {
            addCriterion("service_end_time in", values, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotIn(List<Date> values) {
            addCriterion("service_end_time not in", values, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeBetween(Date value1, Date value2) {
            addCriterion("service_end_time between", value1, value2, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("service_end_time not between", value1, value2, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusIsNull() {
            addCriterion("terminal_status is null");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusIsNotNull() {
            addCriterion("terminal_status is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusEqualTo(Integer value) {
            addCriterion("terminal_status =", value, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusNotEqualTo(Integer value) {
            addCriterion("terminal_status <>", value, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusGreaterThan(Integer value) {
            addCriterion("terminal_status >", value, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("terminal_status >=", value, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusLessThan(Integer value) {
            addCriterion("terminal_status <", value, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("terminal_status <=", value, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusIn(List<Integer> values) {
            addCriterion("terminal_status in", values, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusNotIn(List<Integer> values) {
            addCriterion("terminal_status not in", values, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusBetween(Integer value1, Integer value2) {
            addCriterion("terminal_status between", value1, value2, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andTerminalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("terminal_status not between", value1, value2, "terminalStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusIsNull() {
            addCriterion("upd_status is null");
            return (Criteria) this;
        }

        public Criteria andUpdStatusIsNotNull() {
            addCriterion("upd_status is not null");
            return (Criteria) this;
        }

        public Criteria andUpdStatusEqualTo(Boolean value) {
            addCriterion("upd_status =", value, "updStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusNotEqualTo(Boolean value) {
            addCriterion("upd_status <>", value, "updStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusGreaterThan(Boolean value) {
            addCriterion("upd_status >", value, "updStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("upd_status >=", value, "updStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusLessThan(Boolean value) {
            addCriterion("upd_status <", value, "updStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("upd_status <=", value, "updStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusIn(List<Boolean> values) {
            addCriterion("upd_status in", values, "updStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusNotIn(List<Boolean> values) {
            addCriterion("upd_status not in", values, "updStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("upd_status between", value1, value2, "updStatus");
            return (Criteria) this;
        }

        public Criteria andUpdStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("upd_status not between", value1, value2, "updStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Boolean value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Boolean value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Boolean value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Boolean value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Boolean value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Boolean> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Boolean> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Boolean value1, Boolean value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andMsisdnIsNull() {
            addCriterion("msisdn is null");
            return (Criteria) this;
        }

        public Criteria andMsisdnIsNotNull() {
            addCriterion("msisdn is not null");
            return (Criteria) this;
        }

        public Criteria andMsisdnEqualTo(String value) {
            addCriterion("msisdn =", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnNotEqualTo(String value) {
            addCriterion("msisdn <>", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnGreaterThan(String value) {
            addCriterion("msisdn >", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnGreaterThanOrEqualTo(String value) {
            addCriterion("msisdn >=", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnLessThan(String value) {
            addCriterion("msisdn <", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnLessThanOrEqualTo(String value) {
            addCriterion("msisdn <=", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnLike(String value) {
            addCriterion("msisdn like", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnNotLike(String value) {
            addCriterion("msisdn not like", value, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnIn(List<String> values) {
            addCriterion("msisdn in", values, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnNotIn(List<String> values) {
            addCriterion("msisdn not in", values, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnBetween(String value1, String value2) {
            addCriterion("msisdn between", value1, value2, "msisdn");
            return (Criteria) this;
        }

        public Criteria andMsisdnNotBetween(String value1, String value2) {
            addCriterion("msisdn not between", value1, value2, "msisdn");
            return (Criteria) this;
        }

        public Criteria andIccidIsNull() {
            addCriterion("iccid is null");
            return (Criteria) this;
        }

        public Criteria andIccidIsNotNull() {
            addCriterion("iccid is not null");
            return (Criteria) this;
        }

        public Criteria andIccidEqualTo(String value) {
            addCriterion("iccid =", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotEqualTo(String value) {
            addCriterion("iccid <>", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThan(String value) {
            addCriterion("iccid >", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThanOrEqualTo(String value) {
            addCriterion("iccid >=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThan(String value) {
            addCriterion("iccid <", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThanOrEqualTo(String value) {
            addCriterion("iccid <=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLike(String value) {
            addCriterion("iccid like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotLike(String value) {
            addCriterion("iccid not like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidIn(List<String> values) {
            addCriterion("iccid in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotIn(List<String> values) {
            addCriterion("iccid not in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidBetween(String value1, String value2) {
            addCriterion("iccid between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotBetween(String value1, String value2) {
            addCriterion("iccid not between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeIsNull() {
            addCriterion("first_msg_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeIsNotNull() {
            addCriterion("first_msg_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeEqualTo(Date value) {
            addCriterion("first_msg_time =", value, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeNotEqualTo(Date value) {
            addCriterion("first_msg_time <>", value, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeGreaterThan(Date value) {
            addCriterion("first_msg_time >", value, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_msg_time >=", value, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeLessThan(Date value) {
            addCriterion("first_msg_time <", value, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_msg_time <=", value, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeIn(List<Date> values) {
            addCriterion("first_msg_time in", values, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeNotIn(List<Date> values) {
            addCriterion("first_msg_time not in", values, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeBetween(Date value1, Date value2) {
            addCriterion("first_msg_time between", value1, value2, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andFirstMsgTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_msg_time not between", value1, value2, "firstMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeIsNull() {
            addCriterion("last_msg_time is null");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeIsNotNull() {
            addCriterion("last_msg_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeEqualTo(Date value) {
            addCriterion("last_msg_time =", value, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeNotEqualTo(Date value) {
            addCriterion("last_msg_time <>", value, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeGreaterThan(Date value) {
            addCriterion("last_msg_time >", value, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_msg_time >=", value, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeLessThan(Date value) {
            addCriterion("last_msg_time <", value, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_msg_time <=", value, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeIn(List<Date> values) {
            addCriterion("last_msg_time in", values, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeNotIn(List<Date> values) {
            addCriterion("last_msg_time not in", values, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeBetween(Date value1, Date value2) {
            addCriterion("last_msg_time between", value1, value2, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andLastMsgTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_msg_time not between", value1, value2, "lastMsgTime");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("crt_time is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("crt_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("crt_time =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("crt_time <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("crt_time >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_time >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("crt_time <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("crt_time <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("crt_time in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("crt_time not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("crt_time between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("crt_time not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("upd_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("upd_time =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("upd_time in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("upd_time not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("upd_time between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("upd_time not between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andCrtUidIsNull() {
            addCriterion("crt_uid is null");
            return (Criteria) this;
        }

        public Criteria andCrtUidIsNotNull() {
            addCriterion("crt_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUidEqualTo(Integer value) {
            addCriterion("crt_uid =", value, "crtUid");
            return (Criteria) this;
        }

        public Criteria andCrtUidNotEqualTo(Integer value) {
            addCriterion("crt_uid <>", value, "crtUid");
            return (Criteria) this;
        }

        public Criteria andCrtUidGreaterThan(Integer value) {
            addCriterion("crt_uid >", value, "crtUid");
            return (Criteria) this;
        }

        public Criteria andCrtUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("crt_uid >=", value, "crtUid");
            return (Criteria) this;
        }

        public Criteria andCrtUidLessThan(Integer value) {
            addCriterion("crt_uid <", value, "crtUid");
            return (Criteria) this;
        }

        public Criteria andCrtUidLessThanOrEqualTo(Integer value) {
            addCriterion("crt_uid <=", value, "crtUid");
            return (Criteria) this;
        }

        public Criteria andCrtUidIn(List<Integer> values) {
            addCriterion("crt_uid in", values, "crtUid");
            return (Criteria) this;
        }

        public Criteria andCrtUidNotIn(List<Integer> values) {
            addCriterion("crt_uid not in", values, "crtUid");
            return (Criteria) this;
        }

        public Criteria andCrtUidBetween(Integer value1, Integer value2) {
            addCriterion("crt_uid between", value1, value2, "crtUid");
            return (Criteria) this;
        }

        public Criteria andCrtUidNotBetween(Integer value1, Integer value2) {
            addCriterion("crt_uid not between", value1, value2, "crtUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidIsNull() {
            addCriterion("upd_uid is null");
            return (Criteria) this;
        }

        public Criteria andUpdUidIsNotNull() {
            addCriterion("upd_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdUidEqualTo(Integer value) {
            addCriterion("upd_uid =", value, "updUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidNotEqualTo(Integer value) {
            addCriterion("upd_uid <>", value, "updUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidGreaterThan(Integer value) {
            addCriterion("upd_uid >", value, "updUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("upd_uid >=", value, "updUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidLessThan(Integer value) {
            addCriterion("upd_uid <", value, "updUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidLessThanOrEqualTo(Integer value) {
            addCriterion("upd_uid <=", value, "updUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidIn(List<Integer> values) {
            addCriterion("upd_uid in", values, "updUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidNotIn(List<Integer> values) {
            addCriterion("upd_uid not in", values, "updUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidBetween(Integer value1, Integer value2) {
            addCriterion("upd_uid between", value1, value2, "updUid");
            return (Criteria) this;
        }

        public Criteria andUpdUidNotBetween(Integer value1, Integer value2) {
            addCriterion("upd_uid not between", value1, value2, "updUid");
            return (Criteria) this;
        }

        public Criteria andCfgNameIsNull() {
            addCriterion("cfg_name is null");
            return (Criteria) this;
        }

        public Criteria andCfgNameIsNotNull() {
            addCriterion("cfg_name is not null");
            return (Criteria) this;
        }

        public Criteria andCfgNameEqualTo(String value) {
            addCriterion("cfg_name =", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameNotEqualTo(String value) {
            addCriterion("cfg_name <>", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameGreaterThan(String value) {
            addCriterion("cfg_name >", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameGreaterThanOrEqualTo(String value) {
            addCriterion("cfg_name >=", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameLessThan(String value) {
            addCriterion("cfg_name <", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameLessThanOrEqualTo(String value) {
            addCriterion("cfg_name <=", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameLike(String value) {
            addCriterion("cfg_name like", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameNotLike(String value) {
            addCriterion("cfg_name not like", value, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameIn(List<String> values) {
            addCriterion("cfg_name in", values, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameNotIn(List<String> values) {
            addCriterion("cfg_name not in", values, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameBetween(String value1, String value2) {
            addCriterion("cfg_name between", value1, value2, "cfgName");
            return (Criteria) this;
        }

        public Criteria andCfgNameNotBetween(String value1, String value2) {
            addCriterion("cfg_name not between", value1, value2, "cfgName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andHardVersionIsNull() {
            addCriterion("hard_version is null");
            return (Criteria) this;
        }

        public Criteria andHardVersionIsNotNull() {
            addCriterion("hard_version is not null");
            return (Criteria) this;
        }

        public Criteria andHardVersionEqualTo(String value) {
            addCriterion("hard_version =", value, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionNotEqualTo(String value) {
            addCriterion("hard_version <>", value, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionGreaterThan(String value) {
            addCriterion("hard_version >", value, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionGreaterThanOrEqualTo(String value) {
            addCriterion("hard_version >=", value, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionLessThan(String value) {
            addCriterion("hard_version <", value, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionLessThanOrEqualTo(String value) {
            addCriterion("hard_version <=", value, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionLike(String value) {
            addCriterion("hard_version like", value, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionNotLike(String value) {
            addCriterion("hard_version not like", value, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionIn(List<String> values) {
            addCriterion("hard_version in", values, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionNotIn(List<String> values) {
            addCriterion("hard_version not in", values, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionBetween(String value1, String value2) {
            addCriterion("hard_version between", value1, value2, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andHardVersionNotBetween(String value1, String value2) {
            addCriterion("hard_version not between", value1, value2, "hardVersion");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatIsNull() {
            addCriterion("partition_format is null");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatIsNotNull() {
            addCriterion("partition_format is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatEqualTo(String value) {
            addCriterion("partition_format =", value, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatNotEqualTo(String value) {
            addCriterion("partition_format <>", value, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatGreaterThan(String value) {
            addCriterion("partition_format >", value, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatGreaterThanOrEqualTo(String value) {
            addCriterion("partition_format >=", value, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatLessThan(String value) {
            addCriterion("partition_format <", value, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatLessThanOrEqualTo(String value) {
            addCriterion("partition_format <=", value, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatLike(String value) {
            addCriterion("partition_format like", value, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatNotLike(String value) {
            addCriterion("partition_format not like", value, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatIn(List<String> values) {
            addCriterion("partition_format in", values, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatNotIn(List<String> values) {
            addCriterion("partition_format not in", values, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatBetween(String value1, String value2) {
            addCriterion("partition_format between", value1, value2, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andPartitionFormatNotBetween(String value1, String value2) {
            addCriterion("partition_format not between", value1, value2, "partitionFormat");
            return (Criteria) this;
        }

        public Criteria andSoftNameIsNull() {
            addCriterion("soft_name is null");
            return (Criteria) this;
        }

        public Criteria andSoftNameIsNotNull() {
            addCriterion("soft_name is not null");
            return (Criteria) this;
        }

        public Criteria andSoftNameEqualTo(String value) {
            addCriterion("soft_name =", value, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameNotEqualTo(String value) {
            addCriterion("soft_name <>", value, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameGreaterThan(String value) {
            addCriterion("soft_name >", value, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameGreaterThanOrEqualTo(String value) {
            addCriterion("soft_name >=", value, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameLessThan(String value) {
            addCriterion("soft_name <", value, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameLessThanOrEqualTo(String value) {
            addCriterion("soft_name <=", value, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameLike(String value) {
            addCriterion("soft_name like", value, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameNotLike(String value) {
            addCriterion("soft_name not like", value, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameIn(List<String> values) {
            addCriterion("soft_name in", values, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameNotIn(List<String> values) {
            addCriterion("soft_name not in", values, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameBetween(String value1, String value2) {
            addCriterion("soft_name between", value1, value2, "softName");
            return (Criteria) this;
        }

        public Criteria andSoftNameNotBetween(String value1, String value2) {
            addCriterion("soft_name not between", value1, value2, "softName");
            return (Criteria) this;
        }

        public Criteria andCompileTypeIsNull() {
            addCriterion("compile_type is null");
            return (Criteria) this;
        }

        public Criteria andCompileTypeIsNotNull() {
            addCriterion("compile_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompileTypeEqualTo(String value) {
            addCriterion("compile_type =", value, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeNotEqualTo(String value) {
            addCriterion("compile_type <>", value, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeGreaterThan(String value) {
            addCriterion("compile_type >", value, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("compile_type >=", value, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeLessThan(String value) {
            addCriterion("compile_type <", value, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeLessThanOrEqualTo(String value) {
            addCriterion("compile_type <=", value, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeLike(String value) {
            addCriterion("compile_type like", value, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeNotLike(String value) {
            addCriterion("compile_type not like", value, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeIn(List<String> values) {
            addCriterion("compile_type in", values, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeNotIn(List<String> values) {
            addCriterion("compile_type not in", values, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeBetween(String value1, String value2) {
            addCriterion("compile_type between", value1, value2, "compileType");
            return (Criteria) this;
        }

        public Criteria andCompileTypeNotBetween(String value1, String value2) {
            addCriterion("compile_type not between", value1, value2, "compileType");
            return (Criteria) this;
        }

        public Criteria andSoftVersionIsNull() {
            addCriterion("soft_version is null");
            return (Criteria) this;
        }

        public Criteria andSoftVersionIsNotNull() {
            addCriterion("soft_version is not null");
            return (Criteria) this;
        }

        public Criteria andSoftVersionEqualTo(String value) {
            addCriterion("soft_version =", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionNotEqualTo(String value) {
            addCriterion("soft_version <>", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionGreaterThan(String value) {
            addCriterion("soft_version >", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionGreaterThanOrEqualTo(String value) {
            addCriterion("soft_version >=", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionLessThan(String value) {
            addCriterion("soft_version <", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionLessThanOrEqualTo(String value) {
            addCriterion("soft_version <=", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionLike(String value) {
            addCriterion("soft_version like", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionNotLike(String value) {
            addCriterion("soft_version not like", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionIn(List<String> values) {
            addCriterion("soft_version in", values, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionNotIn(List<String> values) {
            addCriterion("soft_version not in", values, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionBetween(String value1, String value2) {
            addCriterion("soft_version between", value1, value2, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionNotBetween(String value1, String value2) {
            addCriterion("soft_version not between", value1, value2, "softVersion");
            return (Criteria) this;
        }

        public Criteria andWirelessIsNull() {
            addCriterion("wireless is null");
            return (Criteria) this;
        }

        public Criteria andWirelessIsNotNull() {
            addCriterion("wireless is not null");
            return (Criteria) this;
        }

        public Criteria andWirelessEqualTo(Boolean value) {
            addCriterion("wireless =", value, "wireless");
            return (Criteria) this;
        }

        public Criteria andWirelessNotEqualTo(Boolean value) {
            addCriterion("wireless <>", value, "wireless");
            return (Criteria) this;
        }

        public Criteria andWirelessGreaterThan(Boolean value) {
            addCriterion("wireless >", value, "wireless");
            return (Criteria) this;
        }

        public Criteria andWirelessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wireless >=", value, "wireless");
            return (Criteria) this;
        }

        public Criteria andWirelessLessThan(Boolean value) {
            addCriterion("wireless <", value, "wireless");
            return (Criteria) this;
        }

        public Criteria andWirelessLessThanOrEqualTo(Boolean value) {
            addCriterion("wireless <=", value, "wireless");
            return (Criteria) this;
        }

        public Criteria andWirelessIn(List<Boolean> values) {
            addCriterion("wireless in", values, "wireless");
            return (Criteria) this;
        }

        public Criteria andWirelessNotIn(List<Boolean> values) {
            addCriterion("wireless not in", values, "wireless");
            return (Criteria) this;
        }

        public Criteria andWirelessBetween(Boolean value1, Boolean value2) {
            addCriterion("wireless between", value1, value2, "wireless");
            return (Criteria) this;
        }

        public Criteria andWirelessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wireless not between", value1, value2, "wireless");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeIsNull() {
            addCriterion("sr_levelcode is null");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeIsNotNull() {
            addCriterion("sr_levelcode is not null");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeEqualTo(String value) {
            addCriterion("sr_levelcode =", value, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeNotEqualTo(String value) {
            addCriterion("sr_levelcode <>", value, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeGreaterThan(String value) {
            addCriterion("sr_levelcode >", value, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sr_levelcode >=", value, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeLessThan(String value) {
            addCriterion("sr_levelcode <", value, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeLessThanOrEqualTo(String value) {
            addCriterion("sr_levelcode <=", value, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeLike(String value) {
            addCriterion("sr_levelcode like", value, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeNotLike(String value) {
            addCriterion("sr_levelcode not like", value, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeIn(List<String> values) {
            addCriterion("sr_levelcode in", values, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeNotIn(List<String> values) {
            addCriterion("sr_levelcode not in", values, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeBetween(String value1, String value2) {
            addCriterion("sr_levelcode between", value1, value2, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andSrLevelcodeNotBetween(String value1, String value2) {
            addCriterion("sr_levelcode not between", value1, value2, "srLevelcode");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andStateTimeIsNull() {
            addCriterion("state_time is null");
            return (Criteria) this;
        }

        public Criteria andStateTimeIsNotNull() {
            addCriterion("state_time is not null");
            return (Criteria) this;
        }

        public Criteria andStateTimeEqualTo(Date value) {
            addCriterion("state_time =", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotEqualTo(Date value) {
            addCriterion("state_time <>", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThan(Date value) {
            addCriterion("state_time >", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("state_time >=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThan(Date value) {
            addCriterion("state_time <", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeLessThanOrEqualTo(Date value) {
            addCriterion("state_time <=", value, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeIn(List<Date> values) {
            addCriterion("state_time in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotIn(List<Date> values) {
            addCriterion("state_time not in", values, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeBetween(Date value1, Date value2) {
            addCriterion("state_time between", value1, value2, "stateTime");
            return (Criteria) this;
        }

        public Criteria andStateTimeNotBetween(Date value1, Date value2) {
            addCriterion("state_time not between", value1, value2, "stateTime");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerIsNull() {
            addCriterion("driving_cfg_power is null");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerIsNotNull() {
            addCriterion("driving_cfg_power is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerEqualTo(Boolean value) {
            addCriterion("driving_cfg_power =", value, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerNotEqualTo(Boolean value) {
            addCriterion("driving_cfg_power <>", value, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerGreaterThan(Boolean value) {
            addCriterion("driving_cfg_power >", value, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("driving_cfg_power >=", value, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerLessThan(Boolean value) {
            addCriterion("driving_cfg_power <", value, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerLessThanOrEqualTo(Boolean value) {
            addCriterion("driving_cfg_power <=", value, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerIn(List<Boolean> values) {
            addCriterion("driving_cfg_power in", values, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerNotIn(List<Boolean> values) {
            addCriterion("driving_cfg_power not in", values, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerBetween(Boolean value1, Boolean value2) {
            addCriterion("driving_cfg_power between", value1, value2, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andDrivingCfgPowerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("driving_cfg_power not between", value1, value2, "drivingCfgPower");
            return (Criteria) this;
        }

        public Criteria andPinCardIsNull() {
            addCriterion("pin_card is null");
            return (Criteria) this;
        }

        public Criteria andPinCardIsNotNull() {
            addCriterion("pin_card is not null");
            return (Criteria) this;
        }

        public Criteria andPinCardEqualTo(Byte value) {
            addCriterion("pin_card =", value, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardNotEqualTo(Byte value) {
            addCriterion("pin_card <>", value, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardGreaterThan(Byte value) {
            addCriterion("pin_card >", value, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardGreaterThanOrEqualTo(Byte value) {
            addCriterion("pin_card >=", value, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardLessThan(Byte value) {
            addCriterion("pin_card <", value, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardLessThanOrEqualTo(Byte value) {
            addCriterion("pin_card <=", value, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardIn(List<Byte> values) {
            addCriterion("pin_card in", values, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardNotIn(List<Byte> values) {
            addCriterion("pin_card not in", values, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardBetween(Byte value1, Byte value2) {
            addCriterion("pin_card between", value1, value2, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardNotBetween(Byte value1, Byte value2) {
            addCriterion("pin_card not between", value1, value2, "pinCard");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeIsNull() {
            addCriterion("pin_card_time is null");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeIsNotNull() {
            addCriterion("pin_card_time is not null");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeEqualTo(Date value) {
            addCriterion("pin_card_time =", value, "pinCardTime");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeNotEqualTo(Date value) {
            addCriterion("pin_card_time <>", value, "pinCardTime");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeGreaterThan(Date value) {
            addCriterion("pin_card_time >", value, "pinCardTime");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pin_card_time >=", value, "pinCardTime");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeLessThan(Date value) {
            addCriterion("pin_card_time <", value, "pinCardTime");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeLessThanOrEqualTo(Date value) {
            addCriterion("pin_card_time <=", value, "pinCardTime");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeIn(List<Date> values) {
            addCriterion("pin_card_time in", values, "pinCardTime");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeNotIn(List<Date> values) {
            addCriterion("pin_card_time not in", values, "pinCardTime");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeBetween(Date value1, Date value2) {
            addCriterion("pin_card_time between", value1, value2, "pinCardTime");
            return (Criteria) this;
        }

        public Criteria andPinCardTimeNotBetween(Date value1, Date value2) {
            addCriterion("pin_card_time not between", value1, value2, "pinCardTime");
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