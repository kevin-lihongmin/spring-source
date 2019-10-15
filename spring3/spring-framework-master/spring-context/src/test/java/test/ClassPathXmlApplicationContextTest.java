package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author lihongmin
 * @date 2018/11/12 20:08
 * @see org.springframework.context.support.ClassPathXmlApplicationContext
 */
public class ClassPathXmlApplicationContextTest {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("").getBean("user");

		new XmlBeanFactory(new ClassPathResource("spring-config.xml")).getBean("user");


	}

}
