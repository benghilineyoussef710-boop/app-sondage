package com.voting.voting_app.request;

import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
public class Vote {
    private Long pollId;
    private int optionIndex;
}
