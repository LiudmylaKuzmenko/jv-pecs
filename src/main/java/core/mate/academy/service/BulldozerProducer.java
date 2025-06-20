package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> listBulldozer = Arrays.asList(new Bulldozer(),
            new Bulldozer(), new Bulldozer());

    @Override
    public List<Bulldozer> get() {
        return listBulldozer;
    }
}
