package com.example.MVP.models.data;

import com.example.MVP.models.AttachedGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachedGroupRepository extends CrudRepository<AttachedGroup, String> {
}
