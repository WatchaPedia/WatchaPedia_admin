package com.watcha.watchapedia.controller.page;

import com.watcha.watchapedia.dto.UserDto;
import com.watcha.watchapedia.dto.response.UserResponse;
import com.watcha.watchapedia.model.entity.User;
import com.watcha.watchapedia.model.repository.UserRepository;
import com.watcha.watchapedia.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
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

    @GetMapping(path="/contents/bookEdit")
    public ModelAndView bookEdit(){
        return new ModelAndView("/3_contents/book/bookEdit");
    }

    @GetMapping(path="/contents/movie")
    public ModelAndView cmovie(){
        return new ModelAndView("/3_contents/movie/movie");
    }

    @GetMapping(path="/contents/movieEdit")
    public ModelAndView cmovieeEit(){
        return new ModelAndView("/3_contents/movie/movieEdit");
    }


    @GetMapping(path="/contents/tv")
    public ModelAndView ctv(){
        return new ModelAndView("/3_contents/tv/tv");
    }

    @GetMapping(path="/contents/tvEdit")
    public ModelAndView tvEdit(){
        return new ModelAndView("/3_contents/tv/tvEdit");
    }

    @GetMapping(path="/contents/webtoon")
    public ModelAndView cwebtoon(){
        return new ModelAndView("/3_contents/webtoon/webtoon");
    }

    @GetMapping(path="/contents/webtoonEdit")
    public ModelAndView webtoonEdit(){
        return new ModelAndView("/3_contents/webtoon/webtoonEdit");
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

    // 멤버 디테일
    final UserRepository userRepository;
    @GetMapping(path="/member/{userIdx}")
    public String memberdetail(@PathVariable Long userIdx, ModelMap map){
        Optional<User> user = userRepository.findById(userIdx);
        UserResponse userResponse = UserResponse.from(UserDto.from(user.get()));
        map.addAttribute("user", userResponse);
        return "/6_member/memberdetail";
    }

    // 멤버 리스트
    final UserService userService;
    @GetMapping(path="/member")
    public String membermanage(ModelMap map){
        List<UserResponse> users = userService.searchUsers().stream().map(UserResponse::from).toList();
        map.addAttribute("users", users);
        return "/6_member/membermanage";
    }

    // 유저 인플루언서 수정
    @GetMapping("/member/{userIdx}/{userType}")
    public String updateUser(
             @PathVariable Long userIdx,
             @PathVariable String userType){
        Optional<User> user = userRepository.findById(userIdx);
        user.ifPresent(
                selectUser -> {
                    selectUser.setUserType(userType);
                    userRepository.save(selectUser);
                }
        );
        return "redirect:/member/"+userIdx;
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
