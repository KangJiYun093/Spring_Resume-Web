package com.example.resume_web.controller;

import com.example.resume_web.dto.*;
import com.example.resume_web.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/post/*")
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService postService;

    @GetMapping("post-list2")
    public String postList(Model model) {
        List<PostDto> postLists = postService.getPostList();

        model.addAttribute("posts", postLists);

        return "view/post-list2";
    }

    @GetMapping("post-update/{postId}")
    public String postUpdate(@PathVariable("postId") Long postId, Model model) {
        PostDto post = postService.getPostDetail(postId);

        model.addAttribute("post", post);

        return "view/post-update";
    }

    @PostMapping("post-delete")
    @ResponseBody
    public void postDelete(Long postId) {
        postService.deletePost(postId);
    }

    @GetMapping("post-write")
    public String postWrite() {
        return "view/post-write";
    }

    @PostMapping("post-write")
    @ResponseBody
    public void postSave(String title, String username, String email, String birthbtn, String phoneNumber, String simplePr, String[] admissionYears,
                         String[] graduationYears, String[] educationLevels, String[] educationBackgrounds, String[] experienceStarts,
                         String[] experienceEnds, String[] companyNames, String[] certificationDates, String[] certificationNames,
                         String[] checkCompanyNames, String[] introduceTitles, String[] introduceContents) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        PostDto postDto = new PostDto();

        List<EducationDto> educationDtoList = new ArrayList<>();
        List<ExperienceDto> experienceDtoList = new ArrayList<>();
        List<CertificationDto> certificationDtoList = new ArrayList<>();
        List<IntroduceDto> introduceDtoList = new ArrayList<>();

        for(int i = 0; i < admissionYears.length; i++) {
            EducationDto educationDto = new EducationDto();
            educationDto.setAdmissionYear(formatter.parse(admissionYears[i]));
            educationDto.setGraduationYear(formatter.parse(graduationYears[i]));
            educationDto.setEducationLevel(educationLevels[i]);
            educationDto.setEducationBackground(educationBackgrounds[i]);

            educationDtoList.add(educationDto);
        }

        for(int i = 0; i < experienceStarts.length; i++) {
            ExperienceDto experienceDto = new ExperienceDto();
            experienceDto.setStartDate(formatter.parse(experienceStarts[i]));
            experienceDto.setEndDate(formatter.parse(experienceEnds[i]));
            experienceDto.setCompanyNameDepart(companyNames[i]);

            experienceDtoList.add(experienceDto);
        }

        for(int i = 0; i < certificationDates.length; i++) {
            CertificationDto certificationDto = new CertificationDto();
            certificationDto.setCertificationDate(formatter.parse(certificationDates[i]));
            certificationDto.setCertificationName(certificationNames[i]);
            certificationDto.setCertificationAuthority(checkCompanyNames[i]);

            certificationDtoList.add(certificationDto);
        }

        for(int i = 0; i < introduceTitles.length; i++) {
            IntroduceDto introduceDto = new IntroduceDto();
            introduceDto.setIntroduceTitle(introduceTitles[i]);
            introduceDto.setIntroduceContent(introduceContents[i]);

            introduceDtoList.add(introduceDto);
        }

        postDto.setPostTitle(title);
        postDto.setUserName(username);
        postDto.setUserEmail(email);
        postDto.setUserBirth(formatter.parse(birthbtn));
        postDto.setUserPhone(phoneNumber);
        postDto.setSimplePr(simplePr);
        postDto.setRegTime(LocalDateTime.now().toString());
        postDto.setUpdateTime(LocalDateTime.now().toString());

        postDto.setEducationDto(educationDtoList);
        postDto.setExperienceDto(experienceDtoList);
        postDto.setCertificationDto(certificationDtoList);
        postDto.setIntroduceDto(introduceDtoList);

        postService.savePost(postDto);
    }
}
