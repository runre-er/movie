package body.movieSystem.mapper;

import body.movieSystem.dto.LanguageDTO;
import body.movieSystem.entity.Language;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface LanguageMapper {
    LanguageDTO toDTO(Language language);
    Language toEntity(LanguageDTO languageDTO);
    List<LanguageDTO> toDTOList(List<Language> languages);
    List<Language> toEntityList(List<LanguageDTO> languageDTOS);
}
