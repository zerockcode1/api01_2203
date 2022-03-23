package org.zerock.api01.dto;

import lombok.Data;

import javax.persistence.Id;


@Data
public class APIUserDTO {

    @Id
    private String mid;
    private String mpw;
}
