package run.ice.fun.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import run.ice.fun.demo.constant.AppConstant;

/**
 * @author DaoDao
 */
@SpringBootApplication(scanBasePackages = {AppConstant.BASE_PACKAGE})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
