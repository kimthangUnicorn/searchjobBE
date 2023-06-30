package dev.nkthang.jobsgobe.service.impl;

import dev.nkthang.jobsgobe.model.entity.SoftSkillEntity;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.repository.softSkill.SoftSkillRepository;
import dev.nkthang.jobsgobe.service.iservice.SoftSkillIService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SoftSkillService implements SoftSkillIService {
    private final SoftSkillRepository softSkillRepository;
    @Override
    public Response<List<SoftSkillEntity>> getAll() {
        List<SoftSkillEntity> listSoftSkill = softSkillRepository.findAll();
        return Response.<List<SoftSkillEntity>>builder()
                .setMessage("Success")
                .setData(listSoftSkill)
                .build();
    }
}
