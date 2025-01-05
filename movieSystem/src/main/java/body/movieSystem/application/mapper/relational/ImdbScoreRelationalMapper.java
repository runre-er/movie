package body.movieSystem.application.mapper.relational;

import body.movieSystem.api.dto.response.ImdbScoreResponseDTO;
import body.movieSystem.domain.entity.ImdbScore;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ImdbScoreRelationalMapper {

    ImdbScoreResponseDTO toDTO(ImdbScore imdbScore);

    List<ImdbScoreResponseDTO> toDTOList(List<ImdbScore> imdbScores);
}
