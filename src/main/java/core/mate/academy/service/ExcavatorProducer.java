package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    private final List<Machine> listExcavator = Arrays.asList(new Excavator(),new Excavator());

    @Override
    public List<Machine> get() {
        return listExcavator;
    }
}
