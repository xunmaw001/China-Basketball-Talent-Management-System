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


import com.dao.DiscussqiuyuanDao;
import com.entity.DiscussqiuyuanEntity;
import com.service.DiscussqiuyuanService;
import com.entity.vo.DiscussqiuyuanVO;
import com.entity.view.DiscussqiuyuanView;

@Service("discussqiuyuanService")
public class DiscussqiuyuanServiceImpl extends ServiceImpl<DiscussqiuyuanDao, DiscussqiuyuanEntity> implements DiscussqiuyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiuyuanEntity> page = this.selectPage(
                new Query<DiscussqiuyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussqiuyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiuyuanEntity> wrapper) {
		  Page<DiscussqiuyuanView> page =new Query<DiscussqiuyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiuyuanVO> selectListVO(Wrapper<DiscussqiuyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiuyuanVO selectVO(Wrapper<DiscussqiuyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiuyuanView> selectListView(Wrapper<DiscussqiuyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiuyuanView selectView(Wrapper<DiscussqiuyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
