<template>
	<view class="uni-flex uni-row BTabbar ace-textC">
		<view v-for="(item,curIndex) in BTabbar" class="uni-flex uni-column BTabbarC D_Iblock"  @click="switchTab(curIndex)">
			<view class="M_cneter">
				<view  :key="curIndex"  :class='("text MLR1 ace-textC w"+BTabbarNum)'>
					<view class="BTabbarImg">
						<!-- #ifdef H5 -->
							<image :src="(currentTab == curIndex)?item.ImgsrcA:item.Imgsrc"></image>
						<!-- #endif -->
						<!-- #ifndef H5 -->
							<image style="width: 50upx;height: 50upx;" :src="(currentTab == curIndex)?item.ImgsrcA:item.Imgsrc"></image>
						<!-- #endif -->
					</view>
					<text :class="((currentTab == curIndex)?'Col51':'Col69')">{{item.name}}</text>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	 export default {
	        data() {
	            return {
	                BTabbar:[
	                	{name:'收藏',url:'tab2',Imgsrc:'/static/component.png',ImgsrcA:'/static/componentHL.png',purl:'pages/component/index/index'},
	                	{name:'立即购买',url:'tab4',Imgsrc:'/static/template.png',ImgsrcA:'/static/templateHL.png',purl:'pages/component/index/index'},
	                	{name:'加入购物车',url:'tab3',Imgsrc:'/static/extui.png',ImgsrcA:'/static/extuiHL.png',purl:'pages/component/index/index'}],
	                currentTab: this.current,
	            }
	        },
	        props: {
	            current: { type: [Number, String], default: 0 },
	            backgroundColor: { type: String, default: '#fbfbfb' },
	            color: { type: String, default: '#999' },
	            tintColor: { type: String, default: '#42b983' }
	        },
	        methods: {
	            switchTab(curIndex){
	                this.$emit('switchTab', curIndex)
	            }
	        },
			computed:{
			  BTabbarNum:function(){
				return this.BTabbar.length;
			  }
			},
			watch:{
				current(newValue, oldValue) {
					this.currentTab = newValue
				}
			}
	    }
</script>

<style>
	.BTabbarImg { width:50upx; height:50upx;margin: 0 auto;}
	.BTabbarImg uni-image { width: 100%;height: 100%;border-radius: 50%; }	
	.BTabbarC{text-align: center; }
	/* #ifndef H5 */
		.BTabbar text {font-size: 28upx;}
		.BTabbarC{margin: 22upx auto;}
		.BTabbar{position: fixed;bottom:0;max-width:1190px;width:100%;box-shadow: 0px -1px #9a9a9a;background: #F5F5F5;}
	/* #endif */
	/* #ifdef H5 */
		.BTabbar{position: fixed;max-width:1190px;width:100%;box-shadow: 0px -1px #9a9a9a;z-index: 999;}	
		@media screen and (min-width: 361px) {
			.BTabbarC{margin: 22upx 0upx;}
			.BTabbar{top:0;justify-content: flex-end;background: transparent;}
		}
		@media screen and (max-width: 361px) {
			.BTabbar{bottom:0;justify-content:center;background: #F5F5F5;}
			.BTabbarC{margin: 22upx auto;}
		}
	/* #endif */
</style>
