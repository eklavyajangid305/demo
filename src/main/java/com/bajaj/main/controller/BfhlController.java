package com.bajaj.main.controller;


import com.bajaj.main.entities.BfhlRequest;
import com.bajaj.main.entities.BfhlResponse;
import com.bajaj.main.service.BfhlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
@CrossOrigin(origins = "*")
public class BfhlController {

    @Autowired
    private BfhlService bfhlService;

    @PostMapping
    public ResponseEntity<BfhlResponse> handlePost(@RequestBody BfhlRequest request) {
        try {
            BfhlResponse response = bfhlService.processData(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            BfhlResponse errorResponse = new BfhlResponse();
            errorResponse.setSuccess(false);
            return ResponseEntity.status(500).body(errorResponse);
        }
    }
}