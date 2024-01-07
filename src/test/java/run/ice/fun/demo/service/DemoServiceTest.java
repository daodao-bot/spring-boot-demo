package run.ice.fun.demo.service;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import run.ice.fun.demo.DemoApplicationTest;
import run.ice.fun.demo.model.Cat;
import run.ice.fun.demo.model.Dog;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest extends DemoApplicationTest {

    @Resource
    private DemoService demoService;

    @Test
    void demo() {
        Cat cat = new Cat();
        cat.setName("hi");
        Dog dog = demoService.demo(cat);
        assertEquals("ih", dog.getName());
    }

}