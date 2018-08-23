package parkinglot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ParkingBoy {
    private List<ParkLot> parkLots = new ArrayList<>();
    private Map<String,Integer> carLocation = new HashMap<>();

    public void addParkLots(ParkLot parkLot){
        parkLots.add(parkLot);
    }

    public void setParkLots(List<ParkLot> parkLots) {
        this.parkLots = parkLots;
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
}
