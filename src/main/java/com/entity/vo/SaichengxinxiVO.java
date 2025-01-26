package com.entity.vo;

import com.entity.SaichengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 赛程信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
public class SaichengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
