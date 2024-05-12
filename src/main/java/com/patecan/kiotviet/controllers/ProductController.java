package com.patecan.kiotviet.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/check")
    public ResponseEntity<String> check() {
        logger.info("check");
        System.out.println("check");
        return ResponseEntity.ok("check");
    }

    @PostMapping("/update")
    public ResponseEntity<String> listenProductChange(@RequestBody String payload) {
        logger.info(payload);
        System.out.println(payload);
        return ResponseEntity.ok(payload);
    }

}
