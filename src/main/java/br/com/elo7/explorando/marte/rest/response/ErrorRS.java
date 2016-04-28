package br.com.elo7.explorando.marte.rest.response;

import java.io.Serializable;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class ErrorRS implements Serializable {

    private static final long serialVersionUID = 7940443079090164036L;

    private Integer code;
    private String message;

    public ErrorRS(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
