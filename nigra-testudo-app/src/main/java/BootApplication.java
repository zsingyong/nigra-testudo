import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "me.jet.ocr")
@MapperScan(value = "me.jet.ocr")
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class);
    }
}
