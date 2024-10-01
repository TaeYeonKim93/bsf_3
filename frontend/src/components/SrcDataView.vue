<template>

    <v-data-table
        :headers="headers"
        :items="srcData"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SrcDataView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            srcData : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/srcData'))

            temp.data._embedded.srcData.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.srcData = temp.data._embedded.srcData;
        },
        methods: {
        }
    }
</script>

