package com.example.resume_web.service;

import com.example.resume_web.dto.*;
import com.example.resume_web.entity.*;
import com.example.resume_web.repository.*;
import com.querydsl.core.Tuple;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {

    private final PostRepository postRepository;
    private final EducationRepository educationRepository;
    private final ExperienceRepository experienceRepository;
    private final CertificationRepository certificationRepository;
    private final IntroduceRepository introduceRepository;

    public List<PostDto> getPostList(){
//        return postRepository.findAllByPostId(postId);
        List<Post> posts = postRepository.findAll();
        List<PostDto> postDtos = new ArrayList<>();
        posts.forEach(post -> postDtos.add(toPostDTO(post)));
        return postDtos;
    }

    public PostDto getPostDetail(Long postId){
//        return toPostDTO(postRepository.findPostDetailsByPostId(postId).get());
        return toPostDTO(postRepository.findById(postId).get());
    }

    public PostDto toPostDTO(Post post) {
        return PostDto.builder()
                .postId(post.getPostId())
                .postTitle(post.getPostTitle())
                .userName(post.getUserName())
                .userEmail(post.getUserEmail())
                .userBirth(post.getUserBirth())
                .userPhone(post.getUserPhone())
                .simplePr(post.getSimplePr())
                .regTime(post.getRegTime().toString())
                .updateTime(post.getUpdateTime().toString())
                .educationDto(toEducationDTO(post.getEducation()))
                .experienceDto(toExperienceDTO(post.getExperience()))
                .certificationDto(toCertificationDTO(post.getCertification()))
                .introduceDto(toIntroduceDTO(post.getIntroduce()))
                .build();
    }

    public List<EducationDto> toEducationDTO(List<Education> educations){
        List<EducationDto> educationDtoList = new ArrayList<>();
        educations.forEach(
                education -> {
                    EducationDto educationDto = EducationDto.builder()
                            .educationId(education.getEducationId())
                            .educationLevel(education.getEducationLevel())
                            .educationBackground(education.getEducationBackground())
                            .admissionYear(education.getAdmissionYear())
                            .graduationYear(education.getGraduationYear())
                            .build();
                    educationDtoList.add(educationDto);
                }
        );
        return educationDtoList;
    }

    public List<ExperienceDto> toExperienceDTO(List<Experience> experiences){
        List<ExperienceDto> experienceDtoList = new ArrayList<>();
        experiences.forEach(
                experience -> {
                    ExperienceDto experienceDto = ExperienceDto.builder()
                            .experienceId(experience.getExperienceId())
                            .companyNameDepart(experience.getCompanyNameDepart())
                            .startDate(experience.getStartDate())
                            .endDate(experience.getEndDate())
                            .build();
                    experienceDtoList.add(experienceDto);
                }
        );
        return experienceDtoList;

    }

    public List<CertificationDto> toCertificationDTO(List<Certification> certifications){
        List<CertificationDto> certificationDtoList = new ArrayList<>();
        certifications.forEach(
                certification -> {
                    CertificationDto certificationDto = CertificationDto.builder()
                            .certificationId(certification.getCertificationId())
                            .certificationAuthority(certification.getCertificationAuthority())
                            .certificationName(certification.getCertificationName())
                            .certificationDate(certification.getCertificationDate())
                            .build();
                    certificationDtoList.add(certificationDto);
                }
                );
        return certificationDtoList;
    }

    public List<IntroduceDto> toIntroduceDTO(List<Introduce> introduces){
        List<IntroduceDto> introduceDtoList = new ArrayList<>();
        introduces.forEach(
                introduce -> {
                    IntroduceDto introduceDto = IntroduceDto.builder()
                            .introduceId(introduce.getIntroduceId())
                            .introduceTitle(introduce.getIntroduceTitle())
                            .introduceContent(introduce.getIntroduceContent())
                            .build();
                    introduceDtoList.add(introduceDto);
                }
                );
        return introduceDtoList;
    }

    public void savePost(PostDto postDto){
         postRepository.save(toPostEntity(postDto));

        postDto.getEducationDto().forEach(educationDto -> {
            educationRepository.save(toEducaionEntity(educationDto));
        });

        postDto.getExperienceDto().forEach(experienceDto -> {
            experienceRepository.save(toExperienceEntity(experienceDto));
        });

        postDto.getCertificationDto().forEach(certificationDto -> {
            certificationRepository.save(toCertificationEntity(certificationDto));
        });

        postDto.getIntroduceDto().forEach(introduceDto -> {
            introduceRepository.save(toIntroduceEntity(introduceDto));
        });

    }

    public void deletePost(Long postId){
        postRepository.deleteById(postId);
    }

    public Post toPostEntity(PostDto postDto) {
        return Post.builder()
                .postId(postDto.getPostId())
                .postTitle(postDto.getPostTitle())
                .userName(postDto.getUserName())
                .userEmail(postDto.getUserEmail())
                .userBirth(postDto.getUserBirth())
                .userPhone(postDto.getUserPhone())
                .simplePr(postDto.getSimplePr())
                .regTime(LocalDateTime.parse(postDto.getRegTime()))
                .updateTime(LocalDateTime.parse(postDto.getUpdateTime()))
                .build();

    }

    public Education toEducaionEntity(EducationDto educationDto){
        return Education.builder()
                .educationId(educationDto.getEducationId())
                .educationLevel(educationDto.getEducationLevel())
                .educationBackground(educationDto.getEducationBackground())
                .admissionYear(educationDto.getAdmissionYear())
                .graduationYear(educationDto.getGraduationYear())
                .build();
    }

    public Experience toExperienceEntity(ExperienceDto experienceDto){
        return Experience.builder()
                .experienceId(experienceDto.getExperienceId())
                .companyNameDepart(experienceDto.getCompanyNameDepart())
                .startDate(experienceDto.getStartDate())
                .endDate(experienceDto.getEndDate())
                .build();
    }

    public Certification toCertificationEntity(CertificationDto certificationDto){
        return Certification.builder()
                .certificationId(certificationDto.getCertificationId())
                .certificationAuthority(certificationDto.getCertificationAuthority())
                .certificationName(certificationDto.getCertificationName())
                .certificationDate(certificationDto.getCertificationDate())
                .build();
    }

    public Introduce toIntroduceEntity(IntroduceDto introduceDto){
        return Introduce.builder()
                .introduceId(introduceDto.getIntroduceId())
                .introduceTitle(introduceDto.getIntroduceTitle())
                .introduceContent(introduceDto.getIntroduceContent())
                .build();
    }

    
}
