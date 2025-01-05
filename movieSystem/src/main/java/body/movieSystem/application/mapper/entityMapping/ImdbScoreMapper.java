package body.movieSystem.application.mapper.entityMapping;

import body.movieSystem.api.dto.general.ImdbScoreDTO;
import body.movieSystem.domain.entity.ImdbScore;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ImdbScoreMapper {
    ImdbScoreDTO toDTO(ImdbScore imdbScore);

    ImdbScore toEntity(ImdbScoreDTO imdbScoreDTO);

    List<ImdbScoreDTO> toDTOList(List<ImdbScore> imdbScores);

    List<ImdbScore> toEntityList(List<ImdbScoreDTO> imdbScoreDTOS);
}
