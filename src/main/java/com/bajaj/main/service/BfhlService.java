package com.bajaj.main.service;



import com.bajaj.main.entities.BfhlRequest;
import com.bajaj.main.entities.BfhlResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlService {

    
    private static final String FULL_NAME   = "eklavya_jangid";    
    private static final String DOB         = "30012005";   
    private static final String EMAIL       = "eklavyajangid305.com";
    private static final String ROLL_NUMBER = "ABCD123";

    public BfhlResponse processData(BfhlRequest request) {

        List<String> numbers   = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();

        List<String> inputData = request.getData();

        if (inputData != null) {
            for (String item : inputData) {
                if (isNumber(item)) {
                    numbers.add(item);
                } else if (isAlphabet(item)) {
                    alphabets.add(item);
                }
                // special chars / alphanumeric mixed → ignored
            }
        }

        BfhlResponse response = new BfhlResponse();
        response.setSuccess(true);
        response.setUserId(FULL_NAME + "_" + DOB);
        response.setEmail(EMAIL);
        response.setRollNumber(ROLL_NUMBER);
        response.setNumbers(numbers);
        response.setAlphabets(alphabets);

        return response;
    }

    private boolean isNumber(String s) {
        if (s == null || s.isEmpty()) return false;
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isAlphabet(String s) {
        if (s == null || s.isEmpty()) return false;
        return s.matches("[a-zA-Z]+");
    }
}
