var api = (function (){
    return {
        getAllCases: function (callback) {
            var promiseGetAllCases = $.getJSON(`coronaVirusTest/`);
            $.when(promiseGetAllCases).done(function (data) {
                callback(data);
            });
        }
    }
    })();
