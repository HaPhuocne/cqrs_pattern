package vn.unicloud.cqrstemplate.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import vn.unicloud.cqrstemplate.cqrs.BaseResponse;
import vn.unicloud.cqrstemplate.cqrs.ResponseBase;
import vn.unicloud.cqrstemplate.exception.BusinessException;

@RestControllerAdvice
public class BaseExceptionController {
    private static final Logger log = LoggerFactory.getLogger(BaseExceptionController.class);

    public BaseExceptionController() {
    }

    @ExceptionHandler({BusinessException.class})
    public ResponseEntity<?> handleBusinessException(BusinessException e) {
        log.error("", e);
        return ResponseEntity.ok(new ResponseBase<>(e.getCode(), e.getMessage()));
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<?> handleException(Exception e) {
        log.error("", e);
        return ResponseEntity.ok(new ResponseBase<>(1, e.getMessage()));
    }
}
