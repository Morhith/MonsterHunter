import Vue from 'vue'
import App from './App'
// import router from './router'

import tabBar from './components/tarbar/tarbar.vue'
import tabBarshop from './components/tarbar/tarbarshop.vue'
import bottominfo from './pages/component/bottominfo/bottominfo.vue'
import tab1 from './pages/component/index/index.vue'
import tab3 from './pages/component/preson/live.vue'
import tab2 from './pages/component/order/index.vue'
import tab4 from './pages/component/preson/presoninfo.vue'
Vue.config.productionTip = false

Vue.component('tab-bar', tabBar)
Vue.component('tabbarshop', tabBarshop)
Vue.component('bottominfo', bottominfo)
Vue.component('tab1', tab1)
Vue.component('tab2', tab2)
Vue.component('tab3', tab3)
Vue.component('tab4', tab4)

App.mpType = 'app'

const app = new Vue({
    ...App
})
app.$mount();
// #ifdef H5
	// RouterMount(app,'#app');
// #endif
 
// #ifndef H5
	// app.$mount(); //为了兼容小程序及app端必须这样写才有效果
// #endif
