package dev.nkthang.jobsgobe.service.iservice;

import dev.nkthang.jobsgobe.payload.request.auth.AuthRequest;
import dev.nkthang.jobsgobe.payload.request.auth.RegisterRequest;
import dev.nkthang.jobsgobe.payload.response.BaseResponse;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.payload.response.auth.AuthResponse;

public interface AuthIService {
    public Response<AuthResponse> authenticate(AuthRequest request);
    public Response<BaseResponse> register(RegisterRequest request);
}
