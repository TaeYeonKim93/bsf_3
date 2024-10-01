<template>

    <v-data-table
        :headers="headers"
        :items="risk"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'RiskView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            risk : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/risks'))

            temp.data._embedded.risks.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.risk = temp.data._embedded.risks;
        },
        methods: {
        }
    }
</script>

