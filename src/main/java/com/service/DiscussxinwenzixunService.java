package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinwenzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinwenzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinwenzixunView;


/**
 * 新闻资讯评论表
 *
 * @author 
 * @email 
 * @date 2022-12-07 09:57:48
 */
public interface DiscussxinwenzixunService extends IService<DiscussxinwenzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinwenzixunVO> selectListVO(Wrapper<DiscussxinwenzixunEntity> wrapper);
   	
   	DiscussxinwenzixunVO selectVO(@Param("ew") Wrapper<DiscussxinwenzixunEntity> wrapper);
   	
   	List<DiscussxinwenzixunView> selectListView(Wrapper<DiscussxinwenzixunEntity> wrapper);
   	
   	DiscussxinwenzixunView selectView(@Param("ew") Wrapper<DiscussxinwenzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinwenzixunEntity> wrapper);
   	

}

