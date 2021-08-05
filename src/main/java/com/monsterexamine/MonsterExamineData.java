package com.monsterexamine;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MonsterExamineData {
    int monsterId;
    String monsterName;
    String stats;
    String aggressive;
    String defensive;
    String other;
}
