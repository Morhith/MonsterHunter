// router/index.js
 
import Vue from 'vue'
import Router from 'uni-simple-router'
import { getToken } from '@/utils/cookie' // getToken from cookie
 
Vue.use(Router)
//初始化
const router = new Router({
    routes:[
        {
            path: '/pages/index/index',
			aliasPath:'/',  //对于h5端你必须在首页加上aliasPath并设置为/
            name: 'index',
            meta: {
                title: '首页',
            },
        },
    ]
});
export default router;