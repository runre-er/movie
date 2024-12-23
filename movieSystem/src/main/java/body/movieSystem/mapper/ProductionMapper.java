package body.movieSystem.mapper;

import body.movieSystem.dto.PersonDTO;
import body.movieSystem.dto.ProductionDTO;
import body.movieSystem.entity.*;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {PersonMapper.class})
public interface ProductionMapper {

  @Mapping(target = "actors", expression = "java(toPersonDTOSet(production.getActors()))")
  @Mapping(target = "writers", expression = "java(toPersonDTOSet(production.getWriters()))")
  @Mapping(target = "directors", expression = "java(toPersonDTOSet(production.getDirectors()))")
  @Mapping(target = "stars", expression = "java(toPersonDTOSet(production.getStars()))")
  ProductionDTO toDTO(Production production);

  // Map all fields of the object to the target DTO itself.
  @Mapping(target = ".", source = "persons")
  PersonDTO toPersonDTO(Actor actor);

  @Mapping(target = ".", source = "persons")
  PersonDTO toPersonDTO(Writer writer);

  @Mapping(target = ".", source = "persons")
  PersonDTO toPersonDTO(Director director);

  @Mapping(target = ".", source = "persons")
  PersonDTO toPersonDTO(Star star);

  default <T> Set<PersonDTO> toPersonDTOSet(Set<T> entities) {
    if (entities == null) return Collections.emptySet();

    return entities.stream()
            .map(this::convertToPersonDTO)
            .filter(Objects::nonNull)
            .collect(Collectors.toSet());
  }

  default <T> PersonDTO convertToPersonDTO(T entity) {
    Map<Class<?>, Function<Object, PersonDTO>> converters =
            Map.of(
                    Actor.class, e -> toPersonDTO((Actor) e),
                    Writer.class, e -> toPersonDTO((Writer) e),
                    Director.class, e -> toPersonDTO((Director) e),
                    Star.class, e -> toPersonDTO((Star) e));

    return converters.getOrDefault(entity.getClass(), e -> null).apply(entity);
  }

  Production toEntity(ProductionDTO productionDTO);

  Set<ProductionDTO> toDTOSet(Set<Production> productions);

  Set<Production> toEntitySet(Set<ProductionDTO> productionDTOS);
}
