package com.watcha.watchapedia.controller.api;

import com.watcha.watchapedia.controller.CrudController;
import com.watcha.watchapedia.model.entity.Notice;
import com.watcha.watchapedia.model.network.Header;
import com.watcha.watchapedia.model.network.request.CharacterApiRequest;
import com.watcha.watchapedia.model.network.request.MovieApiRequest;
import com.watcha.watchapedia.model.network.request.NoticeApiRequest;
import com.watcha.watchapedia.model.network.request.NoticeStatusApiRequest;
import com.watcha.watchapedia.model.network.response.CharacterApiResponse;
import com.watcha.watchapedia.model.network.response.MovieApiResponse;
import com.watcha.watchapedia.model.network.response.NoticeApiResponse;
import com.watcha.watchapedia.service.CharacterApiLogicService;
import com.watcha.watchapedia.service.MovieApiLogicService;
import com.watcha.watchapedia.service.NoticeApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/character")
@RequiredArgsConstructor
public class CharacterApiController extends CrudController<CharacterApiRequest, CharacterApiResponse, Character> {
    private final CharacterApiLogicService characterApiLogicService;

    @Override
    @PostMapping("")
    public Header<CharacterApiResponse> create(@RequestBody Header<CharacterApiRequest> request) {
        return characterApiLogicService.create(request);
    }

    @Override
    @GetMapping("{perIdx}")
    public Header<CharacterApiResponse> read(@PathVariable(name="perIdx") Long perIdx) {
        return characterApiLogicService.read(perIdx);
    }


    @Override
    @PutMapping("")
    public Header<CharacterApiResponse> update(@RequestBody Header<CharacterApiRequest> request) {
        System.out.println("캐릭터업데이트실행");
        System.out.println(request.getData());
        return characterApiLogicService.update(request);
    }


    @Override
    @DeleteMapping("{id}")
    public Header<CharacterApiResponse> delete(@PathVariable Long id) {
        return characterApiLogicService.delete(id);
    }

}
