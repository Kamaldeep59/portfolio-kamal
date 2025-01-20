package com.kamal.portfolio.enums;

import lombok.Getter;

@Getter
public enum CloudTech {
  AWS("AWS", ExperienceLevel.BEGINNER.name()), GCP("AZURE", ExperienceLevel.BEGINNER.name());

  private final String technology;
  private final String experienceLevel;

  CloudTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
