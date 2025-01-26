package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiuyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiuyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiuyuanView;


/**
 * 球员评论表
 *
 * @author 
 * @email 
 * @date 2022-12-07 09:57:48
 */
public interface DiscussqiuyuanService extends IService<DiscussqiuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiuyuanVO> selectListVO(Wrapper<DiscussqiuyuanEntity> wrapper);
   	
   	DiscussqiuyuanVO selectVO(@Param("ew") Wrapper<DiscussqiuyuanEntity> wrapper);
   	
   	List<DiscussqiuyuanView> selectListView(Wrapper<DiscussqiuyuanEntity> wrapper);
   	
   	DiscussqiuyuanView selectView(@Param("ew") Wrapper<DiscussqiuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiuyuanEntity> wrapper);
   	

}

