package com.tdd.katas.dlwob.microservices.vehicledataservice.service;


import com.tdd.katas.dlwob.microservices.vehicledataservice.model.VehicleData;
import org.springframework.stereotype.Service;

/**
 * Created by Hexad GmbH on 23/05/2017.
 */
@Service
public class MockVehicleDataServiceImpl extends AbstractMockServiceImpl<VehicleData> implements VehicleDataService{

    @Override
    public VehicleData getVehicleData(String vin)  {

        if(MockServicesConstants.SAMPLE_VEHICLE_VIN_CODE.equals(vin))
            return dtoObject;
        else
            return null;

    }



    public MockVehicleDataServiceImpl() {
           super(VehicleData.class);
    }

}
