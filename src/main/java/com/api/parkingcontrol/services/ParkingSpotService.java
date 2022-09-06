package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.parkingcontrol.repositories.ParkingStopRepository;

@Service
public class ParkingSpotService {


    final ParkingStopRepository parkingSpotRepository;

    public ParkingSpotService(ParkingStopRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Object save(ParkingSpotModel parkingSpotModel) {

    }
}
