package com.daruan.mapper;

import com.daruan.model.Department;
import com.daruan.model.DepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    int countByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    int deleteByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    Department selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated Mon Aug 12 11:58:26 GMT+08:00 2019
     */
    int updateByPrimaryKey(Department record);
}