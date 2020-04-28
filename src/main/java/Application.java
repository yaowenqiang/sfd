import com.ywq.model.Speaker;
import com.ywq.service.SpeakerService;
import com.ywq.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service);
        SpeakerService service2 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
