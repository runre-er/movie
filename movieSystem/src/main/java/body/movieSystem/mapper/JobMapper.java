package body.movieSystem.mapper;

import body.movieSystem.dto.cast.JobDTO;
import body.movieSystem.entity.Job;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface JobMapper {
  JobDTO toDTO(Job job);

  Job toEntity(JobDTO jobDTO);

  List<JobDTO> toDTOList(List<Job> jobs);

  List<Job> toEntityList(List<JobDTO> jobDTOS);
}
