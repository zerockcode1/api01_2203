package org.zerock.api01.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.api01.dto.MovieDTO;
import org.zerock.api01.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/guest/movies")
@RequiredArgsConstructor
@Log4j2
public class MovieListController {

    private final MovieService movieService;

    @GetMapping("")
    public List<MovieDTO> getMovies() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return movieService.getMovies();
    }

}
