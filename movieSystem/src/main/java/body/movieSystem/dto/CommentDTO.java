package body.movieSystem.dto;

import body.movieSystem.dto.validation.annotation.NonNullId;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    @NonNullId
    private Long id;
    private String message;
    @NonNullId
    private Long userId;
    @NonNullId
    private Long languageId;
    @NonNullId
    private Long productionId;
}
