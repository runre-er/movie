package body.movieSystem.application.mapper;

import body.movieSystem.api.dto.general.JobDTO;
import body.movieSystem.domain.entity.Job;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface JobMapper {
    JobDTO toDTO(Job job);

    Job toEntity(JobDTO jobDTO);

    List<JobDTO> toDTOList(List<Job> jobs);

    List<Job> toEntityList(List<JobDTO> jobDTO);
}
