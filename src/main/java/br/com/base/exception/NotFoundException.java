package br.com.base.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 2597809058482031932L;

    public NotFoundException() {
        super();
    }
}
