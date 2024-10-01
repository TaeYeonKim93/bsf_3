
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AimodelAiModelManager from "./components/listers/AimodelAiModelCards"
import AimodelAiModelDetail from "./components/listers/AimodelAiModelDetail"

import MapMapManager from "./components/listers/MapMapCards"
import MapMapDetail from "./components/listers/MapMapDetail"

import ModeldataRiskDataManager from "./components/listers/ModeldataRiskDataCards"
import ModeldataRiskDataDetail from "./components/listers/ModeldataRiskDataDetail"
import ModeldataSrcDataManager from "./components/listers/ModeldataSrcDataCards"
import ModeldataSrcDataDetail from "./components/listers/ModeldataSrcDataDetail"

import StatisticStatisticManager from "./components/listers/StatisticStatisticCards"
import StatisticStatisticDetail from "./components/listers/StatisticStatisticDetail"

import SummarySummaryManager from "./components/listers/SummarySummaryCards"
import SummarySummaryDetail from "./components/listers/SummarySummaryDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/aimodels/aiModels',
                name: 'AimodelAiModelManager',
                component: AimodelAiModelManager
            },
            {
                path: '/aimodels/aiModels/:id',
                name: 'AimodelAiModelDetail',
                component: AimodelAiModelDetail
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
                path: '/modeldata/riskData',
                name: 'ModeldataRiskDataManager',
                component: ModeldataRiskDataManager
            },
            {
                path: '/modeldata/riskData/:id',
                name: 'ModeldataRiskDataDetail',
                component: ModeldataRiskDataDetail
            },
            {
                path: '/modeldata/srcData',
                name: 'ModeldataSrcDataManager',
                component: ModeldataSrcDataManager
            },
            {
                path: '/modeldata/srcData/:id',
                name: 'ModeldataSrcDataDetail',
                component: ModeldataSrcDataDetail
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
