package com.countries.management.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.countries.management.model.InternationalDatasets;
import com.countries.management.model.InternationalDatasetsId;

@Repository
public interface InternationalDatasetsDAO extends JpaRepository<InternationalDatasets, InternationalDatasetsId> {

    List<InternationalDatasets> findByIdIsoCode(int isoCode);
    
    InternationalDatasets findByIdIsoCodeAndIdYear(int isoCode, int year);

}

