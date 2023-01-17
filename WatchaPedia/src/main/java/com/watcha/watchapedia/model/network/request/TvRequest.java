package com.watcha.watchapedia.model.network.request;


import com.watcha.watchapedia.model.dto.QnaDto;
import com.watcha.watchapedia.model.dto.TvDto;

import java.time.LocalDateTime;

public record TvRequest(
        Long tvIdx, String tvThumbnail, String tvTitle, String tvTitleOrg,
        String tvMakingDate, String tvChannel, String tvGenre,
        String tvCountry, String tvAge, String tvPeople, String tvSummary,
        String tvWatch, String tvGallery, String tvVideo,
        String tvBackImg
) {

    public static TvRequest of(Long tvIdx, String tvThumbnail, String tvTitle, String tvTitleOrg,
                               String tvMakingDate, String tvChannel, String tvGenre,
                               String tvCountry, String tvAge, String tvPeople, String tvSummary,
                               String tvWatch, String tvGallery, String tvVideo,
                               String tvBackImg) {
        return new TvRequest(tvIdx, tvThumbnail, tvTitle, tvTitleOrg,
                tvMakingDate, tvChannel, tvGenre, tvCountry, tvAge, tvPeople, tvSummary, tvWatch, tvGallery, tvVideo, tvBackImg);
    }

    public TvDto toDto() {
        return TvDto.of(
                tvIdx, tvThumbnail, tvTitle, tvTitleOrg,
                tvMakingDate, tvChannel, tvGenre, tvCountry, tvAge, tvPeople, tvSummary, tvWatch, tvGallery, tvVideo, tvBackImg
        );
    }
}