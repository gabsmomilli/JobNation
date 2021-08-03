package com.tecnocode.repository;

import com.tecnocode.model.Apply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface ApplyRepository extends JpaRepository<Apply, Integer>, JpaSpecificationExecutor<Apply> {
    List<Apply> findAllByVacancyId(final Integer id);
}
