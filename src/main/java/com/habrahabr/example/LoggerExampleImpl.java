package com.habrahabr.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by rado on 9/20/16.
 */
public class LoggerExampleImpl implements LoggerExample {
    private static final Logger log = LoggerFactory.getLogger(LoggerExampleImpl.class);


    @Value("${branch.name}")
    private String branchName;

    @Value("${commit.hash}")
    private String commitHash;

    @Value("${application.version}")
    private String version;


    public void printLog() {
        log.info("Project version: {}, git branch: {}, commit hash: {}",
                version, branchName, commitHash);
    }
}
