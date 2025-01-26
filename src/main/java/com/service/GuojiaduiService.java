package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuojiaduiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuojiaduiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuojiaduiView;


/**
 * 国家队
 *
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
public interface GuojiaduiService extends IService<GuojiaduiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuojiaduiVO> selectListVO(Wrapper<GuojiaduiEntity> wrapper);
   	
   	GuojiaduiVO selectVO(@Param("ew") Wrapper<GuojiaduiEntity> wrapper);
   	
   	List<GuojiaduiView> selectListView(Wrapper<GuojiaduiEntity> wrapper);
   	
   	GuojiaduiView selectView(@Param("ew") Wrapper<GuojiaduiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuojiaduiEntity> wrapper);
   	

}

