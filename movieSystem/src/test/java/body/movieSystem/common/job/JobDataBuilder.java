// common/TestDataBuilder.java
package body.movieSystem.common.job;

import body.movieSystem.api.dto.general.JobDTO;

public class JobDataBuilder {

    public static JobDTO createSampleJobDTO() {
        return JobDTO.builder()
                .id(1L)
                .name("Camera Operator")
                .build();
    }
}