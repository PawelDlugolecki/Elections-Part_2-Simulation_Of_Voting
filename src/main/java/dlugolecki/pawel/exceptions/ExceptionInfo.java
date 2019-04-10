package dlugolecki.pawel.exceptions;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ExceptionInfo {
    private String message;
    private String className;
    private String methodName;
    private LocalDateTime dateTime;

    public ExceptionInfo(String message, String className, String methodName) {
        this.message = message;
        this.className = className;
        this.methodName = methodName;
        dateTime = LocalDateTime.now();
    }


}
