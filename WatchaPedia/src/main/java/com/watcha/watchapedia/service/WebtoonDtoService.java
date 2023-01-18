package com.watcha.watchapedia.service;

import com.watcha.watchapedia.model.dto.WebtoonDto;
import com.watcha.watchapedia.model.entity.Webtoon;
import com.watcha.watchapedia.model.repository.WebtoonRepsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WebtoonDtoService {
    private final WebtoonRepsitory webtoonRepsitory;

    public List<WebtoonDto> list(){
        List<Webtoon> WebtoonEntityList = webtoonRepsitory.findAll();
        List<WebtoonDto>WebtoonList =  new ArrayList<>();

        for(Webtoon webtoon: WebtoonEntityList){
            WebtoonList.add(WebtoonDto.toWebtoonDto(webtoon));
        }
        return WebtoonList;
    }
}
