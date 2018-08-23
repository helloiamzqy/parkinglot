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
        //When
        boolean flag = parkingBoy.park(car);
        //Then
        Assert.assertTrue(flag);
    }
}
