package com.bajaj.main.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BfhlResponse {

    @JsonProperty("is_success")
    private boolean isSuccess;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("roll_number")
    private String rollNumber;

    @JsonProperty("numbers")
    private List<String> numbers;

    @JsonProperty("alphabets")
    private List<String> alphabets;

    // ── Getters & Setters ──

    @JsonProperty("is_success")
    private boolean success;   // ← rename from isSuccess to success

    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    public List<String> getNumbers() { return numbers; }
    public void setNumbers(List<String> numbers) { this.numbers = numbers; }

    public List<String> getAlphabets() { return alphabets; }
    public void setAlphabets(List<String> alphabets) { this.alphabets = alphabets; }
}