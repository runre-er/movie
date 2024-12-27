package body.movieSystem.mapper;

import body.movieSystem.dto.ImdbScoreDTO;
import body.movieSystem.entity.ImdbScore;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ImdbScoreMapper {
    ImdbScoreDTO toDTO(ImdbScore imdbScore);

    ImdbScore toEntity(ImdbScoreDTO imdbScoreDTO);

    List<ImdbScoreDTO> toDTOList(List<ImdbScore> imdbScores);

    List<ImdbScore> toEntityList(List<ImdbScoreDTO> imdbScoreDTOS);
}
