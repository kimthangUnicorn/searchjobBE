package dev.nkthang.jobsgobe.service.iservice;

import dev.nkthang.jobsgobe.model.entity.SoftSkillEntity;
import dev.nkthang.jobsgobe.payload.response.Response;

import java.util.List;

public interface SoftSkillIService {
    public Response<List<SoftSkillEntity>> getAll();
}
