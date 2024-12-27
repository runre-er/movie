package body.movieSystem.mapper;

import body.movieSystem.dto.CountryDTO;
import body.movieSystem.entity.Country;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CountryMapper {
    CountryDTO toDTO(Country country);

    Country toEntity(CountryDTO countryDTO);

    List<CountryDTO> toDTOList(List<Country> countries);

    List<Country> toEntityList(List<CountryDTO> countryDTOS);
}
