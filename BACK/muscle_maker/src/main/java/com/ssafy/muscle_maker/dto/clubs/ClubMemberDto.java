package com.ssafy.muscle_maker.dto.clubs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class ClubMemberDto {
    long userId;
    String nickname;
    String image;

    int completionPercent;
    boolean completionToday;
}
