package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    private List<Machine> listTruck = Arrays.asList(new Truck(),new Truck(), new Truck());

    @Override
    public List<Machine> get() {
        return listTruck;
    }
}
