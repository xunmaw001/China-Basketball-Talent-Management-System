package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GuojiaduiDao;
import com.entity.GuojiaduiEntity;
import com.service.GuojiaduiService;
import com.entity.vo.GuojiaduiVO;
import com.entity.view.GuojiaduiView;

@Service("guojiaduiService")
public class GuojiaduiServiceImpl extends ServiceImpl<GuojiaduiDao, GuojiaduiEntity> implements GuojiaduiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuojiaduiEntity> page = this.selectPage(
                new Query<GuojiaduiEntity>(params).getPage(),
                new EntityWrapper<GuojiaduiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuojiaduiEntity> wrapper) {
		  Page<GuojiaduiView> page =new Query<GuojiaduiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuojiaduiVO> selectListVO(Wrapper<GuojiaduiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuojiaduiVO selectVO(Wrapper<GuojiaduiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuojiaduiView> selectListView(Wrapper<GuojiaduiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuojiaduiView selectView(Wrapper<GuojiaduiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
