package net.study.springfifteens;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: John
 * Date: 7/25/13
 * Time: 7:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Console console = (Console) context.getBean("console");
        console.playGame();

    }
}
