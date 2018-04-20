package aspire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

    @Value("${aspire.prefix:Hello}")
    private String prefix;
    @Value("${aspire.env}")
    private String env;

    @RequestMapping("/message")
    public String getMessage() {
        return prefix + " " + env;
    }
}
