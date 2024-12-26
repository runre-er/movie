package body.movieSystem.mapper;

import body.movieSystem.dto.ImdbScoreDTO;
import body.movieSystem.entity.ImdbScore;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ImdbScoreMapper {
  ImdbScoreDTO toDTO(ImdbScore imdbScore);

  ImdbScore toEntity(ImdbScoreDTO imdbScoreDTO);

  List<ImdbScoreDTO> toDTOList(List<ImdbScore> imdbScores);

  List<ImdbScore> toEntityList(List<ImdbScoreDTO> imdbScoreDTOS);
}
