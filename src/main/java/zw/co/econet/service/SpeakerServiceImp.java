package zw.co.econet.service;

import zw.co.econet.model.Speaker;
import zw.co.econet.repository.SpeakerRepository;
import zw.co.econet.repository.SpeakerRepositoryImp;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {

    private SpeakerRepository repo; // = new SpeakerRepositoryImp();

    public void setRepo(SpeakerRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Speaker> findAll(){
        return repo.findSpeaker() ;
    }
}
