package dev.nkthang.jobsgobe.service.impl;

import dev.nkthang.jobsgobe.model.entity.CareerEntity;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.repository.career.CareerRepository;
import dev.nkthang.jobsgobe.service.iservice.CareerIService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CareerService implements CareerIService {
    private final CareerRepository careerRepository;

    @Override
    public Response<List<CareerEntity>> getAll() {
        List<CareerEntity> listCareer = careerRepository.findAll();
        return Response.<List<CareerEntity>>builder()
                .setMessage("Success")
                .setData(listCareer)
                .build();
    }

}
