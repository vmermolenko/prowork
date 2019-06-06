package com.htp.prowork.repository;

import com.htp.prowork.domain.Worker;

import java.util.List;

public interface WorkerDao extends GenericDao<Worker, Long> {
    List<Worker> getWorkerById(Long userId);
}
