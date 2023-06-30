package dev.nkthang.jobsgobe.controller.proSkill;

import dev.nkthang.jobsgobe.model.entity.ProSkillEntity;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.service.impl.ProSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

@RequiredArgsConstructor
public class ProSkillController {
    private final ProSkillService proSkillService;

    @GetMapping("/public/proSkills")
    public Response<List<ProSkillEntity>> getAll() {
        return proSkillService.getAll();
    }
}
