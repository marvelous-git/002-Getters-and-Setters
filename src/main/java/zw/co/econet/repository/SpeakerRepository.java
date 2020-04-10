package zw.co.econet.repository;

import zw.co.econet.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findSpeaker();
}
