<template>

    <v-card outlined>
        <v-card-title>
            AiModel # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Boolean label="IsCreated" v-model="item.isCreated" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="IsDeployed" v-model="item.isDeployed" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="IsAnalyzed" v-model="item.isAnalyzed" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ModelName" v-model="item.modelName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Status" v-model="item.status" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Performance" v-model="item.performance" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'AiModelViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/aiModels/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

