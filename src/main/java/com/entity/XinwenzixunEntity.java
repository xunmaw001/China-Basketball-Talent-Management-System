package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 新闻资讯
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-07 09:57:48
 */
@TableName("xinwenzixun")
public class XinwenzixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinwenzixunEntity() {
		
	}
	
	public XinwenzixunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 来源
	 */
					
	private String laiyuan;
	
	/**
	 * 新闻分类
	 */
					
	private String xinwenfenlei;
	
	/**
	 * 封面背景
	 */
					
	private String fengmianbeijing;
	
	/**
	 * 编辑人
	 */
					
	private String bianjiren;
	
	/**
	 * 新闻内容
	 */
					
	private String xinwenneirong;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：来源
	 */
	public void setLaiyuan(String laiyuan) {
		this.laiyuan = laiyuan;
	}
	/**
	 * 获取：来源
	 */
	public String getLaiyuan() {
		return laiyuan;
	}
	/**
	 * 设置：新闻分类
	 */
	public void setXinwenfenlei(String xinwenfenlei) {
		this.xinwenfenlei = xinwenfenlei;
	}
	/**
	 * 获取：新闻分类
	 */
	public String getXinwenfenlei() {
		return xinwenfenlei;
	}
	/**
	 * 设置：封面背景
	 */
	public void setFengmianbeijing(String fengmianbeijing) {
		this.fengmianbeijing = fengmianbeijing;
	}
	/**
	 * 获取：封面背景
	 */
	public String getFengmianbeijing() {
		return fengmianbeijing;
	}
	/**
	 * 设置：编辑人
	 */
	public void setBianjiren(String bianjiren) {
		this.bianjiren = bianjiren;
	}
	/**
	 * 获取：编辑人
	 */
	public String getBianjiren() {
		return bianjiren;
	}
	/**
	 * 设置：新闻内容
	 */
	public void setXinwenneirong(String xinwenneirong) {
		this.xinwenneirong = xinwenneirong;
	}
	/**
	 * 获取：新闻内容
	 */
	public String getXinwenneirong() {
		return xinwenneirong;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
