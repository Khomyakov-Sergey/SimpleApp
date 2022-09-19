package ru.clevertec;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("print")
public class PrintProperties {
    boolean text;
}
