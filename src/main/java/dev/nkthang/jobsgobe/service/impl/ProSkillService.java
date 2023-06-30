package dev.nkthang.jobsgobe.service.impl;

import dev.nkthang.jobsgobe.model.entity.ProSkillEntity;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.repository.proSkill.ProSkillRepository;
import dev.nkthang.jobsgobe.service.iservice.ProSkillIService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProSkillService implements ProSkillIService {
    private final ProSkillRepository proSkillRepository;
    @Override
    public Response<List<ProSkillEntity>> getAll() {
        List<ProSkillEntity> listProSkill = proSkillRepository.findAll();
        return Response.<List<ProSkillEntity>>builder()
                .setMessage("Success")
                .setData(listProSkill)
                .build();
    }
}
