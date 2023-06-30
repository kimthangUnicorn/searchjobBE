package dev.nkthang.jobsgobe.controller.softSkill;

import dev.nkthang.jobsgobe.model.entity.SoftSkillEntity;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.service.impl.SoftSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

@RequiredArgsConstructor
public class SoftSkillController {
    private final SoftSkillService softSkillService;

    @GetMapping("/public/softSkills")
    public Response<List<SoftSkillEntity>> getAll() {
        return softSkillService.getAll();
    }
}
