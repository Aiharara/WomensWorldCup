package au.edu.sydney.womensworldcup.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {
    ResponseCode code;
    String message;
}

enum ResponseCode {
    OK,
    INTERNAL_SERVER_ERROR;

    int getCode() {
        switch (this) {
            case OK -> {
                return 200;
            }
            case INTERNAL_SERVER_ERROR -> {
                return 500;
            }
        }
        return 500;
    }

    @Override
    public String toString() {
        return String.valueOf(getCode());
    }
}
