package test;

import dao.moivesMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Moive;

public class testMoiveFunction {
    private ApplicationContext applicationContext;
    @Before
    public void setup() throws Exception{
//        创建spring容器
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void addOne()throws Exception{
        moivesMapper moivesMapper = (dao.moivesMapper) applicationContext.getBean("moivesMapper");

        Moive moive = new Moive();
        moive.setId(3);moive.setTitle("亮剑");moive.setReleasetime("2015");
        moive.setStars("巩俐，张光北");moive.setUrl("http://localhost:8080/views/upload/2018/11/sliver20181112101913484.mp4");
        moive.setImgUrl("http://localhost:8080/views/upload/2018/11/1.jpg");
        moivesMapper.addMoive(moive);
    }
}
