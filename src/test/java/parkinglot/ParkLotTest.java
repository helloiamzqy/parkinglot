package parkinglot;

import org.junit.Assert;
import org.junit.Test;

public class ParkLotTest {
    private ParkLot parkLot = new ParkLot();
    @Test
    public void should_return_true_when_input_car(){
        //Given
        Car car = new Car();
        car.setCarNum("粤C123123123");
        //When
        boolean flag = parkLot.park(car);
        //Then
        Assert.assertTrue(flag);
    }
    @Test
    public void should_return_car_when_input_carNum(){
        //Given
        Car car = new Car();
        car.setCarNum("粤C123123123");
        parkLot.park(car);
        //When
        Car pickedCar = parkLot.pick(car.getCarNum());
        //Then
        Assert.assertNotNull(pickedCar);
        Assert.assertEquals(pickedCar.getCarNum(),car.getCarNum());
    }
}
