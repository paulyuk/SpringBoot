package hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@SpringBootApplication
@RestController
public class Application {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String home() {
        StringBuffer buffer = new StringBuffer("Hello Docker World - Java Version");
        buffer.append("<br>");
        buffer.append("=============================================");
        buffer.append("<br><br><br>");

        Map<String, String> env = System.getenv();
        String val = env.get("JAVA_VERSION");
        buffer.append(val);
        return buffer.toString();
    }

    @RequestMapping("/info/")
    public String info() {
       
        StringBuffer buffer = new StringBuffer("Hello Docker World - All Info");
        buffer.append("<br>");
        buffer.append("=============================================");
        buffer.append("<br><br><br>");

        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            buffer.append(String.format("%s=%s%n",
                    envName,
                    env.get(envName)));
            buffer.append("<br>");
        }

        logger.trace("this is a trace message.");
        logger.debug("this is a debug message.");
        logger.info("this is an info message.");
        logger.warn("this is a warn message.");
        logger.error("this is an error!");


        return buffer.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
