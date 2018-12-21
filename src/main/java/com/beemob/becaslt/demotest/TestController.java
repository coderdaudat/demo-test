package com.beemob.becaslt.demotest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by truongnguyen on 12/21/18.
 */
@RestController
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private io.opentracing.Tracer tracer;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> createUser(@RequestParam("name") String userDto) {
        logger.info("NAME: " + userDto);
        tracer.activeSpan().setBaggageItem("transaction", "buy");
        return new ResponseEntity(userDto, HttpStatus.OK);
    }

}
