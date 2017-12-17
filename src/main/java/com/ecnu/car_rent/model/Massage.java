package com.ecnu.car_rent.model;

import java.util.Date;

public class Massage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column massage.massage_id
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private Integer massageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column massage.sender_name
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private String senderName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column massage.date
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column massage.text
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    private String text;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table massage
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public Massage(Integer massageId, String senderName, Date date, String text) {
        this.massageId = massageId;
        this.senderName = senderName;
        this.date = date;
        this.text = text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table massage
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public Massage() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column massage.massage_id
     *
     * @return the value of massage.massage_id
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public Integer getMassageId() {
        return massageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column massage.massage_id
     *
     * @param massageId the value for massage.massage_id
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setMassageId(Integer massageId) {
        this.massageId = massageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column massage.sender_name
     *
     * @return the value of massage.sender_name
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column massage.sender_name
     *
     * @param senderName the value for massage.sender_name
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column massage.date
     *
     * @return the value of massage.date
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column massage.date
     *
     * @param date the value for massage.date
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column massage.text
     *
     * @return the value of massage.text
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column massage.text
     *
     * @param text the value for massage.text
     *
     * @mbggenerated Sun Dec 17 14:36:13 CST 2017
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}