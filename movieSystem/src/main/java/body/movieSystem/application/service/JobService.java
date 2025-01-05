package body.movieSystem.application.service;

import body.movieSystem.api.dto.general.JobDTO;
import body.movieSystem.application.mapper.entityMapping.JobMapper;
import body.movieSystem.domain.entity.Job;
import body.movieSystem.domain.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobRepository repository;
    private final JobMapper mapper;

    public JobDTO save(JobDTO jobDTO) {
        Job job = mapper.toEntity(jobDTO);
        return mapper.toDTO(repository.save(job));
    }
}
