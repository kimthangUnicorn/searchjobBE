package dev.nkthang.jobsgobe.repository.softSkill;

import dev.nkthang.jobsgobe.model.entity.SoftSkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepository extends JpaRepository<SoftSkillEntity, Long> {
}
