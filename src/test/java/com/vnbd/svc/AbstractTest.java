package com.vnbd.svc;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Dien Nguyen (DEE)
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { ApplicationConfigTest.class })
public abstract class AbstractTest {

    protected abstract void before();

    protected abstract void after();

    @Before
    public void init() {
        before();
    }

    @After
    public void stop() {
        after();
    }

}
