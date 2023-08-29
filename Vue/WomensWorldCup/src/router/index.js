import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/DefaultPages/HomeView.vue'
import RecommendedReadingPage from "@/views/HomePage/RecommendedReadingPage.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/home',
      name: 'vue-home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/DefaultPages/AboutView.vue')
    },
    {
      path: '/',
      name: 'home',
      component: RecommendedReadingPage
    }
  ]
})

export default router
