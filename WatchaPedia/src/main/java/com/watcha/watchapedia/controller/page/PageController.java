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

    @GetMapping(path="/notice_write")
    public ModelAndView notice_write(){
        return new ModelAndView("/1_notice/Notice_Write");
    }

    @GetMapping(path="/qna")
    public ModelAndView qna(){
        return new ModelAndView("/2_qna/QnA");
    }

    @GetMapping(path="/qna_reply")
    public ModelAndView qnareply(){
        return new ModelAndView("/2_qna/QnA_Reply");
    }

    @GetMapping(path="/qna_view")
    public ModelAndView qnaview(){
        return new ModelAndView("/2_qna/QnA_View");
    }

    @GetMapping(path="/contents/book")
    public ModelAndView cbook(){
        return new ModelAndView("/3_contents/book/book");
    }

    @GetMapping(path="/contents/book_edit")
    public ModelAndView bookEdit(){
        return new ModelAndView("/3_contents/book/book_edit");
    }

    @GetMapping(path="/contents/book_write")
    public ModelAndView bookWrite(){
        return new ModelAndView("/3_contents/book/book_write");
    }
    @GetMapping(path="/contents/book_detail")
    public ModelAndView bookDetail(){
        return new ModelAndView("/3_contents/book/book_detail");
    }

    @GetMapping(path="/contents/movie")
    public ModelAndView movie(){
        return new ModelAndView("/3_contents/movie/movie");
    }

    @GetMapping(path="/contents/movie_edit")
    public ModelAndView movieEdit(){
        return new ModelAndView("/3_contents/movie/movie_edit");
    }
    @GetMapping(path="/contents/movie_write")
    public ModelAndView movieWrite(){
        return new ModelAndView("/3_contents/movie/movie_write");
    }
    @GetMapping(path="/contents/movie_detail")
    public ModelAndView movieDetail(){
        return new ModelAndView("/3_contents/movie/movie_detail");
    }


    @GetMapping(path="/contents/tv")
    public ModelAndView tv(){
        return new ModelAndView("/3_contents/tv/tv");
    }

    @GetMapping(path="/contents/tv_edit")
    public ModelAndView tvEdit(){
        return new ModelAndView("/3_contents/tv/tv_edit");
    }
    @GetMapping(path="/contents/tv_write")
    public ModelAndView tvWrite(){
        return new ModelAndView("/3_contents/tv/tv_write");
    }
    @GetMapping(path="/contents/tv_detail")
    public ModelAndView tvDetail(){
        return new ModelAndView("/3_contents/tv/tv_detail");
    }

    @GetMapping(path="/contents/webtoon")
    public ModelAndView cwebtoon(){
        return new ModelAndView("/3_contents/webtoon/webtoon");
    }

    @GetMapping(path="/contents/webtoon_edit")
    public ModelAndView webtoonEdit(){
        return new ModelAndView("/3_contents/webtoon/webtoon_edit");
    }
    @GetMapping(path="/contents/webtoon_write")
    public ModelAndView webtoonWrite(){
        return new ModelAndView("/3_contents/webtoon/webtoon_write");
    }
    @GetMapping(path="/contents/webtoon_detail")
    public ModelAndView webtoonDetail(){
        return new ModelAndView("/3_contents/webtoon/webtoon_detail");
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
    @GetMapping(path="/member_detail")
    public ModelAndView memberdetail(){
        return new ModelAndView("/6_member/memberdetail");
    }
    @GetMapping(path="/member_manage")
    public ModelAndView membermanage(){
        return new ModelAndView("/6_member/membermanage");
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

    @GetMapping(path="/admin_myinfo")
    public ModelAndView myinfo(){
        return new ModelAndView("/8_admin/admin/Myinfo");
    }

    @GetMapping(path="/admin_myinfomodify")
    public ModelAndView myinfomodify(){
        return new ModelAndView("/8_admin/admin/Myinfomodify");
    }




}
