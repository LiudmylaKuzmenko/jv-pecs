package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    private final List<Machine> listBulldozer = Arrays.asList(new Bulldozer(),
            new Bulldozer(), new Bulldozer());

    @Override
    public List<Machine> get() {
        return listBulldozer;
    }
}
