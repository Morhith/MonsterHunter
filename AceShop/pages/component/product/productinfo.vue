<template>
	<view>
		<view>
			<view class="product_info ace-textC">
					<view class="pro_info_img">
					<!-- #ifndef H5 -->
						<image style="width:88upx;height: 88upx;" mode="aspectFit" :src="productInfo.imgsrc"></image>
					<!-- #endif -->
					<!-- #ifdef H5 -->
						<image mode="aspectFit" :src="productInfo.imgsrc"></image>	
					<!-- #endif -->
					</view>
					<view class="pro_info_txt">
						{{productInfo.name}}
					</view>
					<view class="pro_info_txt uni-flex uni-row Align_ends">
						<text class="">￥{{productInfo.pic}}</text>
						<text>人气：{{productInfo.hot}}</text>
					</view>
				</navigator >
			</view>
		</view>
		<tabbarshop :current=curComponent @switchTab="tabClick"></tabbarshop>
	</view>
</template>

<script>
	export default {
		data(){
			return {
				id : 0,
				curComponent:0,
				productInfo:{name:'烧鸡',dec:'描述',imgsrc:'/static/logo.png',pic:'199',hot:120}
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
	.product_info { width: 700upx;margin: 0 auto; }
	.pro_info_txt { padding:0upx 22upx;text-align: left;}
	.pro_info_img { margin-top: 22upx;}
	.product_info uni-image{ width: 100%;height: 350upx; }
</style>
