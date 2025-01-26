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


import com.dao.SaichengxinxiDao;
import com.entity.SaichengxinxiEntity;
import com.service.SaichengxinxiService;
import com.entity.vo.SaichengxinxiVO;
import com.entity.view.SaichengxinxiView;

@Service("saichengxinxiService")
public class SaichengxinxiServiceImpl extends ServiceImpl<SaichengxinxiDao, SaichengxinxiEntity> implements SaichengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaichengxinxiEntity> page = this.selectPage(
                new Query<SaichengxinxiEntity>(params).getPage(),
                new EntityWrapper<SaichengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaichengxinxiEntity> wrapper) {
		  Page<SaichengxinxiView> page =new Query<SaichengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaichengxinxiVO> selectListVO(Wrapper<SaichengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaichengxinxiVO selectVO(Wrapper<SaichengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaichengxinxiView> selectListView(Wrapper<SaichengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaichengxinxiView selectView(Wrapper<SaichengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
