
<template>
    <div :style="{height: height + 'rem', width: width + 'rem'}" class="item-wrapper" >
        <slot :ref="'item' + name"></slot>
    </div>
</template>

<script>
    export default {
        name: "my-swiper-item",
        props: {
            width: {
                type: Number,
                required: true
            },
            height: {
                type: String,
                default: '4'
            }
        }
    }
</script>

<style scoped>

</style>
