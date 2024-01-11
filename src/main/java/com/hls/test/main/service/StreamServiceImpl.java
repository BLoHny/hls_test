package com.hls.test.main.service;

import com.hls.test.main.dto.StreamDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class StreamServiceImpl implements StreamService {

    @Override
    public StreamDto validateStream(Map<String, String> map) {
        log.info("REQUEST Body = {}",map);

        String key = map.getOrDefault("key", "");
        String streamId = map.getOrDefault("name", "");

        if(Objects.equals(key,"testKey")){

            return null;
        }

        throw new RuntimeException("Invalid Stream Key ");
    }

    @Override
    public StreamDto publishDone(Map<String, String> map) {
        log.info("PUBLISH DONE  = {}",map);
        String streamId = map.getOrDefault("name", "");

        return null;
    }
}
