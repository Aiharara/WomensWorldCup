<template>
  <div class="main-content">
    <img src="@/assets/word_cup.webp" alt="Main News" class="main-image" />
    <div class="main-news">
      <h2 class="news-title">News Title <ShareButton/></h2>
      <p class="news-summary"><span>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad atque blanditiis, consequuntur dolores eum nesciunt quasi quia quos saepe tempore! Architecto asperiores est fugiat harum. Dignissimos ipsam neque sunt veritatis.</span><span>A, aliquid blanditiis maxime natus numquam quasi quos tempora voluptas. Ad aliquam aspernatur beatae corporis deleniti, in molestiae nesciunt nisi nostrum odio, quas quis quisquam quo sit vero vitae voluptatibus.</span></p>
    </div>
  </div>

</template>

<script>
import ShareButton from "@/components/ShareButton.vue";

export default {
  name: "ReadingMainContent",
  components: {ShareButton}
}
</script>

<style scoped>
.main-content {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 50%;
  margin: 50px;
}

.main-image {
  width: 100%;
  height: auto;
}

.main-news {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  align-items: center;
  width: 100%;
}

.news-title {
  font-size: 1.5rem;
}

.news-summary {
  font-size: 1rem;
}
</style>