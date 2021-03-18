<template>
	<view class="uni-list">
		<view class="uni-list-cell IconMB1">
			<view class="uni-media-list H3">
				<view class="uni-flex uni-row H_center">
					<view class= "UserBg ace-textC">
						<view class="UserImg">
							<!-- #ifdef H5 -->
								<image :src="orderData.Imgsrc" alt=""></iamge>
							<!-- #endif -->
							<!-- #ifndef H5 -->
								<image style="width: 175upx;height: 175upx;border-radius: 50%; " :src="orderData.Imgsrc" alt=""></iamge>
							<!-- #endif -->
						</view>
						<view class="ace-textC">
							<text>{{orderData.orderUser}}</text>
						</view>
					</view>
				</view>
			</view>
		</view>
		<view v-for="(item,curIndex) in setTexts" class="uni-list-cell IconMB1 PD1">
			<view class="uni-media-list">
				<view class="uni-row Align_right" style="justify-content: flex-end">
					<text>{{item.name}}</text>
					<text>></text>
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
				orderData:{orderNum:'000000',orderText:'烧鸡',orderShoper:'麦肯基',Imgsrc:'/static/logo.png',orderUser:'玖月',},
				setTexts:[{name:'设置',src:''},{name:'地址',src:''},{name:'收藏',src:''},]
			}
		},
	}
</script>

<style>
	.uni-list { background-color: transparent;}
	.uni-list-cell { border-bottom: 1px solid #a7a4a4;background-color: #fff;}
	.uni-media-list { flex-direction: column; }
	.UserImg { margin-bottom: 66upx; }
	.UserImg uni-image { width:176upx;height:176upx;border-radius: 50%; }
	.UserBg { padding: 44upx auto;width: 60%;}
</style>
