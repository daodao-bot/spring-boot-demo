package run.ice.fun.demo.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import run.ice.fun.demo.DemoApplicationTest;
import run.ice.fun.demo.constant.DemoConstant;
import run.ice.fun.demo.model.Cat;
import run.ice.fun.demo.model.Dog;
import run.ice.lib.core.error.AppError;
import run.ice.lib.core.model.Request;
import run.ice.lib.core.model.Response;

@Slf4j
class DemoControllerTest extends DemoApplicationTest {

    @Test
    void demo() {
        String api = DemoConstant.DEMO;

        Cat param = new Cat();
        param.setName("hi");

        Request<Cat> request = new Request<>(param);

        Response<Dog> response = mockMvc(api, request, new TypeReference<>() {
        });

        Assertions.assertNotNull(response);
        Assertions.assertEquals(AppError.OK.code, response.getCode());

        Dog data = response.getData();

        Assertions.assertNotNull(data);
        Assertions.assertEquals("ih", data.getName());

    }

}