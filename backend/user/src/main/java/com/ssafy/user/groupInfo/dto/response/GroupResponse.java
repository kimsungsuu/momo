package com.ssafy.user.groupInfo.dto.response;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
public class GroupResponse {

    private String name;
    private String description;
    private long availableBalance;
    private long totalFee;
    private long monthlyFee;
    private long totalBalance;
    private int members;

    @QueryProjection
    public GroupResponse(String name, String description, long availableBalance, long totalFee,
        long monthlyDueDate, long totalBalance, int members) {
        this.name = name;
        this.description = description;
        this.availableBalance = availableBalance;
        this.totalFee = totalFee;
        this.monthlyFee = monthlyFee;
        this.totalBalance = totalBalance;
        this.members = members;
    }
}
