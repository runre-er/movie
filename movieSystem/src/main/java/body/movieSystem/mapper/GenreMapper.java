package body.movieSystem.mapper;

import body.movieSystem.dto.general.GenreDTO;
import body.movieSystem.entity.Genre;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface GenreMapper {
    GenreDTO toDTO(Genre genre);

    Genre toEntity(GenreDTO genreDTO);

    List<GenreDTO> toDTOList(List<Genre> genres);

    List<Genre> toEntityList(List<GenreDTO> genreDTOS);
}
