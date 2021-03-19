/**
 * ProjectName mhweb
 *
 * @ClassName SpringTest
 * @Descripttion TODO
 * @Author Hitys
 * @Date 2021/3/19
 * @version 1.0
 **/
package com.mh.mhweb;
import com.mh.mhweb.Students;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest{
    @Test
    public void test() {
        // 1.获取核心容器对象
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
        // 2.根据id获取Bean对象
        Student student = (Student)ac.getBean("student");

        System.out.println(student);
    }
}

