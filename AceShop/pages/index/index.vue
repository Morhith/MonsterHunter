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
			uni.request({
				header: {
					'Content-Type': 'application/x-www-form-urlencoded',
				}, 
<<<<<<< HEAD
				url: "http://localhost:8088/api/test/testpost", //仅为示例，并非真实接口地址。
=======
				url: "http://127.0.0.1:8088/api/all", //仅为示例，并非真实接口地址。
>>>>>>> db908fcc86e2ba6e00f75ff83839c8e0eed2869f
				method: 'POST',
					data: {
						name: "hitysept",
						age: 20,
						param:"rrrr"
					},
				dataType:'json',
				success: (res) => {
						console.log(res.data);
					} 
				}); 
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
