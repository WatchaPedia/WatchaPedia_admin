package com.watcha.watchapedia.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "tbTv")
@Builder
@Data
@ToString(callSuper = true)

public class Tv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tvIdx;
    private String tvThumbnail;
    @Column(length = 100)
    private String tvTitle;
    @Column(length = 100)
    private String tvTitleOrg;
    @Column(length = 20)
    private String tvMakingDate;
    @Column(length = 20)
    private String tvChannel;
    @Column(length = 20)
    private String tvGenre;
    @Column(length = 10)
    private String tvCountry;
    @Column(length = 10)
    private String tvAge;
    private String tvPeople;
    private String tvSummary;
    private String tvWatch;
    private String tvGallery;
    private String tvVideo;
    private String tvBackImg;


    protected Tv() {
    }

    private Tv(Long tvIdx, String tvThumbnail, String tvTitle, String tvTitleOrg,
               String tvMakingDate, String tvChannel, String tvGenre,
               String tvCountry, String tvAge, String tvPeople, String tvSummary,
               String tvWatch, String tvGallery, String tvVideo,
               String tvBackImg) {
        this.tvIdx = tvIdx;
        this.tvThumbnail = tvThumbnail;
        this.tvTitle = tvTitle;
        this.tvTitleOrg = tvTitleOrg;
        this.tvMakingDate = tvMakingDate;
        this.tvChannel = tvChannel;
        this.tvGenre = tvGenre;
        this.tvCountry = tvCountry;
        this.tvAge = tvAge;
        this.tvPeople = tvPeople;
        this.tvSummary = tvSummary;
        this.tvWatch = tvWatch;
        this.tvGallery = tvGallery;
        this.tvVideo = tvVideo;
        this.tvBackImg = tvBackImg;
    }

    public static Tv of(Long tvIdx, String tvThumbnail, String tvTitle, String tvTitleOrg,
                        String tvMakingDate, String tvChannel, String tvGenre,
                        String tvCountry, String tvAge, String tvPeople, String tvSummary,
                        String tvWatch, String tvGallery, String tvVideo,
                        String tvBackImg) {
        return new Tv(tvIdx, tvThumbnail, tvTitle, tvTitleOrg,
                tvMakingDate, tvChannel, tvGenre, tvCountry, tvAge, tvPeople, tvSummary, tvWatch, tvGallery, tvVideo, tvBackImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tvIdx);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Tv tv)) return false;
        return tvIdx != null;
    }
}