[toc]

# WomensWorldCup

This template should help get you started developing with Vue 3 in Vite.



## 如何开始?

See [Vite Configuration Reference](https://vitejs.dev/config/).

### 先安装Node.js最新版本(或者node 16+) 官网: https://nodejs.org/en/download/current

### 然后运行下面的前两条指令

### 1. 安装依赖

```sh
npm install
```

### 2. 运行

```sh
npm run dev        --这行命令可以运行前端, 但是你们得在这个readme所在的文件夹访问
```

### 3. 这个是打包前端. 会存在dist文件夹里

```sh
npm run build
```





## 下面是每个文件目录的解释 (src文件夹下)

├─assets
├─components
│  └─icons
├─router
├─stores
└─views
    ├─DefaultPages
    ├─HomePage
    ├─LoginPage
    └─RegisterPage

### `assets`

这个目录通常用于存储项目中用到的静态资源，比如图片、样式（CSS/SCSS 文件）或者其他需要被 Webpack 处理的文件。

### `components`

这个目录用于存放 Vue 组件，这些组件可以在多个视图或其他组件中被复用。一般来说，这里的组件是全局性的，不属于任何一个特定的视图。所以导航栏丢里面了`NavBar.vue`

#### `components/icons`

这个子目录可能用于存放自定义的图标组件。

### `router`

这个目录通常包含 Vue Router 的配置文件。这里定义了路由规则，控制着 URL 如何映射到特定的视图（页面）。

### `stores`

这个目录通常用于 Vuex 的状态管理。这里定义了各种 state、mutations、actions 等，用于管理组件的状态。

### `views`

这个目录用于存放应用的“页面”级别的 Vue 组件。通常，这些组件是路由规则对应的视图。

#### `views/DefaultPages`

这个子目录可能用于存放应用的默认或基础页面，比如 404 错误页面。

#### `views/HomePage`

这个子目录可能包含主页（Home Page）的所有相关组件和逻辑。

#### `views/LoginPage`

这个子目录用于存放登录页面的所有相关组件和逻辑。

#### `views/RegisterPage`

这个子目录用于存放注册页面的所有相关组件和逻辑。

这样的目录结构有助于保持项目的整洁，也方便团队成员理解项目布局和各个文件的职责。



