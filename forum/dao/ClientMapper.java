package com.springboot.forum.dao;

import com.springboot.forum.entity.Client;
import com.springboot.forum.entity.ClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    long countByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int deleteByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int deleteByPrimaryKey(Integer clientid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int insert(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int insertSelective(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    List<Client> selectByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    Client selectByPrimaryKey(Integer clientid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int updateByPrimaryKeySelective(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client
     *
     * @mbg.generated Thu Sep 24 17:23:48 CST 2020
     */
    int updateByPrimaryKey(Client record);
}