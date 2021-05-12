package models;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SuccessResponse {
    private int code;
    private String message;
}
