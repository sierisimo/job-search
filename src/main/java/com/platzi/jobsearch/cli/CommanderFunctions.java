package com.platzi.jobsearch.cli;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CommanderFunctions {

    public static <T>JCommander buildCommanderWithName(String cliName, Supplier<T> argumentSupplier){
        JCommander jCommander = JCommander.newBuilder()
                .addObject(argumentSupplier.get())
                .build();
        jCommander.setProgramName(cliName);
        return jCommander;
    }

    // tranformar los Argumentos
    public static Optional<List<Object>> parseArguments(
            JCommander jCommander,
            String[] arguments,
            Consumer<JCommander> onError
    ){
        // Tomar los arguentos y retornar el optional de JComander devuelve
        try{
            jCommander.parse(arguments);
        }catch (ParameterException exception){
            onError.accept(jCommander);
        }
        return Optional.empty();
    }
}
