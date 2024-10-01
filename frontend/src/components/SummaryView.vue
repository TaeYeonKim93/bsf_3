<template>

    <v-data-table
        :headers="headers"
        :items="summary"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SummaryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            summary : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/summaries'))

            temp.data._embedded.summaries.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.summary = temp.data._embedded.summaries;
        },
        methods: {
        }
    }
</script>

