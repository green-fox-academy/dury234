package com.gfa.backendapi.service;

import com.gfa.backendapi.model.Entries;
import com.gfa.backendapi.model.Log;

public interface LogsService {

    void save(Log log);

    Entries getEntries();
}
