package parkinglot;

import java.util.HashMap;
import java.util.Map;
class ParkLot {
    private String parkName;
    private Map<String,Car> carMap = new HashMap<>();
    private int maxCount =50;

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

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    public boolean isFull(){
        return carMap.size()>=maxCount;
    }
}
