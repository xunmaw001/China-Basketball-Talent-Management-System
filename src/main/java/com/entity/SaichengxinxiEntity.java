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
 * 赛程信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
@TableName("saichengxinxi")
public class SaichengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SaichengxinxiEntity() {
		
	}
	
	public SaichengxinxiEntity(T t) {
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
	 * 赛事名称
	 */
					
	private String saishimingcheng;
	
	/**
	 * 年龄段
	 */
					
	private String nianlingduan;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 主队
	 */
					
	private String zhudui;
	
	/**
	 * 客队
	 */
					
	private String kedui;
	
	/**
	 * 比分
	 */
					
	private String bifen;
	
	/**
	 * 比赛时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date bisaishijian;
	
	/**
	 * 比赛介绍
	 */
					
	private String bisaijieshao;
	
	
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
	 * 设置：赛事名称
	 */
	public void setSaishimingcheng(String saishimingcheng) {
		this.saishimingcheng = saishimingcheng;
	}
	/**
	 * 获取：赛事名称
	 */
	public String getSaishimingcheng() {
		return saishimingcheng;
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
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：主队
	 */
	public void setZhudui(String zhudui) {
		this.zhudui = zhudui;
	}
	/**
	 * 获取：主队
	 */
	public String getZhudui() {
		return zhudui;
	}
	/**
	 * 设置：客队
	 */
	public void setKedui(String kedui) {
		this.kedui = kedui;
	}
	/**
	 * 获取：客队
	 */
	public String getKedui() {
		return kedui;
	}
	/**
	 * 设置：比分
	 */
	public void setBifen(String bifen) {
		this.bifen = bifen;
	}
	/**
	 * 获取：比分
	 */
	public String getBifen() {
		return bifen;
	}
	/**
	 * 设置：比赛时间
	 */
	public void setBisaishijian(Date bisaishijian) {
		this.bisaishijian = bisaishijian;
	}
	/**
	 * 获取：比赛时间
	 */
	public Date getBisaishijian() {
		return bisaishijian;
	}
	/**
	 * 设置：比赛介绍
	 */
	public void setBisaijieshao(String bisaijieshao) {
		this.bisaijieshao = bisaijieshao;
	}
	/**
	 * 获取：比赛介绍
	 */
	public String getBisaijieshao() {
		return bisaijieshao;
	}

}
