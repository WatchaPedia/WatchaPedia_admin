$(function(){

    let itemList = createApp({
        data() {
            return {
                itemList: {}
            }
        }
    }).mount('#itemList');
    function searchStart(){
        $.get("/api/movielist", function(response){
            console.log(response);
            itemList.itemList = response.data;

        });
    }
});