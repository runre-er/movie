package body.movieSystem.service;

import body.movieSystem.dto.general.JobDTO;
import body.movieSystem.entity.Job;
import body.movieSystem.mapper.JobMapper;
import body.movieSystem.repository.JobRepository;
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
