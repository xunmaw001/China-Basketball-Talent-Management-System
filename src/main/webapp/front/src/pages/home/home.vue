<template>
<div class="home-preview" :style='{"width":"100%","margin":"10px auto"}'>




	


<div class="lists" :style='{"padding":"0 calc((100% - 1200px) / 2) 0","margin":"0 0 10px","background":"url(http://codegen.caihongy.cn/20220914/d559400b18504fce98e129b88adf014a.png) center center/cover no-repeat"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"200px","padding":"100px 0","margin":"0px 100px 0","lineHeight":"54px","textAlign":"center"}'>
	  <span :style='{"color":"#fff","fontSize":"24px","fontWeight":"bold"}'>赛程信息展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	
	<!-- 样式九 -->
	<div class="list list9 index-pv1" :style='{"width":"100%","padding":"10px","background":"transparent","height":"auto"}'>
		<div class="list-4-body" :style='{"width":"1180px","margin":"0 0 20px","display":"flex","height":"auto"}'>
			<div v-if="saichengxinxiList.length>0" @click="toDetail('saichengxinxiDetail', saichengxinxiList[0])" class="list-4-item animation-box item-1" :style='{"padding":"24px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"570px","position":"relative","justifyContent":"space-between","height":"200px"}'>
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-if="saichengxinxiList[0].tupian.substr(0,4)=='http'" :src="saichengxinxiList[0].tupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-else :src="baseUrl + (saichengxinxiList[0].tupian?saichengxinxiList[0].tupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"margin":"0 0 0 160px","overflow":"hidden","color":"#666","textAlign":"center","display":"-webkit-box","width":"calc(100% - 160px)","lineHeight":"32px","fontSize":"15px","-webkit-box-orient":"vertical","-webkit-line-clamp":"3","fontWeight":"bold"}'>{{saichengxinxiList[0].saishimingcheng}}</div>
			</div>
			<div v-if="saichengxinxiList.length>1" @click="toDetail('saichengxinxiDetail', saichengxinxiList[1])" class="list-4-item animation-box item-2" :style='{"padding":"24px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"570px","position":"relative","height":"200px"}'>
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-if="saichengxinxiList[1].tupian.substr(0,4)=='http'" :src="saichengxinxiList[1].tupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-else :src="baseUrl + (saichengxinxiList[1].tupian?saichengxinxiList[1].tupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"margin":"0 0 0 160px","overflow":"hidden","color":"#666","textAlign":"center","display":"-webkit-box","width":"calc(100% - 160px)","lineHeight":"32px","fontSize":"15px","-webkit-box-orient":"vertical","-webkit-line-clamp":"3","fontWeight":"bold"}'>{{saichengxinxiList[1].saishimingcheng}}</div>
			</div>
		</div>
		<div class="list-4-body" :style='{"width":"1180px","alignItems":"flex-start","justifyContent":"space-between","display":"flex","height":"auto"}'>
			<div v-if="saichengxinxiList.length>2" @click="toDetail('saichengxinxiDetail', saichengxinxiList[2])" class="list-4-item animation-box item-3" :style='{"minHeight":"240px","padding":"40px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"390px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-if="saichengxinxiList[2].tupian.substr(0,4)=='http'" :src="saichengxinxiList[2].tupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-else :src="baseUrl + (saichengxinxiList[2].tupian?saichengxinxiList[2].tupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"calc(100% - 110px)","margin":"0 0 0 110px","lineHeight":"1.5","fontSize":"15px","color":"#666","fontWeight":"bold"}'>{{saichengxinxiList[2].saishimingcheng}}</div>
			</div>
			<div v-if="saichengxinxiList.length>3" @click="toDetail('saichengxinxiDetail', saichengxinxiList[3])" class="list-4-item animation-box item-4" :style='{"minHeight":"240px","padding":"40px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"390px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-if="saichengxinxiList[3].tupian.substr(0,4)=='http'" :src="saichengxinxiList[3].tupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-else :src="baseUrl + (saichengxinxiList[3].tupian?saichengxinxiList[3].tupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"calc(100% - 110px)","margin":"0 0 0 110px","lineHeight":"1.5","fontSize":"15px","color":"#666","fontWeight":"bold"}'>{{saichengxinxiList[3].saishimingcheng}}</div>
			</div>
			<div v-if="saichengxinxiList.length>4" @click="toDetail('saichengxinxiDetail', saichengxinxiList[4])" class="list-4-item animation-box item-5" :style='{"minHeight":"240px","padding":"40px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"390px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-if="saichengxinxiList[4].tupian.substr(0,4)=='http'" :src="saichengxinxiList[4].tupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-else :src="baseUrl + (saichengxinxiList[4].tupian?saichengxinxiList[4].tupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"calc(100% - 110px)","margin":"0 0 0 110px","lineHeight":"1.5","fontSize":"15px","color":"#666","fontWeight":"bold"}'>{{saichengxinxiList[4].saishimingcheng}}</div>
			</div>
		</div>
	</div>
	
	<div @click="moreBtn('saichengxinxi')" :style='{"border":"0","padding":"0 0 40px","margin":"40px auto 0","textAlign":"center","display":"block","width":"80px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"20px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"0"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>
<div class="lists" :style='{"padding":"0 calc((100% - 1200px) / 2) 0","margin":"0 0 10px","background":"url(http://codegen.caihongy.cn/20220914/d559400b18504fce98e129b88adf014a.png) center center/cover no-repeat"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"200px","padding":"100px 0","margin":"0px 100px 0","lineHeight":"54px","textAlign":"center"}'>
	  <span :style='{"color":"#fff","fontSize":"24px","fontWeight":"bold"}'>国家队展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	
	<!-- 样式九 -->
	<div class="list list9 index-pv1" :style='{"width":"100%","padding":"10px","background":"transparent","height":"auto"}'>
		<div class="list-4-body" :style='{"width":"1180px","margin":"0 0 20px","display":"flex","height":"auto"}'>
			<div v-if="guojiaduiList.length>0" @click="toDetail('guojiaduiDetail', guojiaduiList[0])" class="list-4-item animation-box item-1" :style='{"padding":"24px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"570px","position":"relative","justifyContent":"space-between","height":"200px"}'>
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-if="guojiaduiList[0].qiuyuantupian.substr(0,4)=='http'" :src="guojiaduiList[0].qiuyuantupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-else :src="baseUrl + (guojiaduiList[0].qiuyuantupian?guojiaduiList[0].qiuyuantupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"margin":"0 0 0 160px","overflow":"hidden","color":"#666","textAlign":"center","display":"-webkit-box","width":"calc(100% - 160px)","lineHeight":"32px","fontSize":"15px","-webkit-box-orient":"vertical","-webkit-line-clamp":"3","fontWeight":"bold"}'>{{guojiaduiList[0].qiuyuanxingming}}</div>
			</div>
			<div v-if="guojiaduiList.length>1" @click="toDetail('guojiaduiDetail', guojiaduiList[1])" class="list-4-item animation-box item-2" :style='{"padding":"24px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"570px","position":"relative","height":"200px"}'>
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-if="guojiaduiList[1].qiuyuantupian.substr(0,4)=='http'" :src="guojiaduiList[1].qiuyuantupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-else :src="baseUrl + (guojiaduiList[1].qiuyuantupian?guojiaduiList[1].qiuyuantupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"margin":"0 0 0 160px","overflow":"hidden","color":"#666","textAlign":"center","display":"-webkit-box","width":"calc(100% - 160px)","lineHeight":"32px","fontSize":"15px","-webkit-box-orient":"vertical","-webkit-line-clamp":"3","fontWeight":"bold"}'>{{guojiaduiList[1].qiuyuanxingming}}</div>
			</div>
		</div>
		<div class="list-4-body" :style='{"width":"1180px","alignItems":"flex-start","justifyContent":"space-between","display":"flex","height":"auto"}'>
			<div v-if="guojiaduiList.length>2" @click="toDetail('guojiaduiDetail', guojiaduiList[2])" class="list-4-item animation-box item-3" :style='{"minHeight":"240px","padding":"40px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"390px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-if="guojiaduiList[2].qiuyuantupian.substr(0,4)=='http'" :src="guojiaduiList[2].qiuyuantupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-else :src="baseUrl + (guojiaduiList[2].qiuyuantupian?guojiaduiList[2].qiuyuantupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"calc(100% - 110px)","margin":"0 0 0 110px","lineHeight":"1.5","fontSize":"15px","color":"#666","fontWeight":"bold"}'>{{guojiaduiList[2].qiuyuanxingming}}</div>
			</div>
			<div v-if="guojiaduiList.length>3" @click="toDetail('guojiaduiDetail', guojiaduiList[3])" class="list-4-item animation-box item-4" :style='{"minHeight":"240px","padding":"40px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"390px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-if="guojiaduiList[3].qiuyuantupian.substr(0,4)=='http'" :src="guojiaduiList[3].qiuyuantupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-else :src="baseUrl + (guojiaduiList[3].qiuyuantupian?guojiaduiList[3].qiuyuantupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"calc(100% - 110px)","margin":"0 0 0 110px","lineHeight":"1.5","fontSize":"15px","color":"#666","fontWeight":"bold"}'>{{guojiaduiList[3].qiuyuanxingming}}</div>
			</div>
			<div v-if="guojiaduiList.length>4" @click="toDetail('guojiaduiDetail', guojiaduiList[4])" class="list-4-item animation-box item-5" :style='{"minHeight":"240px","padding":"40px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"390px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-if="guojiaduiList[4].qiuyuantupian.substr(0,4)=='http'" :src="guojiaduiList[4].qiuyuantupian.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-else :src="baseUrl + (guojiaduiList[4].qiuyuantupian?guojiaduiList[4].qiuyuantupian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"calc(100% - 110px)","margin":"0 0 0 110px","lineHeight":"1.5","fontSize":"15px","color":"#666","fontWeight":"bold"}'>{{guojiaduiList[4].qiuyuanxingming}}</div>
			</div>
		</div>
	</div>
	
	<div @click="moreBtn('guojiadui')" :style='{"border":"0","padding":"0 0 40px","margin":"40px auto 0","textAlign":"center","display":"block","width":"80px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"20px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"0"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>
<div class="lists" :style='{"padding":"0 calc((100% - 1200px) / 2) 0","margin":"0 0 10px","background":"url(http://codegen.caihongy.cn/20220914/d559400b18504fce98e129b88adf014a.png) center center/cover no-repeat"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"200px","padding":"100px 0","margin":"0px 100px 0","lineHeight":"54px","textAlign":"center"}'>
	  <span :style='{"color":"#fff","fontSize":"24px","fontWeight":"bold"}'>新闻资讯展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	
	<!-- 样式九 -->
	<div class="list list9 index-pv1" :style='{"width":"100%","padding":"10px","background":"transparent","height":"auto"}'>
		<div class="list-4-body" :style='{"width":"1180px","margin":"0 0 20px","display":"flex","height":"auto"}'>
			<div v-if="xinwenzixunList.length>0" @click="toDetail('xinwenzixunDetail', xinwenzixunList[0])" class="list-4-item animation-box item-1" :style='{"padding":"24px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"570px","position":"relative","justifyContent":"space-between","height":"200px"}'>
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-if="xinwenzixunList[0].fengmianbeijing.substr(0,4)=='http'" :src="xinwenzixunList[0].fengmianbeijing.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-else :src="baseUrl + (xinwenzixunList[0].fengmianbeijing?xinwenzixunList[0].fengmianbeijing.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"margin":"0 0 0 160px","overflow":"hidden","color":"#666","textAlign":"center","display":"-webkit-box","width":"calc(100% - 160px)","lineHeight":"32px","fontSize":"15px","-webkit-box-orient":"vertical","-webkit-line-clamp":"3","fontWeight":"bold"}'>{{xinwenzixunList[0].biaoti}}</div>
			</div>
			<div v-if="xinwenzixunList.length>1" @click="toDetail('xinwenzixunDetail', xinwenzixunList[1])" class="list-4-item animation-box item-2" :style='{"padding":"24px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"570px","position":"relative","height":"200px"}'>
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-if="xinwenzixunList[1].fengmianbeijing.substr(0,4)=='http'" :src="xinwenzixunList[1].fengmianbeijing.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"50%","top":"24px","left":"20px","width":"150px","position":"absolute","height":"150px"}' v-else :src="baseUrl + (xinwenzixunList[1].fengmianbeijing?xinwenzixunList[1].fengmianbeijing.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"margin":"0 0 0 160px","overflow":"hidden","color":"#666","textAlign":"center","display":"-webkit-box","width":"calc(100% - 160px)","lineHeight":"32px","fontSize":"15px","-webkit-box-orient":"vertical","-webkit-line-clamp":"3","fontWeight":"bold"}'>{{xinwenzixunList[1].biaoti}}</div>
			</div>
		</div>
		<div class="list-4-body" :style='{"width":"1180px","alignItems":"flex-start","justifyContent":"space-between","display":"flex","height":"auto"}'>
			<div v-if="xinwenzixunList.length>2" @click="toDetail('xinwenzixunDetail', xinwenzixunList[2])" class="list-4-item animation-box item-3" :style='{"minHeight":"240px","padding":"40px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"390px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-if="xinwenzixunList[2].fengmianbeijing.substr(0,4)=='http'" :src="xinwenzixunList[2].fengmianbeijing.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-else :src="baseUrl + (xinwenzixunList[2].fengmianbeijing?xinwenzixunList[2].fengmianbeijing.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"calc(100% - 110px)","margin":"0 0 0 110px","lineHeight":"1.5","fontSize":"15px","color":"#666","fontWeight":"bold"}'>{{xinwenzixunList[2].biaoti}}</div>
			</div>
			<div v-if="xinwenzixunList.length>3" @click="toDetail('xinwenzixunDetail', xinwenzixunList[3])" class="list-4-item animation-box item-4" :style='{"minHeight":"240px","padding":"40px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"390px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-if="xinwenzixunList[3].fengmianbeijing.substr(0,4)=='http'" :src="xinwenzixunList[3].fengmianbeijing.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-else :src="baseUrl + (xinwenzixunList[3].fengmianbeijing?xinwenzixunList[3].fengmianbeijing.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"calc(100% - 110px)","margin":"0 0 0 110px","lineHeight":"1.5","fontSize":"15px","color":"#666","fontWeight":"bold"}'>{{xinwenzixunList[3].biaoti}}</div>
			</div>
			<div v-if="xinwenzixunList.length>4" @click="toDetail('xinwenzixunDetail', xinwenzixunList[4])" class="list-4-item animation-box item-5" :style='{"minHeight":"240px","padding":"40px 20px","margin":"0 10px","borderRadius":"10px","background":"#fff","width":"390px","position":"relative","height":"auto"}'>
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-if="xinwenzixunList[4].fengmianbeijing.substr(0,4)=='http'" :src="xinwenzixunList[4].fengmianbeijing.split(',')[0]" alt="" />
				<img :style='{"objectFit":"cover","borderRadius":"10px","top":"40px","left":"20px","width":"100px","position":"absolute","height":"100px"}' v-else :src="baseUrl + (xinwenzixunList[4].fengmianbeijing?xinwenzixunList[4].fengmianbeijing.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"width":"calc(100% - 110px)","margin":"0 0 0 110px","lineHeight":"1.5","fontSize":"15px","color":"#666","fontWeight":"bold"}'>{{xinwenzixunList[4].biaoti}}</div>
			</div>
		</div>
	</div>
	
	<div @click="moreBtn('xinwenzixun')" :style='{"border":"0","padding":"0 0 40px","margin":"40px auto 0","textAlign":"center","display":"block","width":"80px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"20px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"0"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>


</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],

        saichengxinxiList: [],
        guojiaduiList: [],
        xinwenzixunList: [],
      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getList();
    },
    //方法集合
    methods: {
		getList() {
          let autoSortUrl = "";
			
			this.$http.get('saichengxinxi/list', {params: {
				sort : 'bisaishijian',
				order: 'desc',
				page: 1,
				limit: 6,
			}}).then(res => {
				if (res.data.code == 0) {
					this.saichengxinxiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
			this.$http.get('guojiadui/list', {params: {
				page: 1,
				limit: 6,
			}}).then(res => {
				if (res.data.code == 0) {
					this.guojiaduiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
			this.$http.get('xinwenzixun/list', {params: {
				page: 1,
				limit: 6,
			}}).then(res => {
				if (res.data.code == 0) {
					this.xinwenzixunList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
