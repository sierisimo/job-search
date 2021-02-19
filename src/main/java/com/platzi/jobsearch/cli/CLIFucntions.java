package com.platzi.jobsearch.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFucntions {
    public static Map<String, Object> toMap(CLIArguments cliArguments){
        Map<String, Object> params = new HashMap<>();

        params.put("description", cliArguments.getKeyword());
        params.put("location", cliArguments.getLocation());
        params.put("full_time", cliArguments.isFulltime());
        params.put("page", cliArguments.getPage());

        if (cliArguments.isMarkdown()) params.put("markdown", true);

        return params;
    }
}
