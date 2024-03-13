import LoginView from "@/views/LoginView.vue";
import {createRouter, createWebHistory} from "vue-router";

const routes = [

    {
        path: '/login',
        name: 'loginRoute',
        component: LoginView
    },

]

let process;
const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})
export default router