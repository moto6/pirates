package net.pirates.Repository;

import net.pirates.Domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
