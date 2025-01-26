package com.entity.vo;

import com.entity.GuojiaduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 国家队
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
public class GuojiaduiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 球员图片
	 */
	
	private String qiuyuantupian;
		
	/**
	 * 效力俱乐部
	 */
	
	private String xiaolijulebu;
		
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
	 * 设置：效力俱乐部
	 */
	 
	public void setXiaolijulebu(String xiaolijulebu) {
		this.xiaolijulebu = xiaolijulebu;
	}
	
	/**
	 * 获取：效力俱乐部
	 */
	public String getXiaolijulebu() {
		return xiaolijulebu;
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
			
}
