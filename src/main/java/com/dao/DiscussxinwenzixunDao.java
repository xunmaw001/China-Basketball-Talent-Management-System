package com.dao;

import com.entity.DiscussxinwenzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinwenzixunVO;
import com.entity.view.DiscussxinwenzixunView;


/**
 * 新闻资讯评论表
 * 
 * @author 
 * @email 
 * @date 2022-12-07 09:57:48
 */
public interface DiscussxinwenzixunDao extends BaseMapper<DiscussxinwenzixunEntity> {
	
	List<DiscussxinwenzixunVO> selectListVO(@Param("ew") Wrapper<DiscussxinwenzixunEntity> wrapper);
	
	DiscussxinwenzixunVO selectVO(@Param("ew") Wrapper<DiscussxinwenzixunEntity> wrapper);
	
	List<DiscussxinwenzixunView> selectListView(@Param("ew") Wrapper<DiscussxinwenzixunEntity> wrapper);

	List<DiscussxinwenzixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinwenzixunEntity> wrapper);
	
	DiscussxinwenzixunView selectView(@Param("ew") Wrapper<DiscussxinwenzixunEntity> wrapper);
	

}
