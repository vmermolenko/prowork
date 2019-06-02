package com.htp.repository;

import com.htp.domain.Worker;

import java.util.List;

public interface WorkerDao extends GenericDao<Worker, Long> {
    List<Worker> getWorkerById(Long userId);
}
