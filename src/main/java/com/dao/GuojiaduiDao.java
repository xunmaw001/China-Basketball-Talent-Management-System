package com.dao;

import com.entity.GuojiaduiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuojiaduiVO;
import com.entity.view.GuojiaduiView;


/**
 * 国家队
 * 
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
public interface GuojiaduiDao extends BaseMapper<GuojiaduiEntity> {
	
	List<GuojiaduiVO> selectListVO(@Param("ew") Wrapper<GuojiaduiEntity> wrapper);
	
	GuojiaduiVO selectVO(@Param("ew") Wrapper<GuojiaduiEntity> wrapper);
	
	List<GuojiaduiView> selectListView(@Param("ew") Wrapper<GuojiaduiEntity> wrapper);

	List<GuojiaduiView> selectListView(Pagination page,@Param("ew") Wrapper<GuojiaduiEntity> wrapper);
	
	GuojiaduiView selectView(@Param("ew") Wrapper<GuojiaduiEntity> wrapper);
	

}
