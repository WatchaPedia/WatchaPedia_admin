package com.watcha.watchapedia.model.dto;

import com.watcha.watchapedia.model.entity.Webtoon;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WebtoonDto {
    private Long webIdx;
    private String webThumbnail;
    private String webTitle;
    private String webTitleOrg;
    private String webWriter;
    private String webGenre;
    private String webSerDetail;
    private String webSerDay;
    private String webSerPeriod;
    private String webAge;
    private String webSummary;
    private String webPeople;
    private String webWatch;


    public static WebtoonDto toWebtoonDto(Webtoon webtoon) {
        WebtoonDto webtoonDto = new WebtoonDto();
        webtoonDto.setWebIdx(webtoon.getWebIdx());
        webtoonDto.setWebTitle(webtoon.getWebTitle());
        webtoonDto.setWebWriter(webtoon.getWebWriter());
        webtoonDto.setWebSerDetail(webtoon.getWebSerDetail());
        webtoonDto.setWebSerDay(webtoon.getWebSerDay());
        webtoonDto.setWebGenre(webtoon.getWebGenre());
        return webtoonDto;
    }
}
