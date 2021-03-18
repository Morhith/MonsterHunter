<script>
	export default {
		onLaunch: function() {
			console.log('App Launch')
		},
		onShow: function() {
			console.log('App Show')
		},
		onHide: function() {
			console.log('App Hide')
		}
	}
</script>

<style>
	/* uni.css - 通用组件、模板样式库，可以当作一套ui库应用 */
	@import './common/uni.css';
	@import './common/AceC.css';
	/* H5 兼容 pc 所需 */
	/* #ifdef H5 */
	@media screen and (min-width: 768px) {
		body{
			overflow-y: scroll;
		}
	}
	uni-page-body {
		background-color: #F5F5F5 !important;
		min-height: 100% !important;
		height: auto !important;
	}

	.uni-top-window uni-tabbar .uni-tabbar {
		background-color: #fff !important;
	}
	.uni-page-head__title { color: #696969;}
	.uni-app--showleftwindow .hideOnPc {
		display: none !important;
	}
	/* #endif */
</style>
