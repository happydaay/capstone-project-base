<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title>
            {{label}}
        </v-card-title>
        <v-card-text v-if="value">
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field type="number" label="Amount" v-model="value.amount"/>
            </div>
            <div v-else>
                Amount :  {{value.amount}}
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Currency" v-model="value.currency"/>
            </div>
            <div v-else>
                Currency : {{value.currency}}
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name:"Money",
        props: {
            editMode: Boolean,
            value : Object,
            label : String,
        },
        created(){
            if(!this.value) {
                this.value = {
                    'amount': 0,
                    'currency': '',
                };
            }
        },
        watch: {
            value(newVal) {
                this.$emit('input', newVal);
            },
        },
    }
</script>

<style scoped>
</style>