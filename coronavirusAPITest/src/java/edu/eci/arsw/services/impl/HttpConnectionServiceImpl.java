package edu.eci.arsw.services.impl;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public interface HttpConnectionServiceImpl implements HttpConnectionService {


    @Override
    public JSONObject getAllCases()throws UnirestException{
        HttpResponse<JsonNode> response = Unirest
                .get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats")
                .header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
                .header("x-rapidapi-key", "34f05cff54msh30ba6f36c91c183p166499jsn555917ef62b8")
                .asJson();
        return response;
    }
    @Override
    public JSONObject getCaseByCountry(String country) throws UnirestException {
        HttpResponse<JsonNode> response = Unirest
                .get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country=" + country)
                .header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
                .header("x-rapidapi-key", "34f05cff54msh30ba6f36c91c183p166499jsn555917ef62b8")
                .asJson();
        return response;
}