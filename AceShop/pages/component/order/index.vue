<template>
	<view class="uni-list">
		<view v-for="(item,curIndex) in orderData" class="uni-list-cell IconMB1">
			<view class="uni-media-list">
				<view class="uni-flex uni-row Align_ends IconM1">
					<text>{{item.orderText}}</text>	
					<text>订单号：{{item.orderNum}}</text>				
				</view>
				<view class="uni-flex uni-row">
					<view class="orderImg">
						<!-- #ifdef H5 -->
							<img :src="item.Imgsrc" alt="">
						<!-- #endif -->
						<!-- #ifndef H5 -->
							<img style="width: 150upx;height:150upx;" :src="item.Imgsrc" alt="">
						<!-- #endif -->
					</view>	
				</view>
				<view class="uni-flex uni-row Align_right">
					<text>{{item.orderStartDate}}</text>
				</view>
				
			</view>
		</view>
	</view>
</template>

<script>
	export default{
		data (){
			return {
				msg:'This a oreder index',
				orderData:[
					{orderNum:'000000',orderText:'烧鸡',orderShoper:'麦肯基',Imgsrc:'/static/logo.png',orderUser:'玖月',orderStartDate:'2021-02-30',},
					{orderNum:'000002',orderText:'烧鸡',orderShoper:'麦肯基',Imgsrc:'/static/logo.png',orderUser:'玖月',orderStartDate:'2021-02-30',},
					{orderNum:'000001',orderText:'烧鸡',orderShoper:'麦肯基',Imgsrc:'/static/logo.png',orderUser:'玖月',orderStartDate:'2021-02-30',},
					{orderNum:'000000',orderText:'烧鸡',orderShoper:'麦肯基',Imgsrc:'/static/logo.png',orderUser:'玖月',orderStartDate:'2021-02-30',},
					{orderNum:'000002',orderText:'烧鸡',orderShoper:'麦肯基',Imgsrc:'/static/logo.png',orderUser:'玖月',orderStartDate:'2021-02-30',},
					{orderNum:'000001',orderText:'烧鸡',orderShoper:'麦肯基',Imgsrc:'/static/logo.png',orderUser:'玖月',orderStartDate:'2021-02-30',},
				],
			}
		},
	}
</script>

<style>
	.uni-list { background-color: transparent;}
	.uni-list-cell { border-bottom: 1px dashed #a7a4a4;background-color: #fff;border-top: 1px dashed #a7a4a4; }
	.uni-media-list { flex-direction: column; }
</style>
