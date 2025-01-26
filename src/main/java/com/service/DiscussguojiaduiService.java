package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussguojiaduiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussguojiaduiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussguojiaduiView;


/**
 * 国家队评论表
 *
 * @author 
 * @email 
 * @date 2022-12-07 09:57:48
 */
public interface DiscussguojiaduiService extends IService<DiscussguojiaduiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussguojiaduiVO> selectListVO(Wrapper<DiscussguojiaduiEntity> wrapper);
   	
   	DiscussguojiaduiVO selectVO(@Param("ew") Wrapper<DiscussguojiaduiEntity> wrapper);
   	
   	List<DiscussguojiaduiView> selectListView(Wrapper<DiscussguojiaduiEntity> wrapper);
   	
   	DiscussguojiaduiView selectView(@Param("ew") Wrapper<DiscussguojiaduiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussguojiaduiEntity> wrapper);
   	

}

