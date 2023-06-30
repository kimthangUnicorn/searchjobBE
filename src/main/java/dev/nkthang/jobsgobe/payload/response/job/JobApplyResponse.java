package dev.nkthang.jobsgobe.payload.response.job;

import dev.nkthang.jobsgobe.model.entity.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class JobApplyResponse {
    private Long id;
    private String title;
    private String image;
    private String description;
    private String city;
    private Double salaryFrom;
    private Double salaryTo;
    private boolean statusSalary;
    private String natureOfWork;
    private Date expiredAt;
    private Long applyId;
    private Integer statusApply;
}
