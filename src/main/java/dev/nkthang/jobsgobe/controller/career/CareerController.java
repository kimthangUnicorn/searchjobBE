package dev.nkthang.jobsgobe.controller.career;

import dev.nkthang.jobsgobe.model.entity.CareerEntity;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.service.impl.CareerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

@RequiredArgsConstructor
public class CareerController {
    private final CareerService careerService;

    @GetMapping("/public/careers")
    public Response<List<CareerEntity>> getAll() {
        return careerService.getAll();
    }
}
