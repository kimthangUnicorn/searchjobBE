package dev.nkthang.jobsgobe.service.iservice;

import dev.nkthang.jobsgobe.model.entity.ProSkillEntity;
import dev.nkthang.jobsgobe.payload.response.Response;

import java.util.List;

public interface ProSkillIService {
    public Response<List<ProSkillEntity>> getAll();
}
