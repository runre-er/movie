package body.movieSystem.mapper;

import body.movieSystem.dto.general.LanguageDTO;
import body.movieSystem.entity.Language;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface LanguageMapper {
    LanguageDTO toDTO(Language language);

    Language toEntity(LanguageDTO languageDTO);

    List<LanguageDTO> toDTOList(List<Language> languages);

    List<Language> toEntityList(List<LanguageDTO> languageDTOS);
}
