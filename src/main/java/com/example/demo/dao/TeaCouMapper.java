package com.example.demo.dao;

import com.example.demo.entity.TeaCou;
import java.util.List;

public interface TeaCouMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_cou
     *
     * @mbggenerated
     */
    int insert(TeaCou record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tea_cou
     *
     * @mbggenerated
     */
    List<TeaCou> selectAll();
}