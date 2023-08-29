
<template>
  <nav class="navbar">
    <div class="logo">
      <img src="@/assets/FIFA.svg" alt="Logo" />
    </div>
    <div class="nav-buttons">
      <button>TOURNAMENTS</button>
      <button>WATCH ON FIFA+</button>
      <button>PLAY</button>
      <button>MATCH CENTRE</button>
      <button>LIVE</button>
      <button>NEWS</button>
      <button>INSIDE FIFA</button>
      <button>SHOP</button>
    </div>
    <div class="nav-right">
      <img src="@/assets/user.svg" alt="User" class="user-icon" />
      <input type="search" placeholder="Search" class="search-box" />
    </div>
  </nav>
</template>

<script>
export default {
  name: 'Navbar',
};
</script>

<style scoped>
.navbar {
  display: flex;
  justify-content: space-between;
  align-items: center;
  background-color: #045695;
  color: lightgrey;
  position: fixed;
  top: 0;
  width: 100%;
  padding: 15px;
}

.logo img {
  height: 40px;
}

.nav-buttons button {
  background: none;
  border: none;
  color: lightgrey;
  margin: 0 15px;
  cursor: pointer;
}

.nav-right {
  display: flex;
  align-items: center;
}

.user-icon {
  height: 40px;
  cursor: pointer;
}

.search-box {
  margin-left: 15px;
  padding: 5px;
}
</style>
