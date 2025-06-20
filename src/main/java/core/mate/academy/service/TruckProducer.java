package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> listTruck = Arrays.asList(new Truck(),new Truck(), new Truck());

    @Override
    public List<Truck> get() {
        return listTruck;
    }
}
