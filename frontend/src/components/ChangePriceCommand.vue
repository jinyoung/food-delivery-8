<template>

    <v-card outlined>
        <v-card-title>
            ChangePrice
        </v-card-title>

        <v-card-text>
            <Number label="Price" v-model="value.price" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="changePrice"
            >
                ChangePrice
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ChangePriceCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.price = 0;
        },
        watch: {
        },
        methods: {
            changePrice() {
                this.$emit('changePrice', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

