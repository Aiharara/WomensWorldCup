<script setup>
import TheWelcome from '../../components/TheWelcome.vue'
</script>

<template>
  <header>
    <img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="125" height="125" />

    <div class="wrapper">
      <HelloWorld msg="You did it!" />

      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
        <RouterLink to="/home">Demo Page</RouterLink>
      </nav>
    </div>
  </header>
  <main>
    <TheWelcome />
  </main>
</template>
