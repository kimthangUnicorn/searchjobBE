package dev.nkthang.jobsgobe.service.iservice;

import dev.nkthang.jobsgobe.payload.request.resume.ResumeRequest;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.payload.response.resume.ResumeResponse;

import java.util.List;

public interface ResumeIService {
    public Response<List<ResumeResponse>> showAll();
    public Response<List<ResumeResponse>> showAllByCandidateId(Long id);
    public Response<ResumeResponse> showOneResume(Long id);
    public Response<ResumeResponse> create(ResumeRequest request);
    public Response<ResumeResponse> delete(Long id);
    public  Response<ResumeResponse> update(Long id, ResumeRequest request);

    public void deleteResumeProSkillById(Long id);
    public void deleteResumeWorkExpById(Long id);
    public void deleteResumeEducationById(Long id);
    public void deleteResumeLanguageById(Long id);
    public void deleteResumeSoftSkillById(Long id);
    public void deleteResumeHobbyById(Long id);
    public Response<List<ResumeResponse>> searchCandidate(String position, String specialized, String language, String degree);
}
