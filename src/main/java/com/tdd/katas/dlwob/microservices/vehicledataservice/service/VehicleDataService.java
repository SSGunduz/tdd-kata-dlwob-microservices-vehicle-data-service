package com.tdd.katas.dlwob.microservices.vehicledataservice.service;


import com.tdd.katas.dlwob.microservices.vehicledataservice.model.VehicleData;

/**
 * Created by Hexad GmbH on 23/05/2017.
 */
public interface VehicleDataService {

    VehicleData getVehicleData(String vin);
}
