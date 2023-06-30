package dev.nkthang.jobsgobe.payload.request.resume;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResumeSoftSkillRequest {
    private Long id;
    private Integer prowess;
    private Long softSkillId;
    private String softSkillName;
}
