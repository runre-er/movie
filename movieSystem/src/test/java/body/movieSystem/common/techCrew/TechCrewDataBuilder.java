// common/TestDataBuilder.java
package body.movieSystem.common.techCrew;

import body.movieSystem.api.dto.response.TechCrewResponseDTO;

import static body.movieSystem.common.job.JobDataBuilder.createSampleJobDTO;
import static body.movieSystem.common.person.PersonDataBuilder.createSamplePersonResponseDTO;

public class TechCrewDataBuilder {

    public static TechCrewResponseDTO createSampleTechCrewResponseDTO() {
        return TechCrewResponseDTO.builder()
                .id(1L)
                .person(createSamplePersonResponseDTO())
                .job(createSampleJobDTO())
                .build();
    }
}