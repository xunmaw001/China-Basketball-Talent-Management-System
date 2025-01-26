package com.dao;

import com.entity.DiscussguojiaduiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussguojiaduiVO;
import com.entity.view.DiscussguojiaduiView;


/**
 * 国家队评论表
 * 
 * @author 
 * @email 
 * @date 2022-12-07 09:57:48
 */
public interface DiscussguojiaduiDao extends BaseMapper<DiscussguojiaduiEntity> {
	
	List<DiscussguojiaduiVO> selectListVO(@Param("ew") Wrapper<DiscussguojiaduiEntity> wrapper);
	
	DiscussguojiaduiVO selectVO(@Param("ew") Wrapper<DiscussguojiaduiEntity> wrapper);
	
	List<DiscussguojiaduiView> selectListView(@Param("ew") Wrapper<DiscussguojiaduiEntity> wrapper);

	List<DiscussguojiaduiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussguojiaduiEntity> wrapper);
	
	DiscussguojiaduiView selectView(@Param("ew") Wrapper<DiscussguojiaduiEntity> wrapper);
	

}
