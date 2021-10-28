package edu.eci.arsw.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.asw.openweather.services.WeatherService;

@RestController
public class CoronaVirusTestController {
    @Autowired
    CoronaVirusTestService coronaVirusTestService;

    @RequestMapping(value = "coronaVirusTest/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCases() {
        try {
            return new ResponseEntity<>(coronaVirusTestService.getAllCases(), HttpStatus.ACCEPTED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al buscar la información", HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "coronaVirusTest/{country}", method = RequestMethod.GET)
    public ResponseEntity<?> getCasesByCountry(String country){
        try{
            return new ResponseEntity<> (coronaVirusTestService.getCasesByCountry(), HttpStatus.ACCEPTED)
        }
        } catch(Exception e) {
        return new ResponseEntity<>("Error al buscar la información del país", HttpStatus.BAD_REQUEST);
        }
    }
}