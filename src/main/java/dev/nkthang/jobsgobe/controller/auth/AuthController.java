package dev.nkthang.jobsgobe.controller.auth;

import dev.nkthang.jobsgobe.converter.AuthConverter;
import dev.nkthang.jobsgobe.payload.request.auth.AuthRequest;
import dev.nkthang.jobsgobe.payload.request.auth.RegisterRequest;
import dev.nkthang.jobsgobe.payload.response.BaseResponse;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.payload.response.auth.AuthResponse;
import dev.nkthang.jobsgobe.service.impl.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authenticationService;
    private final AuthConverter authConverter;

    @PostMapping("/register")
    public Response<BaseResponse> register(@RequestBody RegisterRequest request) {
        Response<BaseResponse> response = authenticationService.register(request);
        return response;
    }

    @PostMapping("/login")
    public Response<AuthResponse> authenticateUser(@RequestBody AuthRequest request) {
        Response<AuthResponse> response = authenticationService.authenticate(request);
        return response;
    }
}
