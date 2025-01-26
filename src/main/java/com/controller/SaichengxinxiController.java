package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SaichengxinxiEntity;
import com.entity.view.SaichengxinxiView;

import com.service.SaichengxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 赛程信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-12-07 09:57:47
 */
@RestController
@RequestMapping("/saichengxinxi")
public class SaichengxinxiController {
    @Autowired
    private SaichengxinxiService saichengxinxiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SaichengxinxiEntity saichengxinxi, 
		HttpServletRequest request){

        EntityWrapper<SaichengxinxiEntity> ew = new EntityWrapper<SaichengxinxiEntity>();


		PageUtils page = saichengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, saichengxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SaichengxinxiEntity saichengxinxi, 
		HttpServletRequest request){
        EntityWrapper<SaichengxinxiEntity> ew = new EntityWrapper<SaichengxinxiEntity>();

		PageUtils page = saichengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, saichengxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SaichengxinxiEntity saichengxinxi){
       	EntityWrapper<SaichengxinxiEntity> ew = new EntityWrapper<SaichengxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( saichengxinxi, "saichengxinxi")); 
        return R.ok().put("data", saichengxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SaichengxinxiEntity saichengxinxi){
        EntityWrapper< SaichengxinxiEntity> ew = new EntityWrapper< SaichengxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( saichengxinxi, "saichengxinxi")); 
		SaichengxinxiView saichengxinxiView =  saichengxinxiService.selectView(ew);
		return R.ok("查询赛程信息成功").put("data", saichengxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SaichengxinxiEntity saichengxinxi = saichengxinxiService.selectById(id);
        return R.ok().put("data", saichengxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SaichengxinxiEntity saichengxinxi = saichengxinxiService.selectById(id);
        return R.ok().put("data", saichengxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SaichengxinxiEntity saichengxinxi, HttpServletRequest request){
    	saichengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(saichengxinxi);

        saichengxinxiService.insert(saichengxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SaichengxinxiEntity saichengxinxi, HttpServletRequest request){
    	saichengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(saichengxinxi);

        saichengxinxiService.insert(saichengxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SaichengxinxiEntity saichengxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(saichengxinxi);
        saichengxinxiService.updateById(saichengxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        saichengxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SaichengxinxiEntity> wrapper = new EntityWrapper<SaichengxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = saichengxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
