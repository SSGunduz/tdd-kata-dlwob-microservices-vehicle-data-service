package com.tdd.katas.dlwob.microservices.vehicledataservice.controller;


import com.tdd.katas.dlwob.microservices.vehicledataservice.model.VehicleData;
import com.tdd.katas.dlwob.microservices.vehicledataservice.service.VehicleDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hexad GmbH on 24/05/2017.
 */
@RestController
@RequestMapping(VehicleDataController.URL_MAPPING)
public class VehicleDataController {

    public static final String URL_MAPPING = "/vehicle-data";

    @Autowired
    private VehicleDataService vehicleDataService;

    @RequestMapping("/{vinCode}")
    public ResponseEntity<VehicleData> getVehicleData(@PathVariable  String vinCode){
        VehicleData vehicleData;

        try {

            vehicleData=vehicleDataService.getVehicleData(vinCode);

        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if(vehicleData==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(vehicleData,HttpStatus.OK);

    }
}
