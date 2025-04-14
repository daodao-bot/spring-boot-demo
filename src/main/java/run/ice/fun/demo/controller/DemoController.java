package run.ice.fun.demo.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;
import run.ice.fun.demo.api.DemoApi;
import run.ice.fun.demo.model.Cat;
import run.ice.fun.demo.model.Dog;
import run.ice.fun.demo.model.Request;
import run.ice.fun.demo.model.Response;
import run.ice.fun.demo.service.DemoService;

/**
 * @author DaoDao
 */
@RestController
public class DemoController implements DemoApi {

    @Resource
    private DemoService demoService;

    @Override
    public Response<Dog> demo(Request<Cat> request) {
        Dog data = demoService.demo(request.getParam());
        return new Response<>(data);
    }

}
