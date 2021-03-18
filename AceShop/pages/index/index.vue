<template>
	<view>
		<tab1 v-show="curComponent == 0"></tab1>
		<tab2 v-show="curComponent == 1"></tab2>
		<tab3 v-show="curComponent == 2"></tab3>
		<tab4 v-show="curComponent == 3"></tab4>
		<tab-bar :current=curComponent @switchTab="tabClick"></tab-bar>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello',
				curComponent:0,		
			}
		},
		onLoad:function (option) {
	    },
		methods: {
			tabClick(curIndex){
				uni.redirectTo({
					url:'/pages/index/index',
					success(){
						let page = getCurrentPages().pop();  //跳转页面成功之后
						if (!page) return;
						page.curComponent =  curIndex//如果页面存在，则重新刷新页面
					 }
				})
			},
		},
		computed:{
			
		},
		watch: {
		},
		
	}
</script>

<style>
	
</style>
