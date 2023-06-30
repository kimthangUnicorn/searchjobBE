package dev.nkthang.jobsgobe.repository.proSkill;

import dev.nkthang.jobsgobe.model.entity.ProSkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProSkillRepository extends JpaRepository<ProSkillEntity, Long> {
}
