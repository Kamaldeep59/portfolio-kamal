package com.kamal.portfolio.enums;

import lombok.Getter;

@Getter
public enum BackendTech {
  JAVA("JAVA 17+", ExperienceLevel.PROFESSIONAL.name()), NODE("Node JS",
      ExperienceLevel.BEGINNER.name()), EXPRESS("Express JS", ExperienceLevel.BEGINNER.name()), SPRING(
          "Spring",
          ExperienceLevel.PROFESSIONAL.name());

  private final String technology;
  private final String experienceLevel;

  BackendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
