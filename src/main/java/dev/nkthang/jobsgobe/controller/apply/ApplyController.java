package dev.nkthang.jobsgobe.controller.apply;

import dev.nkthang.jobsgobe.model.entity.ApplyEntity;
import dev.nkthang.jobsgobe.payload.request.apply.BaseApply;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.payload.response.resume.ResumeApplyResponse;
import dev.nkthang.jobsgobe.service.impl.apply.ApplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApplyController {
    private final ApplyService applyService;

    @PostMapping("/apply")
    @Secured("CANDIDATE")
    public Response<ApplyEntity> apply(@RequestBody BaseApply request) {
        Response<ApplyEntity> applyResponse = applyService.apply(request);
        return applyResponse;
    }

    @GetMapping("/apply/check/jobs/{jobId}/{candidateId}")
    @Secured("CANDIDATE")
    public Response<ApplyEntity> checkApply(@PathVariable Long jobId, @PathVariable Long candidateId) {
        return applyService.checkApply(jobId, candidateId);
    }

    @GetMapping("/apply/recruiter/{recruiterId}/resumes/apply")
    @Secured("RECRUITER")
    public Response<List<ResumeApplyResponse>> getAllResumeApply(@PathVariable Long recruiterId) {
        return applyService.getAllResumeApply(recruiterId);
    }

    @GetMapping("/apply/recruiter/{recruiterId}/resumes/approve")
    @Secured("RECRUITER")
    public Response<List<ResumeApplyResponse>> getAllResumeApprove(@PathVariable Long recruiterId) {
        return applyService.getAllResumeApprove(recruiterId);
    }

    @GetMapping("/apply/recruiter/{recruiterId}/resumes/consider")
    @Secured("RECRUITER")
    public Response<List<ResumeApplyResponse>> getAllResumeConsider(@PathVariable Long recruiterId) {
        return applyService.getAllResumeConsider(recruiterId);
    }

    @GetMapping("/apply/recruiter/{recruiterId}/resumes/denied")
    @Secured("RECRUITER")
    public Response<List<ResumeApplyResponse>> getAllResumeDenied(@PathVariable Long recruiterId) {
        return applyService.getAllResumeDenied(recruiterId);
    }

    @PutMapping("/apply/approve/resume/{id}")
    @Secured("RECRUITER")
    public Response<ApplyEntity> approve(@PathVariable Long id) {
        return applyService.Approve(id);
    }

    @PutMapping("/apply/consider/resume/{id}")
    @Secured("RECRUITER")
    public Response<ApplyEntity> consider(@PathVariable Long id) {
        return applyService.Consider(id);
    }

    @PutMapping("/apply/denied/resume/{id}")
    @Secured("RECRUITER")
    public Response<ApplyEntity> denied(@PathVariable Long id) {
        return applyService.Denied(id);
    }

    @DeleteMapping("/apply/{id}")
    @Secured("CANDIDATE")
    public Response<ApplyEntity> deleteById(@PathVariable Long id){
        return applyService.deleteById(id);
    }
}
