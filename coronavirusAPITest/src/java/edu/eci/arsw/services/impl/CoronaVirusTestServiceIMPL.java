package edu.eci.arsw.services.impl;



@Service
public class CoronaVirusTestServiceIMPL implements CoronaVirusTestService {
    @Autowired
    HttpConnectionService httpConnectionService;
    public Set<CountryResults> getAllCases(){
        JSONObject countryResults = httpConnectionService.getAllCases();
    }
    public CountryResults getCasesByCountry(String country){
        JSONObject countryResults = httpConnectionService.getCasesByCountry(country);
    }
}
