package com.hls.test.main.service;

import com.hls.test.main.dto.StreamDto;

import java.util.Map;

public interface StreamService {

    StreamDto validateStream(Map<String,String> map);
    StreamDto publishDone(Map<String,String> map);
}
