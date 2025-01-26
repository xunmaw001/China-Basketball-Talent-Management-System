package com.entity.view;

import com.entity.GuojiaduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 国家队
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
@TableName("guojiadui")
public class GuojiaduiView  extends GuojiaduiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuojiaduiView(){
	}
 
 	public GuojiaduiView(GuojiaduiEntity guojiaduiEntity){
 	try {
			BeanUtils.copyProperties(this, guojiaduiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
