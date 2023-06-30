package dev.nkthang.jobsgobe.repository.language;

import dev.nkthang.jobsgobe.model.entity.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageEntity, Long> {
}
