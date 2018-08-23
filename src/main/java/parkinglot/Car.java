package parkinglot;

class Car {
    private String carNum;

    String getCarNum() {
        return carNum;
    }

    void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public Car(String carNum) {
        this.carNum = carNum;
    }

    public Car() {
    }
}
