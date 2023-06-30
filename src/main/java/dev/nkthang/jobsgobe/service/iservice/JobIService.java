package dev.nkthang.jobsgobe.service.iservice;

import dev.nkthang.jobsgobe.payload.request.job.JobRequest;
import dev.nkthang.jobsgobe.payload.response.Response;
import dev.nkthang.jobsgobe.payload.response.job.JobApplyResponse;
import dev.nkthang.jobsgobe.payload.response.job.JobResponse;

import java.util.List;

public interface JobIService {
    public Response<List<JobResponse>> showAll();
    public Response<List<JobResponse>> showJobOpen();
    public Response<List<JobResponse>> showJobPause();
    public Response<List<JobResponse>> showJobExpired();
    public Response<List<JobResponse>> showJobDenied();
    public Response<List<JobResponse>> showPending();

    public Response<JobResponse> showOneJob(Long id);
    public Response<JobResponse> create(JobRequest request);
    public Response<JobResponse> update(Long id, JobRequest request);
    public  void delete(Long id);

    public Response<JobResponse> changeStatusApply(Long id);
    public Response<JobResponse> changeStatusPause(Long id);
    public Response<JobResponse> changeStatusExpired(Long id);
    public Response<JobResponse> changeStatusDenied(Long id);

    public Response<JobResponse> changeStatusPending(Long id);

    public Response<List<JobApplyResponse>> getAllJobApplyByCandidateId(Long id);
    public Response<List<JobResponse>> search(String keyword, String address);
    public Response<List<JobResponse>> showJobByCareerId(Long id);

    public Response<List<JobResponse>> showJobNoExp();
}
