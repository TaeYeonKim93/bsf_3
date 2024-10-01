<template>

    <v-data-table
        :headers="headers"
        :items="source"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SourceView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            source : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/sources'))

            temp.data._embedded.sources.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.source = temp.data._embedded.sources;
        },
        methods: {
        }
    }
</script>

