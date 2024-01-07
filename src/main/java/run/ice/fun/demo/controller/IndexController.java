package run.ice.fun.demo.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;
import run.ice.fun.demo.api.IndexApi;
import run.ice.fun.demo.config.AppConfig;

/**
 * @author DaoDao
 */
@RestController
public class IndexController implements IndexApi {

    @Resource
    private AppConfig appConfig;

    @Override
    public String index() {
        return appConfig.getApplication();
    }

}
