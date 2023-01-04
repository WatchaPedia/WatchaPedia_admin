package com.watcha.watchapedia.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class PageController {

    @GetMapping(path="")
    public ModelAndView index(){
        return new ModelAndView("/index");
    }

    @GetMapping(path="/login")
    public ModelAndView login(){
        return new ModelAndView("/0_login/Login");
    }

    @GetMapping(path="/notice")
    public ModelAndView notice(){
        return new ModelAndView("/1_notice/Notice");
    }

    @GetMapping(path="/notice_edit")
    public ModelAndView notice_edit(){
        return new ModelAndView("/1_notice/Notice_Edit");
    }

    @GetMapping(path="/notice_view")
    public ModelAndView notice_view(){
        return new ModelAndView("/1_notice/Notice_View");
    }

    @GetMapping(path="/qna")
    public ModelAndView qna(){
        return new ModelAndView("/2_qna/QnA");
    }

    @GetMapping(path="/qna_edit")
    public ModelAndView qnaedit(){
        return new ModelAndView("/2_qna/QnA_Edit");
    }

    @GetMapping(path="/qna_view")
    public ModelAndView qnaview(){
        return new ModelAndView("/2_qna/QnA_View");
    }

    @GetMapping(path="/contents/book")
    public ModelAndView cbook(){
        return new ModelAndView("/3_contents/book/book");
    }

    @GetMapping(path="/contents/movie")
    public ModelAndView cmovie(){
        return new ModelAndView("/3_contents/movie/Movie");
    }

    @GetMapping(path="/contents/movie_edit")
    public ModelAndView cmovieedit(){
        return new ModelAndView("/3_contents/movie/Movie_Edit");
    }

    @GetMapping(path="/contents/tv")
    public ModelAndView ctv(){
        return new ModelAndView("/3_contents/tv/tv");
    }

    @GetMapping(path="/contents/webtoon")
    public ModelAndView cwebtoon(){
        return new ModelAndView("/3_contents/webtoon/webtoon");
    }

    @GetMapping(path="/comment/report_page")
    public ModelAndView report(){
        return new ModelAndView("/4_comment/reported/report_page");
    }

    @GetMapping(path="/comment/reportdetail_comment")
    public ModelAndView reportdetailcomment(){
        return new ModelAndView("/4_comment/reported/reportdetail_comment");
    }

    @GetMapping(path="/comment/reportdetail_reply")
    public ModelAndView reportdetailreply(){
        return new ModelAndView("/4_comment/reported/reportdetail_reply");
    }

    @GetMapping(path="/comment/search_detail")
    public ModelAndView commentsearchdetail(){
        return new ModelAndView("/4_comment/search/commentSearchDetail");
    }
    @GetMapping(path="/comment/search_list")
    public ModelAndView commentsearchlist(){
        return new ModelAndView("/4_comment/search/commentSearchList");
    }
    @GetMapping(path="/character_detail")
    public ModelAndView characterdetail(){
        return new ModelAndView("/5_character/characterdetail");
    }
    @GetMapping(path="/character_manage")
    public ModelAndView charactermanage(){
        return new ModelAndView("/5_character/charactermanage");
    }
    @GetMapping(path="/character_register")
    public ModelAndView characterregister(){
        return new ModelAndView("/5_character/characterregister");
    }
    @GetMapping(path="/advertisement_main")
    public ModelAndView admain(){
        return new ModelAndView("/7_advertisement/adMain");
    }
    @GetMapping(path="/advertisement_regist")
    public ModelAndView adregist(){
        return new ModelAndView("/7_advertisement/adRegist");
    }

    @GetMapping(path="/hradmin/accountdetail")
    public ModelAndView hradminaccountdetail(){
        return new ModelAndView("/8_admin/hradmin/accountdetail");
    }
    @GetMapping(path="/hradmin/createaccount")
    public ModelAndView hradmincreateaccount(){
        return new ModelAndView("/8_admin/hradmin/createaccount");
    }
    @GetMapping(path="/hradmin/modifyaccount")
    public ModelAndView hradminmodifyaccount(){
        return new ModelAndView("/8_admin/hradmin/modifyaccount");
    }
    @GetMapping(path="/hradmin/searchaccount")
    public ModelAndView hradminsearchaccount(){
        return new ModelAndView("/8_admin/hradmin/searchaccount");
    }






}
