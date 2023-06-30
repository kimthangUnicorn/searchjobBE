package dev.nkthang.jobsgobe.service.iservice;

import dev.nkthang.jobsgobe.model.entity.CareerEntity;
import dev.nkthang.jobsgobe.payload.response.Response;

import java.util.List;

public interface CareerIService {
    public Response<List<CareerEntity>> getAll();

}
