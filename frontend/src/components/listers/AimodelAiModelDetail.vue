<template>
    <v-card outlined>
        <v-card-title>
            AiModel # {{item._links.self.href.split("/")[item._links.self.href.split("/").length - 1]}}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="ModelId" v-model="item.modelId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ModelName" v-model="item.modelName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Status" v-model="item.status" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ModelPath" v-model="item.modelPath" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ModelVersion" v-model="item.modelVersion" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="IsLastestVersion" v-model="item.isLastestVersion" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="TrainCompTime" v-model="item.trainCompTime" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Performance" v-model="item.performance" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>

        <v-card-actions>
            <v-btn text color="deep-purple lighten-2" large @click="goList">List</v-btn>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="edit"
                    v-if="!editMode"
            >
                Edit
            </v-btn>
            <v-btn
                    color="primary"
                    text
                    @click="save"
                    v-else
            >
                Save
            </v-btn>
            <v-btn
                    color="primary"
                    text
                    @click="remove"
                    v-if="!editMode"
            >
                Delete
            </v-btn>
            <v-btn
                    color="primary"
                    text
                    @click="editMode = false"
                    v-if="editMode"
            >
                Cancel
            </v-btn>
        </v-card-actions>
    </v-card>
</template>


<script>
    const axios = require('axios').default;

    export default {
        name: 'AimodelAiModelDetail',
        components:{},
        props: {
        },
        data: () => ({
            item: null,
            editMode: false,
        }),
        async created() {
            var me = this;
            var params = this.$route.params;
            var temp = await axios.get(axios.fixUrl('/aiModels/' + params.id))
            if(temp.data) {
                me.item = temp.data
            }
        },
        methods: {
            goList() {
                var path = window.location.href.slice(window.location.href.indexOf("/#/"), window.location.href.lastIndexOf("/#"));
                path = path.replace("/#/", "/");
                this.$router.push(path);
            },
            edit() {
                this.editMode = true;
            },
            async remove(){
                try {
                    if (!this.offline) {
                        await axios.delete(axios.fixUrl(this.item._links.self.href))
                    }

                    this.editMode = false;

                    this.$emit('input', this.item);
                    this.$emit('delete', this.item);

                } catch(e) {
                    console.log(e)
                }
            },
        },
    };
</script>
