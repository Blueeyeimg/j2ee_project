package com.ecnu.car_rent.model;

import java.util.Date;

public class CarOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_order.car_order_id
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private Integer carOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_order.type
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_order.has_name
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private String hasName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_order.get_name
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private String getName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_order.state
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_order.date
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_order.money
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private Integer money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_order.car_type
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private String carType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car_order.description
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_order
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public CarOrder(Integer carOrderId, Integer type, String hasName, String getName, Integer state, Date date, Integer money, String carType, String description) {
        this.carOrderId = carOrderId;
        this.type = type;
        this.hasName = hasName;
        this.getName = getName;
        this.state = state;
        this.date = date;
        this.money = money;
        this.carType = carType;
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_order
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public CarOrder() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_order.car_order_id
     *
     * @return the value of car_order.car_order_id
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public Integer getCarOrderId() {
        return carOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_order.car_order_id
     *
     * @param carOrderId the value for car_order.car_order_id
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setCarOrderId(Integer carOrderId) {
        this.carOrderId = carOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_order.type
     *
     * @return the value of car_order.type
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_order.type
     *
     * @param type the value for car_order.type
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_order.has_name
     *
     * @return the value of car_order.has_name
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public String getHasName() {
        return hasName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_order.has_name
     *
     * @param hasName the value for car_order.has_name
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setHasName(String hasName) {
        this.hasName = hasName == null ? null : hasName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_order.get_name
     *
     * @return the value of car_order.get_name
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public String getGetName() {
        return getName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_order.get_name
     *
     * @param getName the value for car_order.get_name
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setGetName(String getName) {
        this.getName = getName == null ? null : getName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_order.state
     *
     * @return the value of car_order.state
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_order.state
     *
     * @param state the value for car_order.state
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_order.date
     *
     * @return the value of car_order.date
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_order.date
     *
     * @param date the value for car_order.date
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_order.money
     *
     * @return the value of car_order.money
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_order.money
     *
     * @param money the value for car_order.money
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_order.car_type
     *
     * @return the value of car_order.car_type
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public String getCarType() {
        return carType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_order.car_type
     *
     * @param carType the value for car_order.car_type
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car_order.description
     *
     * @return the value of car_order.description
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car_order.description
     *
     * @param description the value for car_order.description
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}