package zw.co.econet.service;

import zw.co.econet.model.Speaker;
import zw.co.econet.repository.SpeakerRepository;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();


}
