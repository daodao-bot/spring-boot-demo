package run.ice.fun.demo.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import run.ice.fun.demo.constant.DemoConstant;
import run.ice.fun.demo.model.Cat;
import run.ice.fun.demo.model.Dog;
import run.ice.lib.core.constant.AppConstant;
import run.ice.lib.core.model.Request;
import run.ice.lib.core.model.Response;

/**
 * @author DaoDao
 */
@Tag(name = "DemoApi", description = "Demo")
@HttpExchange(url = AppConstant.API)
public interface DemoApi {

    @Operation(summary = "demo", description = "@DaoDao cat => dog")
    @PostExchange(url = DemoConstant.DEMO)
    Response<Dog> demo(@RequestBody @Valid Request<Cat> request);

}
