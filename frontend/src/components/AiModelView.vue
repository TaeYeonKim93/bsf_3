<template>

    <v-data-table
        :headers="headers"
        :items="aiModel"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'AiModelView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "isCreated", value: "isCreated" },
                { text: "isDeployed", value: "isDeployed" },
                { text: "isAnalyzed", value: "isAnalyzed" },
                { text: "modelName", value: "modelName" },
                { text: "status", value: "status" },
                { text: "performance", value: "performance" },
            ],
            aiModel : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/aiModels'))

            temp.data._embedded.aiModels.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.aiModel = temp.data._embedded.aiModels;
        },
        methods: {
        }
    }
</script>

