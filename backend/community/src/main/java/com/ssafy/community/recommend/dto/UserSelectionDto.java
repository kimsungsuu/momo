package com.ssafy.community.recommend.dto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class UserSelectionDto {
    private Map<String, List<Integer>> selections;
}
