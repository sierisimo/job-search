package com.platzi.jobsearch;

import com.beust.jcommander.JCommander;

import java.util.function.Supplier;

public class CommanderFunctions {
    static <T> JCommander buildCommanderWithName(
            String cliName, Supplier<T> argumentSupplier
    ) {
        JCommander jCommander = JCommander.newBuilder()
                .addCommand(argumentSupplier.get())
                .build();

        jCommander.setProgramName(cliName);
        return jCommander;
    }
}
