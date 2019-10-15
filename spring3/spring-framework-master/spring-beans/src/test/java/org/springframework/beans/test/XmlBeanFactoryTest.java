package org.springframework.beans.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.applet.AppletContext;

/**
 * @author daifeng
 * @Title: XmlBeanFactoryTest
 * @ProjectName spring-framework-master
 * @Description: TODO
 * @date 2018/11/913:36
 */
public class XmlBeanFactoryTest {

	public static void main(String[] args) {

		final XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		final Object abc = xmlBeanFactory.getBean("abc");
		abc.getClass();



	}
}
