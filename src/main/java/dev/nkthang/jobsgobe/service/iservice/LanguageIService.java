package dev.nkthang.jobsgobe.service.iservice;

import dev.nkthang.jobsgobe.model.entity.LanguageEntity;
import dev.nkthang.jobsgobe.payload.response.Response;

import java.util.List;

public interface LanguageIService {
    public Response<List<LanguageEntity>> getAll();
}
