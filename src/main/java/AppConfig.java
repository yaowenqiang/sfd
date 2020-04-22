import com.ywq.model.Speaker;
import com.ywq.repository.HibernateSpeakerRepositoryImpl;
import com.ywq.repository.SpeakerRepository;
import com.ywq.service.SpeakerService;
import com.ywq.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class AppConfig {
   @Bean(name = "speakerService")
//   @Scope(value=BeanDefinition.SCOPE_SINGLETON)
   @Scope(value=BeanDefinition.SCOPE_PROTOTYPE)

   public SpeakerService getSpeakerService()
   {
//       SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository() );
//       service.setRepository(getSpeakerRepository());
      SpeakerServiceImpl service = new SpeakerServiceImpl();
       return service;
   }

   @Bean(name = "speakerRepository")
   public SpeakerRepository getSpeakerRepository()
   {
       return new HibernateSpeakerRepositoryImpl();
   }



}
