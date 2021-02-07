package com.github.nedgladstone.cardball.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class ParticipantDefinition {
    // 0-8, with 0 batting first
    private int numberInBattingOrder;

    // 0-8, with position + 1 being scorecard numbering
    private int fieldingPosition;

    private long playerId;
}