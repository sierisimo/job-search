package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    CLIArguments(){

    }
    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeyWordValidator.class,
            description = "keyword"

    )
    private String keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "Cada busqueda puede incluir una ubicación"
    )
    private String location;
    @Parameter(
            names = {"--page", "-p"},
            description = "Devuelve 50 resultado por defecto, ingrdas un número en el parametro"
    )
    private int page = 0;
    @Parameter(
            names = "--full-time",
            description = "Filtrar por los parametros de tiempo completo"
    )
    private boolean isFulltime = false;
    @Parameter(
            names = "--markdown",
            description = "Filtrar por los resultados en markdown"
    )
    private boolean isMarkdown =false;
    @Parameter(
            names = {"--help", "-h"},
            validateWith = CLIHelpValidator.class,
            description = "Motrar la ayuda"
    )
    private boolean isHelp;

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFulltime() {
        return isFulltime;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFulltime=" + isFulltime +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
