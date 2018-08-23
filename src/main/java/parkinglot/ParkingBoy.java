package parkinglot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ParkingBoy {
    private List<ParkLot> parkLots = new ArrayList<>();
    private Map<String,Integer> carLocation = new HashMap<>();

    void addParkLots(ParkLot parkLot){
        parkLots.add(parkLot);
    }

    boolean park(Car car) {
        for(int i = 0;i<parkLots.size();i++){
            ParkLot parkLot = parkLots.get(i);
            if(!parkLot.isFull()){
                parkLot.park(car);
                carLocation.put(car.getCarNum(),i);
                return true;
            }
        }
        return false;
    }

    Car pick(String carNum) {
        if(carLocation.get(carNum)!=null){
        int location=carLocation.get(carNum);
            ParkLot parkLot= parkLots.get(location);
            Car car=parkLot.pick(carNum);
            return car;
        }
        return null;
    }
}
