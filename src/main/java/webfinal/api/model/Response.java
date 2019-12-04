package webfinal.api.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
public class Response {
    private Integer code;

    private String message;

    private Object data;
}
