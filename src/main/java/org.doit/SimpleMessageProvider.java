package org.doit;


import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello wold";
    }
}
