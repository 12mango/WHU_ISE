package com.example.demo.entity;

import java.io.Serializable;

public class TeaCou implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tea_cou.tid
     *
     * @mbggenerated
     */
    private String tid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tea_cou.cid
     *
     * @mbggenerated
     */
    private String cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tea_cou
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tea_cou.tid
     *
     * @return the value of tea_cou.tid
     *
     * @mbggenerated
     */
    public String getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tea_cou.tid
     *
     * @param tid the value for tea_cou.tid
     *
     * @mbggenerated
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tea_cou.cid
     *
     * @return the value of tea_cou.cid
     *
     * @mbggenerated
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tea_cou.cid
     *
     * @param cid the value for tea_cou.cid
     *
     * @mbggenerated
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_cou
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", cid=").append(cid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}