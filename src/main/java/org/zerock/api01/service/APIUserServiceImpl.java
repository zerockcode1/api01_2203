package org.zerock.api01.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.api01.domain.APIUser;
import org.zerock.api01.dto.APIUserDTO;
import org.zerock.api01.repository.APIUserRepository;

import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class APIUserServiceImpl implements APIUserService {


    private final ModelMapper modelMapper;
    private final APIUserRepository apiUserRepository;

    @Override
    public Optional<APIUserDTO> checkUser(String mid, String mpw) {

        Optional<APIUser> result = apiUserRepository.findAPIUserByMidAndMpw(mid,mpw);

        if(result.isEmpty()){
            return Optional.empty();
        }

        return Optional.of(modelMapper.map(result.get(), APIUserDTO.class));

    }
}
