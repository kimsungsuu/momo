package com.ssafy.user.member.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendNewPasswordRequest {

    public String id;
    public String phoneNumber;

}
