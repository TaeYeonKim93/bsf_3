<template>

    <v-data-table
        :headers="headers"
        :items="map"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MapView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            map : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/maps'))

            temp.data._embedded.maps.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.map = temp.data._embedded.maps;
        },
        methods: {
        }
    }
</script>

