
interface Vehical {
    String getBrand();

    default public String turnAlarmOn() {
        return "Turning the vehical alarmon";
    }

    default public String turnAlarmOff() {
        return "Turning the vechical alarmoff";
    }
}

interface Alram {
    default public String turnAlarmOn() {
        return "hello";
    }

    default public String turnAlarmOff() {
        return "Hiii";
    }
}

class Car1 implements Vehical, Alram {
    public String turnAlarmOn() {
        return Vehical.super.turnAlarmOn();
    }

    public String turnAlarmOff() {
        return Vehical.super.turnAlarmOff();
    }

    @Override
    public String getBrand() {
        {
            return "chanchal";
        }
    }
}

class Driver20 {
    public static void main(String[] args) {
        Car1 c = new Car1();
        System.out.println(c.turnAlarmOff());
        System.out.println(c.getBrand());
    }
}
