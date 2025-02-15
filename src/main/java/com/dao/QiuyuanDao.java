package com.dao;

import com.entity.QiuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuyuanVO;
import com.entity.view.QiuyuanView;


/**
 * 球员
 * 
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
public interface QiuyuanDao extends BaseMapper<QiuyuanEntity> {
	
	List<QiuyuanVO> selectListVO(@Param("ew") Wrapper<QiuyuanEntity> wrapper);
	
	QiuyuanVO selectVO(@Param("ew") Wrapper<QiuyuanEntity> wrapper);
	
	List<QiuyuanView> selectListView(@Param("ew") Wrapper<QiuyuanEntity> wrapper);

	List<QiuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<QiuyuanEntity> wrapper);
	
	QiuyuanView selectView(@Param("ew") Wrapper<QiuyuanEntity> wrapper);
	

}
