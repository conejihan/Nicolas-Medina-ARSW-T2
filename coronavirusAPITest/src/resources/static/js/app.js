var app = (function (){
    var appiClient = "js/appiClient.js";
    var mapCasesCountry = function (data){
        mapList = data.map(function (blueprint){
            let nameCountry = countryResults.name;
            let numDeaths = countryResults.numDeaths;
            let numInfected = countryResults.numInfected;
            let numCured = countryResults.numCured;
            return {
                nameCountry,
                numDeaths,
                numInfected,
                numCured
            };
        });
    }

    function updateData(){
        let html = "";
        mapList.map(function (countryResults) {
            html += "<tr>";
            html += "<td>" + countryResults.name +  "</td>";

            html += "<td>" +countryResults.numDeaths+ "</td>";
            html += "<td>" + countryResults.numInfected+ "</td>"
            html += "<td>" + countryResults.numCured+ "</td>"
            html += "</tr>"

        });

        $("#Table_Content").html(html);

    }

    return {
        getAllCases: function () {
            $.getScript(appiClient, function () {
                api.getAllCases(mapCasesCountry,updateData);
            });
        }
    }
})();