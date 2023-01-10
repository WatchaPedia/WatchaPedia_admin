package com.watcha.watchapedia.controller.api;

import com.watcha.watchapedia.controller.CrudController;
import com.watcha.watchapedia.model.entity.Movie;
import com.watcha.watchapedia.model.network.Header;
import com.watcha.watchapedia.model.network.request.MovieApiRequest;
import com.watcha.watchapedia.model.network.response.MovieApiResponse;
import com.watcha.watchapedia.service.MovieApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
@RequiredArgsConstructor
public class MovieApiController extends CrudController<MovieApiRequest, MovieApiResponse, Movie> {
    private final MovieApiLogicService movieApiLogicService;
    @Override
    @PostMapping("") // http://localhost:8888/api/user (post)
    public Header<MovieApiResponse> create(@RequestBody Header<MovieApiRequest> request) {
        return movieApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}") // http://localhost:8888/api/user/{id} (get)
    public Header<MovieApiResponse> read(@PathVariable(name="id") Long id) {
        return movieApiLogicService.read(id);
    }

    @GetMapping("") // http://localhost:8888/api/user?page=0
    public Header<List<MovieApiResponse>> findAll(){
        return movieApiLogicService.search();
    }

    @Override
    @PutMapping("") // http://localhost:8888/api/user (put)
    public Header<MovieApiResponse> update(@RequestBody Header<MovieApiRequest> request) {
        return movieApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}") // http://localhost:8888/api/user/{id} (delete)
    public Header<MovieApiResponse> delete(@PathVariable Long id) {
        return movieApiLogicService.delete(id);
    }
}


