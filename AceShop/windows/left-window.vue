<template>
	<view class="left-window-style">
		<view class="second-menu">
			<component v-bind:is="active"></component>
		</view>
	</view>
</template>

<script>
	import personinfoPage from '@/pages/tabBar/preson/presoninfo.vue'
	import {
		mapMutations,
		mapState
	} from 'vuex'
	export default {
		data() {
			return {
				nav: [
					'component',
				]
			}
		},
		props: {
			matchLeftWindow: {
				type: Boolean
			}
		},
		components: {
			personinfoPage,
		},
		computed: {
			...mapState({
				active: state => state.active,
			})
		},
		watch: {
			matchLeftWindow: {
				immediate: true,
				handler(newMatches) {
					this.setMatchLeftWindow(newMatches)
				}
			},
			$route: {
				immediate: true,
				handler(newRoute) {
					if (this.matchLeftWindow) {
						if (newRoute.path === '/') {
							uni.redirectTo({
								url: 'pages/index/index'
							})
						} else if (!newRoute.matched.length) {
							uni.redirectTo({
								url: 'pages/error/404'
							})
						} else {
							let active = newRoute.path.split('/')[2]
							if (this.nav.includes(active)) {
								if (active === 'component') {
									active = 'componentPage'
								}
								if (active === 'template') {
									active = 'templatePage'
								}
								this.setActive(active)
							}
						}
					}
				}
			}
		},
		methods: {
			...mapMutations(['setMatchLeftWindow', 'setActive']),
		}
	}
</script>

<style>
	@import '../common/uni-nvue.css';

	.left-window-style {
		min-height: calc(100vh - var(--top-window-height));
		background-color: #f8f8f8;
	}

	.second-menu {
		width: 350px;
		background-color: #F8F8F8;
	}

	.icon-image {
		width: 30px;
		height: 30px;
	}
</style>
