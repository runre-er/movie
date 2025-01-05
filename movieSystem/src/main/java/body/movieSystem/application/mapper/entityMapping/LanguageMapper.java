package body.movieSystem.application.mapper.entityMapping;

import body.movieSystem.api.dto.general.LanguageDTO;
import body.movieSystem.domain.entity.Language;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface LanguageMapper {
    LanguageDTO toDTO(Language language);

    Language toEntity(LanguageDTO languageDTO);

    List<LanguageDTO> toDTOList(List<Language> languages);

    List<Language> toEntityList(List<LanguageDTO> languageDTOS);
}
