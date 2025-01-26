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


import com.dao.DiscussguojiaduiDao;
import com.entity.DiscussguojiaduiEntity;
import com.service.DiscussguojiaduiService;
import com.entity.vo.DiscussguojiaduiVO;
import com.entity.view.DiscussguojiaduiView;

@Service("discussguojiaduiService")
public class DiscussguojiaduiServiceImpl extends ServiceImpl<DiscussguojiaduiDao, DiscussguojiaduiEntity> implements DiscussguojiaduiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussguojiaduiEntity> page = this.selectPage(
                new Query<DiscussguojiaduiEntity>(params).getPage(),
                new EntityWrapper<DiscussguojiaduiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussguojiaduiEntity> wrapper) {
		  Page<DiscussguojiaduiView> page =new Query<DiscussguojiaduiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussguojiaduiVO> selectListVO(Wrapper<DiscussguojiaduiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussguojiaduiVO selectVO(Wrapper<DiscussguojiaduiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussguojiaduiView> selectListView(Wrapper<DiscussguojiaduiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussguojiaduiView selectView(Wrapper<DiscussguojiaduiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
