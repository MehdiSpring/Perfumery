package com.mbo.perfumery.service;

import com.mbo.perfumery.dto.PerfumDto;
import com.mbo.perfumery.enums.Category;

import java.util.List;
import java.util.UUID;

public interface PerfumService {

    List<PerfumDto> getAllParfum();
    List<PerfumDto> getParfumByCategory(Category category);
    PerfumDto createPerfum(PerfumDto perfumDto);
    PerfumDto updatePerfum(UUID id, PerfumDto perfumDto);
    void deletePerfum(UUID id);


}
