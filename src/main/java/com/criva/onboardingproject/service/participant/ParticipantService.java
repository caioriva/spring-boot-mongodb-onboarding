package com.criva.onboardingproject.service.participant;

import com.criva.onboardingproject.model.vo.room.ParticipantVO;

import java.util.List;

public interface ParticipantService {

    List<ParticipantVO> saveParticipants(List<ParticipantVO> participants);

    List<ParticipantVO> findAllByIds(List<String> ids);
}