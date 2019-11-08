import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Word word=(Word) context.getBean("Word");
        word.print();
        Word words=(Word) context.getBean("Words");
        words.print();
    }
}
