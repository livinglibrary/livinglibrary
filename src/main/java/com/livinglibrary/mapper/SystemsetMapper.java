package com.livinglibrary.mapper;

import com.livinglibrary.po.Systemset;
import com.livinglibrary.po.SystemsetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemsetMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	long countByExample(SystemsetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int deleteByExample(SystemsetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int insert(Systemset record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int insertSelective(Systemset record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	List<Systemset> selectByExample(SystemsetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Systemset record, @Param("example") SystemsetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table systemset
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByExample(@Param("record") Systemset record, @Param("example") SystemsetExample example);
}