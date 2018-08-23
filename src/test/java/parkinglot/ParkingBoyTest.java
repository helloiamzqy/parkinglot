package parkinglot;

import org.junit.Assert;
import org.junit.Test;

public class ParkingBoyTest {
    ParkingBoy parkingBoy = new ParkingBoy();
    @Test
    public void should_return_true_when_input_car(){
        //Given
        Car car = new Car();
        car.setCarNum("粤C123123123");
        ParkLot parkLot = new ParkLot();
        parkLot.setCarportCount(1);
        parkLot.park(new Car("粤C22233322"));
        ParkLot parkLot1 = new ParkLot();
        parkingBoy.addParkLots(parkLot);
        parkingBoy.addParkLots(parkLot1);
        //When
        parkingBoy.park(car);
        //Then
        Assert.assertEquals(car,parkLot1.getCarMap().get(car.getCarNum()));
    }
    @Test
    public void should_return_car_when_input_carNum(){
        //Given
        Car car =new Car();
        car.setCarNum("粤C123123123");
        ParkLot parkLot = new ParkLot();
        parkLot.setCarportCount(1);
        parkLot.park(new Car("粤C123123123"));
        ParkLot parkLot1 = new ParkLot();
        parkingBoy.addParkLots(parkLot);
        parkingBoy.addParkLots(parkLot1);
        parkingBoy.park(car);
        //When
        Car pickedCar=parkingBoy.pick(car.getCarNum());
        //Then
        Assert.assertEquals(car.getCarNum(),pickedCar.getCarNum());
    }
}
