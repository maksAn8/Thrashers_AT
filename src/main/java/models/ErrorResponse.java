package models;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ErrorResponse {
    private int code;
    private String message;
}
