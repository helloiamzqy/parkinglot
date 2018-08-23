package parkinglot;

import java.util.HashMap;
import java.util.Map;
class ParkLot {
    private Map<String,Car> carMap = new HashMap<>();
    private int carportCount =50;

    boolean park(Car car) {
        if(!isFull()){
            carMap.put(car.getCarNum(),car);
            return true;
        }
        return false;
    }

    Car pick(String carNum) {
        if(carMap.containsKey(carNum)) {
            Car pickedCar = carMap.get(carNum);
            carMap.remove(carNum);
            return pickedCar;
        }
        return null;
    }

    void setCarportCount(int carportCount) {
        this.carportCount = carportCount;
    }

    Map<String, Car> getCarMap() {
        return carMap;
    }

    boolean isFull(){
        return carMap.size()>= carportCount;
    }
}
