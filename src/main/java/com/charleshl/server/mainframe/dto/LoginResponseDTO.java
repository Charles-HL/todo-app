package com.charleshl.server.mainframe.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LoginResponseDTO {

    @Getter
    @Setter
    String token;
}
