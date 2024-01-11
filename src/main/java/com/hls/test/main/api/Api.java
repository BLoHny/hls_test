package com.hls.test.main.api;

import com.hls.test.main.dto.StreamDto;
import com.hls.test.main.service.StreamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/stream")
@Slf4j

public class Api {

    private final StreamService streamService;

    @PostMapping(value = "/auth",consumes ={MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public StreamDto validateStream(@RequestParam Map<String, String> body){
        return streamService.validateStream(body);
    }

    @PostMapping(value = "/publish/done",consumes ={MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public StreamDto publishDone(@RequestParam Map<String, String> body){
        return streamService.publishDone(body);
    }
}
