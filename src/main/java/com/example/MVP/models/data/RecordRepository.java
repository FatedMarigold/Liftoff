package com.example.MVP.models.data;

import com.example.MVP.models.Record;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends CrudRepository<Record, Integer> {
}
