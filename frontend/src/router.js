
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import MapMapManager from "./components/listers/MapMapCards"
import MapMapDetail from "./components/listers/MapMapDetail"

import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"
import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import StatisticStatisticManager from "./components/listers/StatisticStatisticCards"
import StatisticStatisticDetail from "./components/listers/StatisticStatisticDetail"

import SummarySummaryManager from "./components/listers/SummarySummaryCards"
import SummarySummaryDetail from "./components/listers/SummarySummaryDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },

            {
                path: '/maps/maps',
                name: 'MapMapManager',
                component: MapMapManager
            },
            {
                path: '/maps/maps/:id',
                name: 'MapMapDetail',
                component: MapMapDetail
            },

            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },

            {
                path: '/statistics/statistics',
                name: 'StatisticStatisticManager',
                component: StatisticStatisticManager
            },
            {
                path: '/statistics/statistics/:id',
                name: 'StatisticStatisticDetail',
                component: StatisticStatisticDetail
            },

            {
                path: '/summaries/summaries',
                name: 'SummarySummaryManager',
                component: SummarySummaryManager
            },
            {
                path: '/summaries/summaries/:id',
                name: 'SummarySummaryDetail',
                component: SummarySummaryDetail
            },




    ]
})
