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
    import daoshixinxi from '@/views/modules/daoshixinxi/list'
    import zhidaoxiangmu from '@/views/modules/zhidaoxiangmu/list'
    import xiangmutijiao from '@/views/modules/xiangmutijiao/list'
    import daoshixuanze from '@/views/modules/daoshixuanze/list'
    import xueyuan from '@/views/modules/xueyuan/list'
    import daoshi from '@/views/modules/daoshi/list'
    import xiangmuxinxi from '@/views/modules/xiangmuxinxi/list'


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
	path: '/daoshixinxi',
        name: '导师信息',
        component: daoshixinxi
      }
      ,{
	path: '/zhidaoxiangmu',
        name: '指导项目',
        component: zhidaoxiangmu
      }
      ,{
	path: '/xiangmutijiao',
        name: '项目提交',
        component: xiangmutijiao
      }
      ,{
	path: '/daoshixuanze',
        name: '导师选择',
        component: daoshixuanze
      }
      ,{
	path: '/xueyuan',
        name: '学员',
        component: xueyuan
      }
      ,{
	path: '/daoshi',
        name: '导师',
        component: daoshi
      }
      ,{
	path: '/xiangmuxinxi',
        name: '项目信息',
        component: xiangmuxinxi
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

export default router;
