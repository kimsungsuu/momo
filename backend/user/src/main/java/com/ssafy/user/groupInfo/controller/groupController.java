package com.ssafy.user.groupInfo.controller;

import com.ssafy.user.common.CommonResponse;
import com.ssafy.user.groupInfo.dto.request.CreateNewGroupRequest;
import com.ssafy.user.groupInfo.dto.request.GetFeesPerMonthRequest;
import com.ssafy.user.groupInfo.dto.request.GetGroupsRequest;
import com.ssafy.user.groupInfo.dto.request.UpdateGroupDescriptionRequest;
import com.ssafy.user.groupInfo.dto.request.UpdateGroupNameRequest;
import com.ssafy.user.groupInfo.dto.response.CreateNewGroupResponse;
import com.ssafy.user.groupInfo.dto.response.GetFeesPerYearResponse;
import com.ssafy.user.groupInfo.dto.response.GetGroupDetailsResponse;
import com.ssafy.user.groupInfo.dto.response.GetMyGroupListResponse;
import com.ssafy.user.groupInfo.dto.response.GetMyGruopResponse;
import com.ssafy.user.groupInfo.dto.response.SplitBalanceResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("groups")
@Tag(name = "모임", description = "모임관련 데이터 생성, 조회, 수정, 삭제 및 상태 관리")
public class groupController {

    @Operation(summary = "전체 모임 조회", description = "참여중인 모든 모임 조회")
    @GetMapping("/my-groups")
    public ResponseEntity<?> getMyGroups(@RequestBody GetGroupsRequest getGroupsRequest) {
        return CommonResponse.toResponseEntity(HttpStatus.OK, "전체 모임 죄회 성공",
            new GetMyGroupListResponse());
    }

    @Operation(summary = "모임 상세 조회", description = "선택된 모임의 홈을 통해 상세 조회")
    @GetMapping("/{id}")
    public ResponseEntity<?> getGroupDetails(@PathVariable Long id) {
        return CommonResponse.toResponseEntity(HttpStatus.OK, "모임 상세 조회 성공",
            new GetGroupDetailsResponse());
    }

    @Operation(summary = "모임원별 납입액", description = "각 모임원이 달마나 납입한 금액 조회")
    @GetMapping("/{id}/fees-per-month")
    public ResponseEntity<?> getFeesPerMonth(@PathVariable Long id, @RequestBody
    GetFeesPerMonthRequest getFeesPerMonthRequest) {
        return CommonResponse.toResponseEntity(HttpStatus.OK, "해당 모임원 납입금액 조회 성공",
            new GetFeesPerYearResponse());
    }

    @Operation(summary = "모임 생성", description = "새 모임 생성")
    @PostMapping("/new-group")
    public ResponseEntity<?> createNewGroup(
        @RequestBody CreateNewGroupRequest createNewGroupRequest) {
        return CommonResponse.toResponseEntity(HttpStatus.OK, "새 모임 생성 성공",
            new CreateNewGroupResponse());
    }

    @Operation(summary = "모임 명 수정", description = "모임의 이름 수정")
    @PostMapping("/{id}/name")
    public ResponseEntity<?> updateGroupName(@PathVariable Long id,
        @RequestBody UpdateGroupNameRequest updateGroupNameRequest) {
        return CommonResponse.toResponseEntity(HttpStatus.OK, "모임 명 수정 성공", null);
    }

    @Operation(summary = "모임 목적 수정", description = "모임의 목적 수정")
    @PostMapping("/{id}/description")
    public ResponseEntity<?> updateGroupDescription(@PathVariable Long id,
        @RequestBody UpdateGroupDescriptionRequest updateGroupDescriptionRequest) {
        return CommonResponse.toResponseEntity(HttpStatus.OK, "모임 목적 수정 성공", null);
    }

    @Operation(summary = "모임 회비 분배", description = "모임의 회비를 모임 구성원에게 분배")
    @PostMapping("/{id}/split-balance")
    public ResponseEntity<?> splitBalance(@PathVariable Long id) {
        return CommonResponse.toResponseEntity(HttpStatus.OK, "모임 회비 분배 성공",
            new SplitBalanceResponse());
    }

    @Operation(summary = "모임 삭제", description = "모임 삭제")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteGroup(@PathVariable Long id) {
        return CommonResponse.toResponseEntity(HttpStatus.OK, "모임 삭제 성공", new GetMyGruopResponse());
    }
}
