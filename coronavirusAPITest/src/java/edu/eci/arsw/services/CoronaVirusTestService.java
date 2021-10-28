package edu.eci.arsw.services;

import edu.eci.arsw.model.CountryResults;

public interface CoronaVirusTestService {
    Set<CountryResults> getAllCases();
    CountryResults getCasesByCountry(String Country);
}