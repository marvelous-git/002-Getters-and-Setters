package zw.co.econet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zw.co.econet.model.Speaker;
import zw.co.econet.repository.SpeakerRepository;
import zw.co.econet.repository.SpeakerRepositoryImp;
import zw.co.econet.service.SpeakerService;
import zw.co.econet.service.SpeakerServiceImp;

@Configuration
public class AppConfig {

    @Bean(name="service")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImp service = new SpeakerServiceImp();
        service.setRepo(getSpeakerRepository());
        return service;
    }

    @Bean(name = "repo")
    public SpeakerRepository getSpeakerRepository(){
      //  SpeakerRepositoryImp repo = new SpeakerRepositoryImp();
      //  repo.setSpeaker(getSpeaker());
        SpeakerRepositoryImp repo = new SpeakerRepositoryImp(getSpeaker());
        return repo;
    }
    @Bean
    public Speaker getSpeaker(){
        return new Speaker();
    }
}
