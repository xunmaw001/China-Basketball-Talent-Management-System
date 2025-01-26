package com.dao;

import com.entity.DiscussqiuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiuyuanVO;
import com.entity.view.DiscussqiuyuanView;


/**
 * 球员评论表
 * 
 * @author 
 * @email 
 * @date 2022-12-07 09:57:48
 */
public interface DiscussqiuyuanDao extends BaseMapper<DiscussqiuyuanEntity> {
	
	List<DiscussqiuyuanVO> selectListVO(@Param("ew") Wrapper<DiscussqiuyuanEntity> wrapper);
	
	DiscussqiuyuanVO selectVO(@Param("ew") Wrapper<DiscussqiuyuanEntity> wrapper);
	
	List<DiscussqiuyuanView> selectListView(@Param("ew") Wrapper<DiscussqiuyuanEntity> wrapper);

	List<DiscussqiuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiuyuanEntity> wrapper);
	
	DiscussqiuyuanView selectView(@Param("ew") Wrapper<DiscussqiuyuanEntity> wrapper);
	

}
