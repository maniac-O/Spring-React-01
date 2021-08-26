package com.velog.maniac.NaverApi.controller.tmp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    int id;
    String username;
    String password;
    String email;
}
