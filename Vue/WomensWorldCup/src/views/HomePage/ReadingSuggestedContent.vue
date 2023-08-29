<template>
  <div class="suggested-content">
    <div class="suggested-news" v-for="n in 4" :key="n">
      <img src="@/assets/word_cup.webp" alt="Suggested News" class="suggested-image" />
      <h3 class="suggested-title">Suggested News Title <ShareButton/></h3>
    </div>
  </div>
</template>

<script>
import ShareButton from "@/components/ShareButton.vue";

export default {
  name: "ReadingSuggestedContent",
  components: {ShareButton}
}
</script>

<style scoped>
.suggested-news {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.suggested-image {
  width: 100%;
  height: auto;
}

.suggested-title {
  font-size: 1.2rem;
}
</style>