//package com.example.resume_web.dto;
//
//
//import com.example.resume_web.entity.User;
//import com.example.resume_web.entity.UserImg;
//import lombok.*;
//import org.modelmapper.ModelMapper;
//
//@Setter
//@Getter
//@ToString
//@AllArgsConstructor //모든 생성자
//@NoArgsConstructor //디폴트 생성자
//@Builder
//public class UserImgDto {
//
//    private Long userFileUuid;
//
//    private String userFileOriName;    //원본 이미지 파일명
//
//    private String userFileSystemName;      //이미지 파일명
//
//    private String userFilePath;
//
//    private static ModelMapper modelMapper = new ModelMapper();
//
//    public static UserImgDto entityToDto(User user){
////        UserImgDto userImgDto = modelMapper.map(user, UserImgDto.class);
////        return userImgDto;
//        return modelMapper.map(user, UserImgDto.class);
//
//    }
//}
