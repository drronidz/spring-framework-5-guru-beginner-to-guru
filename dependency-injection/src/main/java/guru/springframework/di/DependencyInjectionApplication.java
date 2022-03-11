package guru.springframework.di;

import com.diogonunes.jcolor.Attribute;
import guru.springframework.di.controllers.ConstructorInjectedController;
import guru.springframework.di.controllers.GetterInjectedController;
import guru.springframework.di.controllers.MyController;
import guru.springframework.di.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BOLD;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        Attribute backgroundColorOne = Attribute.BACK_COLOR(48, 188, 237);
        Attribute backgroundColorTwo = Attribute.BACK_COLOR(48, 48, 54);
        Attribute backgroundColorThree = Attribute.BACK_COLOR(202, 254, 72);

        Attribute textColorDark = Attribute.TEXT_COLOR(0, 0, 0);
        Attribute textColorLight = Attribute.TEXT_COLOR(231, 231, 231);
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");
        myController.helloWorld();

        System.out.println(colorize(context.getBean(PropertyInjectedController.class).sayHello(), BOLD(), textColorDark, backgroundColorOne));
        System.out.println(colorize(context.getBean(GetterInjectedController.class).sayHello(), BOLD(), textColorLight, backgroundColorTwo));
        System.out.println(colorize(context.getBean(ConstructorInjectedController.class).sayHello(), BOLD(), textColorDark, backgroundColorThree));
    }

}
