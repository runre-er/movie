package body.movieSystem.mapper;

import body.movieSystem.dto.CountryDTO;
import body.movieSystem.entity.Country;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface CountryMapper {
  CountryDTO toDTO(Country country);

  Country toEntity(CountryDTO countryDTO);

  List<CountryDTO> toDTOList(List<Country> countries);

  List<Country> toEntityList(List<CountryDTO> countryDTOS);
}
