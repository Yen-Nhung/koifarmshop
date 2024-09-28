package com.example.koifarm.model;

import lombok.Data;

@Data
public class UserResponse {
     long id;
     String userCode;
     String email;
     String phone;
     String token;
}
