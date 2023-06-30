package dev.nkthang.jobsgobe.service.iservice;

import dev.nkthang.jobsgobe.model.entity.UserEntity;
import dev.nkthang.jobsgobe.payload.response.Response;

import java.util.List;

public interface UserIService {
    public Response<UserEntity> getOneUser(Long id);
    public Response<List<UserEntity>> getAllRecruiter();
}
