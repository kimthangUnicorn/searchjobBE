package dev.nkthang.jobsgobe.service.impl;

import dev.nkthang.jobsgobe.model.entity.LanguageEntity;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.repository.language.LanguageRepository;
import dev.nkthang.jobsgobe.service.iservice.LanguageIService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LanguageService implements LanguageIService {
    private final LanguageRepository languageRepository;
    @Override
    public Response<List<LanguageEntity>> getAll() {
        List<LanguageEntity> listLanguage = languageRepository.findAll();
        return Response.<List<LanguageEntity>>builder()
                .setMessage("Success")
                .setData(listLanguage)
                .build();
    }
}
