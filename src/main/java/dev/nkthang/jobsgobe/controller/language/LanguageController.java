package dev.nkthang.jobsgobe.controller.language;

import dev.nkthang.jobsgobe.model.entity.LanguageEntity;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.service.impl.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

@RequiredArgsConstructor
public class LanguageController {
    private final LanguageService languageService;

    @GetMapping("/public/languages")
    public Response<List<LanguageEntity>> getAll() {
        return languageService.getAll();
    }
}
