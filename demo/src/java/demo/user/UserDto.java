package com.example.demo.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private String name;
    private String nickname;
    private String password;
    private String checkPassword;
    private String email;
    private String phone;

    private String job;         // "학생" or "선생"
    private String attended;  // "재학생", "졸업생"

    // DTO -> Entity 변환 메서드 (builder 패턴 사용)
    // password는 평문으로 넘어가게 두고, Entity 변환 시 암호화는 서비스 계층에서 처리
    public Users toEntity() {
        return Users.builder()
                .name(name)
                .nickname(nickname)
                .email(email)
                .phone(phone)
                .job(job)
                .attended(attended)
                .build();
    }
}
