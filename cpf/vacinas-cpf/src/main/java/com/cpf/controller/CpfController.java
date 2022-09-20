package com.cpf.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.cpf.service.CpfService;

@RestController
public class CpfController {

    @Autowired
    private CpfService cpfService;

    @RequestMapping("/")
    String index() {
        return "CPF - VALIDATOR";
    }
    
    
    @CrossOrigin
    @PostMapping(path = "/validar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> validate(@RequestBody String cpf) {
        JSONObject obj = new JSONObject(cpf);
        String cpfString = obj.getString("cpf");
        Boolean isValid = cpfService.validateCPF(cpfString);
        JSONObject responseJson = new JSONObject();
        responseJson.put("isValid", isValid);
        return new ResponseEntity<String>(
                responseJson.toString(),
                isValid ? HttpStatus.OK : HttpStatus.BAD_REQUEST);



    }
}
