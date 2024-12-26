package body.movieSystem.mapper;

import body.movieSystem.dto.GenreDTO;
import body.movieSystem.entity.Genre;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface GenreMapper {
  GenreDTO toDTO(Genre genre);

  Genre toEntity(GenreDTO genreDTO);

  List<GenreDTO> toDTOList(List<Genre> genres);

  List<Genre> toEntityList(List<GenreDTO> genreDTOS);
}
