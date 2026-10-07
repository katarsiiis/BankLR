package com.yanisheuski;

import com.yanisheuski.dto.RegisterRequestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController("/api/auth")
public class AuthController {

    @PostMapping("/reg")
    public void registration(RegisterRequestDTO registerRequestDTO) {

    }
}
