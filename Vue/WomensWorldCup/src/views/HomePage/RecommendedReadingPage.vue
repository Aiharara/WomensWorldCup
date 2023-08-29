
<template>
  <Navbar/>
  <div class="container">
    <!-- First Part: Recommended Reading Label -->
    <div class="recommended-reading">
      <h1>Recommended Reading</h1>
    </div>

    <!--  Content Part  -->
    <div class="content">
      <!-- Second Part: Main Content Area -->
      <ReadingMainContent class="main-content"/>
      <!-- Third Part: Suggested Content Area -->
      <ReadingSuggestedContent class="suggested-content"/>
    </div>
  </div>
</template>

<script>
import ReadingMainContent from "@/views/HomePage/ReadingMainContent.vue";
import ShareButton from "@/components/ShareButton.vue";
import ReadingSuggestedContent from "@/views/HomePage/ReadingSuggestedContent.vue";
import Navbar from "@/components/Navbar.vue";

export default {
  name: 'RecommendedReadingPage',
  components: {Navbar, ReadingSuggestedContent, ShareButton, ReadingMainContent},
};
</script>

<style scoped>
.container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.recommended-reading h1 {
  font-size: 2rem;
  margin-bottom: 20px;
}

.main-content {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 50%;
  margin: 50px;
}

.suggested-content {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 20px;
  width: 50%;
}



.content {
  width: 1000px;
  display: flex;
  flex-direction: row;
}
</style>
