package org.zerock.api01.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.zerock.api01.dto.PageRequestDTO;
import org.zerock.api01.dto.PageResponseDTO;
import org.zerock.api01.dto.TodoDTO;
import org.zerock.api01.service.TodoService;

import java.util.Map;

@RestController
@RequestMapping("/api/todo")
@Log4j2
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Long> register(@RequestBody TodoDTO todoDTO){

        log.info(todoDTO);

        Long tno = todoService.register(todoDTO);

        return Map.of("tno", tno);
    }

    @GetMapping("/{tno}")
    public TodoDTO read(@PathVariable("tno") Long tno){

        log.info("read tno: " + tno);

        return todoService.read(tno);
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO){

        return todoService.list(pageRequestDTO);
    }

    @DeleteMapping(value= "/{tno}")
    public Map<String, String> delete(@PathVariable Long tno){


        return null;
    }


}


//{
//        "owner": "apiuser1",
//        "access": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2NDgwNDk4NjgsIm1pZCI6ImFwaXVzZXIxIiwiaWF0IjoxNjQ3OTYzNDY4fQ.fC3JZRuadsf1eTvec6rd_rMeAlPAzUBsaFWPO-ddZUg",
//        "refresh": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2NTA1NTU0NjgsIm1pZCI6ImFwaXVzZXIxIiwiaWF0IjoxNjQ3OTYzNDY4fQ._6NnhyT6wqvTW3PKZV15IJnCqrYu77aketIQ3QYKxdM"
//        }