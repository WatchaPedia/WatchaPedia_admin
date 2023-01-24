package com.watcha.watchapedia.controller.api;

import com.watcha.watchapedia.controller.CrudController;
import com.watcha.watchapedia.model.entity.Movie;
import com.watcha.watchapedia.model.network.Header;
import com.watcha.watchapedia.model.network.request.MovieApiRequest;
import com.watcha.watchapedia.model.network.response.MovieApiResponse;
import com.watcha.watchapedia.service.MovieApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
@RequiredArgsConstructor
public class MovieApiController extends CrudController<MovieApiRequest, MovieApiResponse, Movie> {
    private final MovieApiLogicService movieApiLogicService;
    @Override
    @PostMapping("") // http://localhost:8888/api/movie (post)
    public Header<MovieApiResponse> create(@RequestBody Header<MovieApiRequest> request) {
        System.out.println(request.getData());
        return movieApiLogicService.create(request);
    }

    @Override
    @GetMapping("{movIdx}") // http://localhost:8888/api/movie/{movIdx} (get)
    public Header<MovieApiResponse> read(@PathVariable(name="movIdx") Long movIdx) {
        return movieApiLogicService.read(movIdx);
    }

    @GetMapping("") // http://localhost:8888/api/movie
    public Header<List<MovieApiResponse>> findAll(){
        return movieApiLogicService.search();
    }

    @Override
    @PutMapping("") // http://localhost:8888/api/movie (put)
    public Header<MovieApiResponse> update(@RequestBody Header<MovieApiRequest> request) {
        return movieApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}") // http://localhost:8888/api/movie/{id} (delete)
    public Header<MovieApiResponse> delete(@PathVariable Long id) {
        return movieApiLogicService.delete(id);
    }
}


