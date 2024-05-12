package com.patecan.kiotviet.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.*;

@RestController
@RequestMapping("/webhooks/products")
public class ProductController {
    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @PostMapping
    public ResponseEntity<String> listenProductChange(@RequestBody String payload) {
        logger.info(payload);
        System.out.println(payload);
        return ResponseEntity.ok(payload);
    }

}
