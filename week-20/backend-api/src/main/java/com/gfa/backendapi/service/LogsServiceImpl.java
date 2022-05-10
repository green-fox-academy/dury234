package com.gfa.backendapi.service;

import com.gfa.backendapi.model.Entries;
import com.gfa.backendapi.model.Log;
import com.gfa.backendapi.repository.LogRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogsServiceImpl implements LogsService {

    private final LogRepo logRepo;

    @Override
    public void save(Log log) {
        logRepo.save(log);
    }

    @Override
    public Entries getEntries() {
        return new Entries(logRepo.findAll(Sort.by("createdAt")));
    }
}
