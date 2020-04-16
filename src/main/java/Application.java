import com.ywq.model.Speaker;
import com.ywq.service.SpeakerService;
import com.ywq.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
