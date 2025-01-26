package com.entity.model;

import com.entity.XinwenzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 新闻资讯
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-12-07 09:57:48
 */
public class XinwenzixunModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
