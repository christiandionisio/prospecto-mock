package com.example.prospectomock.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mockService")
public class MockController {

    private static Logger LOGGER = LoggerFactory.getLogger(MockController.class);

    @Value("classpath:output.json")
    Resource resourceFileResponseOK;


    @GetMapping("/checkstatus")
    public String checkStatus(){
        return "STATUS OK";
    }

    @PostMapping
    public ResponseEntity<Object> mockService(@RequestBody String input) {

        Map<String, Object> mapResponse = resourceToJson(resourceFileResponseOK);

        if (mapResponse == null) {
            return new ResponseEntity<>("Error interno", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<Object>(mapResponse, HttpStatus.OK);
    }

    private Map<String, Object> resourceToJson(Resource resourcePath) {
        try {
            InputStream inputStream =  resourceFileResponseOK.getInputStream();
            String json = new BufferedReader(new InputStreamReader(inputStream))
                    .lines().collect(Collectors.joining("\n"));
            LOGGER.info("Json from file: " + json );

            Map<String,Object> result = new ObjectMapper().readValue(json, HashMap.class);

            return result;

        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.info("ERROR: " + e.getMessage());
            return null;
        }
    }

}
