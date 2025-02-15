import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import qiuyuan from '@/views/modules/qiuyuan/list'
    import saichengxinxi from '@/views/modules/saichengxinxi/list'
    import xinwenfenlei from '@/views/modules/xinwenfenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussxinwenzixun from '@/views/modules/discussxinwenzixun/list'
    import xinwenzixun from '@/views/modules/xinwenzixun/list'
    import messages from '@/views/modules/messages/list'
    import discussguojiadui from '@/views/modules/discussguojiadui/list'
    import guojiadui from '@/views/modules/guojiadui/list'
    import discussqiuyuan from '@/views/modules/discussqiuyuan/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/qiuyuan',
        name: '球员',
        component: qiuyuan
      }
      ,{
	path: '/saichengxinxi',
        name: '赛程信息',
        component: saichengxinxi
      }
      ,{
	path: '/xinwenfenlei',
        name: '新闻分类',
        component: xinwenfenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussxinwenzixun',
        name: '新闻资讯评论',
        component: discussxinwenzixun
      }
      ,{
	path: '/xinwenzixun',
        name: '新闻资讯',
        component: xinwenzixun
      }
      ,{
	path: '/messages',
        name: '在线留言',
        component: messages
      }
      ,{
	path: '/discussguojiadui',
        name: '国家队评论',
        component: discussguojiadui
      }
      ,{
	path: '/guojiadui',
        name: '国家队',
        component: guojiadui
      }
      ,{
	path: '/discussqiuyuan',
        name: '球员评论',
        component: discussqiuyuan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
