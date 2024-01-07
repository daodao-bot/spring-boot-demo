package run.ice.fun.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import run.ice.fun.demo.model.Cat;
import run.ice.fun.demo.model.Dog;

/**
 * @author DaoDao
 */
@Slf4j
@Service
public class DemoService {

    public Dog demo(Cat cat) {
        log.info("cat {}", cat);

        String name = new StringBuffer(cat.getName()).reverse().toString();

        Dog dog = new Dog();
        dog.setName(name);
        log.info("dog {}", dog);
        return dog;
    }

}
