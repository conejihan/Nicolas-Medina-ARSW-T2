package edu.eci.arsw.services.impl;



@Service
public class CoronaVirusTestServiceIMPL implements CoronaVirusTestService {
    @Autowired
    HttpConnectionService httpConnectionService;

    public CountryResultsgetCasesByCountry(String country){
        JSONObject countryResults = httpConnectionService.getCasesByCountry(country);
    }
}
