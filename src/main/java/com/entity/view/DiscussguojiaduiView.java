package com.entity.view;

import com.entity.DiscussguojiaduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 国家队评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-07 09:57:48
 */
@TableName("discussguojiadui")
public class DiscussguojiaduiView  extends DiscussguojiaduiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussguojiaduiView(){
	}
 
 	public DiscussguojiaduiView(DiscussguojiaduiEntity discussguojiaduiEntity){
 	try {
			BeanUtils.copyProperties(this, discussguojiaduiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
