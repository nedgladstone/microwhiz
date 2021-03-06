package com.github.nedgladstone.cardball.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class LineupDefinition {
    private List<ParticipantDefinition> participants = new ArrayList<>();
}
