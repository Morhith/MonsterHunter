<template>
	<view class="top-window-header">
		<view class="left-header logo">
			<navigator class="logo" open-type="reLaunch" url="/pages/index/index">
				<image src="../static/logo.png" mode="heightFix" style="width: 30px;"></image>
				<text>AceShop</text>
			</navigator>
		</view>
	</view>
</template>
<script>
</script>

<style>
	.top-window-header {
		height: 60px;
		padding: 0 15px;
		display: flex;
		flex-direction: row;
		justify-content: space-between;
		align-items: center;
		box-sizing: border-box;
		border-bottom: 1px solid #e1e1e1;
		background-color: #FFFFFF;
		color: #333;
	}
	.logo {
		display: flex;
		flex-direction: row;
		align-items: center;
		flex: 1;
	}
	.logo image {
		height: 30px;
		width: 30px;
	}
	.logo text {
		margin-left: 8px;
	}
	.right-header {
		display: flex;
		flex-direction: row;
		color: #333;
	}
	.right-header-item {
		line-height: 25px;
		margin-left: 40px;
		cursor: pointer;
		font-size: 16px;
	}
	.active {
		color: #4cd964;
		border-bottom: 2px solid;
	}
	.tab-bar-flex {
		width: 360px;
	}
	.phone-link {
		padding-left: 20px;
		cursor: pointer;
	}
</style>
