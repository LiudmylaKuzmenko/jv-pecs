package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> listExcavator = Arrays.asList(new Excavator(),new Excavator());

    @Override
    public List<Excavator> get() {
        return listExcavator;
    }
}
