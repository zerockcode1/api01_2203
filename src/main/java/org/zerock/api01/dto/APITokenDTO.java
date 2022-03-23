package org.zerock.api01.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class APITokenDTO {

    private String owner; //토큰의 claim이 될 내용
    private String access;
    private String refresh;

}
