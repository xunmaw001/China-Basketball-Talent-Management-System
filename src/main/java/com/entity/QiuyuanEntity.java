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
 * 球员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
@TableName("qiuyuan")
public class QiuyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiuyuanEntity() {
		
	}
	
	public QiuyuanEntity(T t) {
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
	 * 球员姓名
	 */
					
	private String qiuyuanxingming;
	
	/**
	 * 年龄段
	 */
					
	private String nianlingduan;
	
	/**
	 * 球员图片
	 */
					
	private String qiuyuantupian;
	
	/**
	 * 所在学校
	 */
					
	private String suozaixuexiao;
	
	/**
	 * 场上位置
	 */
					
	private String changshangweizhi;
	
	/**
	 * 球衣号码
	 */
					
	private String qiuyihaoma;
	
	/**
	 * 身高
	 */
					
	private String shengao;
	
	/**
	 * 体重
	 */
					
	private String tizhong;
	
	/**
	 * 个人数据
	 */
					
	private String gerenshuju;
	
	/**
	 * 排名
	 */
					
	private Integer paiming;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：球员姓名
	 */
	public void setQiuyuanxingming(String qiuyuanxingming) {
		this.qiuyuanxingming = qiuyuanxingming;
	}
	/**
	 * 获取：球员姓名
	 */
	public String getQiuyuanxingming() {
		return qiuyuanxingming;
	}
	/**
	 * 设置：年龄段
	 */
	public void setNianlingduan(String nianlingduan) {
		this.nianlingduan = nianlingduan;
	}
	/**
	 * 获取：年龄段
	 */
	public String getNianlingduan() {
		return nianlingduan;
	}
	/**
	 * 设置：球员图片
	 */
	public void setQiuyuantupian(String qiuyuantupian) {
		this.qiuyuantupian = qiuyuantupian;
	}
	/**
	 * 获取：球员图片
	 */
	public String getQiuyuantupian() {
		return qiuyuantupian;
	}
	/**
	 * 设置：所在学校
	 */
	public void setSuozaixuexiao(String suozaixuexiao) {
		this.suozaixuexiao = suozaixuexiao;
	}
	/**
	 * 获取：所在学校
	 */
	public String getSuozaixuexiao() {
		return suozaixuexiao;
	}
	/**
	 * 设置：场上位置
	 */
	public void setChangshangweizhi(String changshangweizhi) {
		this.changshangweizhi = changshangweizhi;
	}
	/**
	 * 获取：场上位置
	 */
	public String getChangshangweizhi() {
		return changshangweizhi;
	}
	/**
	 * 设置：球衣号码
	 */
	public void setQiuyihaoma(String qiuyihaoma) {
		this.qiuyihaoma = qiuyihaoma;
	}
	/**
	 * 获取：球衣号码
	 */
	public String getQiuyihaoma() {
		return qiuyihaoma;
	}
	/**
	 * 设置：身高
	 */
	public void setShengao(String shengao) {
		this.shengao = shengao;
	}
	/**
	 * 获取：身高
	 */
	public String getShengao() {
		return shengao;
	}
	/**
	 * 设置：体重
	 */
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	/**
	 * 获取：体重
	 */
	public String getTizhong() {
		return tizhong;
	}
	/**
	 * 设置：个人数据
	 */
	public void setGerenshuju(String gerenshuju) {
		this.gerenshuju = gerenshuju;
	}
	/**
	 * 获取：个人数据
	 */
	public String getGerenshuju() {
		return gerenshuju;
	}
	/**
	 * 设置：排名
	 */
	public void setPaiming(Integer paiming) {
		this.paiming = paiming;
	}
	/**
	 * 获取：排名
	 */
	public Integer getPaiming() {
		return paiming;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
