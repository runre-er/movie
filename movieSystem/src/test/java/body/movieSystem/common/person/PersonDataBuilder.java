// common/TestDataBuilder.java
package body.movieSystem.common.person;

import body.movieSystem.api.dto.response.PersonResponseDTO;

import java.time.LocalDate;

public class PersonDataBuilder {

    public static PersonResponseDTO createSamplePersonResponseDTO() {
        return PersonResponseDTO.builder()
                .id(1L)
                .name("John")
                .surname("Doe")
                .birthDate(LocalDate.of(1980, 1, 1))
                .build();
    }
}