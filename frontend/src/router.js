
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PreApplicationAManager from "./components/listers/PreApplicationACards"

import CustomerAManager from "./components/listers/CustomerACards"

import IncomeVerificationResultAManager from "./components/listers/IncomeVerificationResultACards"

import AccountAManager from "./components/listers/AccountACards"

import AppliedResultR from "./components/AppliedResultR"
import NotificationAManager from "./components/listers/NotificationACards"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/preApplicationAS',
                name: 'PreApplicationAManager',
                component: PreApplicationAManager
            },

            {
                path: '/customerAS',
                name: 'CustomerAManager',
                component: CustomerAManager
            },

            {
                path: '/incomeVerificationResultAS',
                name: 'IncomeVerificationResultAManager',
                component: IncomeVerificationResultAManager
            },

            {
                path: '/accountAS',
                name: 'AccountAManager',
                component: AccountAManager
            },

            {
                path: '/appliedResultRS',
                name: 'AppliedResultR',
                component: AppliedResultR
            },
            {
                path: '/notificationAS',
                name: 'NotificationAManager',
                component: NotificationAManager
            },



    ]
})
