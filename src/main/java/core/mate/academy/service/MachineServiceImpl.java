package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducer<Machine> bulldozerProducer = new BulldozerProducer();
    private final MachineProducer<Machine> excavatorProducer = new ExcavatorProducer();
    private final MachineProducer<Machine> truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            List<? extends Machine> bulldozerMachines = bulldozerProducer.get();
            return new ArrayList<>(bulldozerMachines);
        }

        if (type.equals(Excavator.class)) {
            List<? extends Machine> excavatorMachines = excavatorProducer.get();
            return new ArrayList<>(excavatorMachines);
        }

        if (type.equals(Truck.class)) {
            List<? extends Machine> truckMachines = truckProducer.get();
            return new ArrayList<>(truckMachines);
        }

        return new ArrayList<>();
    }

    @Override
    public void fill(List<Object> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
