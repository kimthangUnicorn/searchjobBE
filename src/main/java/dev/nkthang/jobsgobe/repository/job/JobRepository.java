package dev.nkthang.jobsgobe.repository.job;

import dev.nkthang.jobsgobe.model.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, Long> {
    @Query(value = "select j from JobEntity j where j.specificAddress ilike %:address% or j.ward ilike %:address% or  j.district ilike %:address% or j.city ilike %:address%")
    public List<JobEntity> searchByAddress(String address);

    @Query(value = "select j from JobEntity j where j.title ilike %:keyword% or j.recruiter.name ilike %:keyword%")
    public List<JobEntity> searchByKeyword(String keyword);

    @Query(value = "select j from JobEntity j where j.title ilike %:keyword% or j.recruiter.name ilike %:keyword% or j.specificAddress ilike %:address% or j.ward ilike %:address% or  j.district ilike %:address% or j.city ilike %:address%")
    public List<JobEntity> searchByKeywordAndAddress(String keyword, String address);

    @Query(value = "select j from JobEntity j join j.listCareer c where c.id = :id")
    public List<JobEntity> findByCareerId(Long id);

    @Query(value = "select j from JobEntity j where j.statusExp = true")
    public List<JobEntity> findJobNoExp();
}
