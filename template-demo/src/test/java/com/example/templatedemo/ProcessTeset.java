package com.example.templatedemo;

import com.example.templatedemo.core.Process;
import com.example.templatedemo.enums.ProcessEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProcessTeset {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test() {
        for (ProcessEnum value : ProcessEnum.values()) {
            Process process = (Process) applicationContext.getBean(value.getType());
            process.process();
        }
    }
}
