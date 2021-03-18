<template>
	<view>
		<view>
			<swiper class="swiper" autoplay="ture" indicator-dots="ture" indicator-color="#">
				<swiper-item class="ace-textC" v-for="(swiperImg,imgid) in Images" :id="('item'+imgid)">
					<image class="swiperImg" :src="swiperImg.src" mode=""></image>
				</swiper-item>	
			</swiper>
		</view>
		<view class="uni-row Tabbar">
			<view v-for="(item,curIndex) in Tabbar"  :class='("uni-flex text uni-column w4 IconM1 H_center D_Iblock ace-textC")'>
				<view class="TabbarImg flex-item flex-item-V">
					<!-- #ifndef H5 -->
						<image style="width:88upx;height: 88upx;border-radius: 50%;" mode="aspectFit" :src="item.Imgsrc"></image>
					<!-- #endif -->
					<!-- #ifdef H5 -->
						<image mode="aspectFit" :src="item.Imgsrc"></image>	
					<!-- #endif -->
				</view>
				<text class="flex-item flex-item-V">{{item.name}}</text>
			</view>
		</view>
		<view class="uni-flex uni-row MLR1 Align_ends flex_wrap product_list">
			<view v-for="(item,curIndex) in Tabbar" class="uni-flex uni-column w2 D_Iblock product_info">
				<navigator  :url="'/pages/component/product/productinfo?id='+curIndex" hover-class="navigator-hover">
					<view class="pro_info_img">
					<!-- #ifndef H5 -->
						<image style="width:88upx;height: 88upx;" mode="aspectFit" src="/static/logo.png"></image>
					<!-- #endif -->
					<!-- #ifdef H5 -->
						<image mode="aspectFit" src="/static/logo.png"></image>	
					<!-- #endif -->
					</view>
					<view class="pro_info_txt">
						{{item.name}}
					</view>
					<view class="pro_info_txt uni-flex uni-row Align_ends">
						<text>人气：10</text>
						<text class="">￥50</text>
					</view>
				</navigator >
			</view>
			<!-- #ifdef H5 -->
				<bottominfo></bottominfo>
			<!-- #endif -->
		</view>		
	</view>
</template>

<script>
	export default {
		data (){
			return {
				Tabbar:[
					{name:'商家',url:'',Imgsrc:'/static/logo.png'},
					{name:'圈内',url:'',Imgsrc:'/static/logo.png'},
					{name:'i生活',url:'',Imgsrc:'/static/logo.png'},
					{name:'i美食',url:'',Imgsrc:'/static/logo.png'},
					{name:'i电影',url:'',Imgsrc:'/static/logo.png'},
					{name:'i电影',url:'',Imgsrc:'/static/logo.png'},
					{name:'i电影',url:'',Imgsrc:'/static/logo.png'}],
				Images:[
					{id:0,title:'提示',src:'/static/swiperImg/img1.jpeg'},
					{id:1,title:'提示',src:'/static/swiperImg/img2.jpg'},
					{id:2,title:'提示',src:'/static/swiperImg/img3.jpg'}],
			}
		},
		onLoad() {
	
		},
		methods: {
			tabClick(url){
			        console.log('返回url：' + url)
			        this.currentTabIndex = url
			    },
		},
		computed:{
		  BTabbarNum:function(){
		    return this.BTabbar.length;
		  }
		}
	}
</script>

<style>
	.Tabbar { margin:20px 5px;}
	.TabbarImg { width:82upx; height:82upx;margin: 0 auto;}
	.TabbarImg uni-image { width: 100%;height: 100%;border-radius: 50%;box-shadow: 0px 0px 20px #2b9939; }
	.product_list { margin-top: 88upx;box-shadow: 0px -1px #969696; }
	.product_info { margin-top: 22upx;box-shadow: 1px 1px 6px 0px #969696;}
	.pro_info_txt { padding:0upx 22upx;}
	.pro_info_img { margin-top: 22upx;}
	.product_info uni-image{ width: 100%;height: 290upx; }
</style>
