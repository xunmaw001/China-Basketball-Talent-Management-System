import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Storeup from '../pages/storeup/list'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import qiuyuanList from '../pages/qiuyuan/list'
import qiuyuanDetail from '../pages/qiuyuan/detail'
import qiuyuanAdd from '../pages/qiuyuan/add'
import saichengxinxiList from '../pages/saichengxinxi/list'
import saichengxinxiDetail from '../pages/saichengxinxi/detail'
import saichengxinxiAdd from '../pages/saichengxinxi/add'
import guojiaduiList from '../pages/guojiadui/list'
import guojiaduiDetail from '../pages/guojiadui/detail'
import guojiaduiAdd from '../pages/guojiadui/add'
import xinwenzixunList from '../pages/xinwenzixun/list'
import xinwenzixunDetail from '../pages/xinwenzixun/detail'
import xinwenzixunAdd from '../pages/xinwenzixun/add'
import xinwenfenleiList from '../pages/xinwenfenlei/list'
import xinwenfenleiDetail from '../pages/xinwenfenlei/detail'
import xinwenfenleiAdd from '../pages/xinwenfenlei/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'qiuyuan',
					component: qiuyuanList
				},
				{
					path: 'qiuyuanDetail',
					component: qiuyuanDetail
				},
				{
					path: 'qiuyuanAdd',
					component: qiuyuanAdd
				},
				{
					path: 'saichengxinxi',
					component: saichengxinxiList
				},
				{
					path: 'saichengxinxiDetail',
					component: saichengxinxiDetail
				},
				{
					path: 'saichengxinxiAdd',
					component: saichengxinxiAdd
				},
				{
					path: 'guojiadui',
					component: guojiaduiList
				},
				{
					path: 'guojiaduiDetail',
					component: guojiaduiDetail
				},
				{
					path: 'guojiaduiAdd',
					component: guojiaduiAdd
				},
				{
					path: 'xinwenzixun',
					component: xinwenzixunList
				},
				{
					path: 'xinwenzixunDetail',
					component: xinwenzixunDetail
				},
				{
					path: 'xinwenzixunAdd',
					component: xinwenzixunAdd
				},
				{
					path: 'xinwenfenlei',
					component: xinwenfenleiList
				},
				{
					path: 'xinwenfenleiDetail',
					component: xinwenfenleiDetail
				},
				{
					path: 'xinwenfenleiAdd',
					component: xinwenfenleiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
