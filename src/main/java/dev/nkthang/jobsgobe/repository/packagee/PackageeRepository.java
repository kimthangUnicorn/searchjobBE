package dev.nkthang.jobsgobe.repository.packagee;

import dev.nkthang.jobsgobe.model.entity.PackageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageeRepository extends JpaRepository<PackageEntity,Long> {
}
