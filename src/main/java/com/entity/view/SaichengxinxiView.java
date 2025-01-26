package com.entity.view;

import com.entity.SaichengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赛程信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
@TableName("saichengxinxi")
public class SaichengxinxiView  extends SaichengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SaichengxinxiView(){
	}
 
 	public SaichengxinxiView(SaichengxinxiEntity saichengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, saichengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
