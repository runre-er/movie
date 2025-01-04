package body.movieSystem.application.mapper;

import body.movieSystem.api.dto.general.ImdbScoreDTO;
import body.movieSystem.api.dto.response.ImdbScoreResponseDTO;
import body.movieSystem.domain.entity.ImdbScore;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ImdbScoreMapper {
    ImdbScoreDTO toDTO(ImdbScore imdbScore);

    ImdbScoreResponseDTO toResponseDTO(ImdbScore imdbScore);

    ImdbScore toEntity(ImdbScoreDTO imdbScoreDTO);

    List<ImdbScoreDTO> toDTOList(List<ImdbScore> imdbScores);

    List<ImdbScoreResponseDTO> toResponseDTOList(List<ImdbScore> imdbScores);

    List<ImdbScore> toEntityList(List<ImdbScoreDTO> imdbScoreDTOS);
}
