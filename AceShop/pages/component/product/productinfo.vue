<template>
	<view>
		这是 第 {{id}} 个产品
		<tab-bar :current=curComponent @switchTab="tabClick"></tab-bar>
	</view>
</template>

<script>
	export default {
		data(){
			return {
				id : 0,
				curComponent:0,
			}
		},
	    onLoad: function (option) { //option为object类型，会序列化上个页面传递的参数
			this.id=option.id;
	    },
		methods:{
			tabClick(curIndex){
					uni.redirectTo({
						url:'/pages/index/index',
						success(){
							let page = getCurrentPages().pop();  //跳转页面成功之后
							if (!page) return;
							page.curComponent =  curIndex//如果页面存在，则执行
						 }
					})
			    },
		},
		watch:{
		}
	}
</script>

<style>
</style>
