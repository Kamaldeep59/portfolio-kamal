package com.kamal.portfolio.enums;

import lombok.Getter;

@Getter
public enum FrontendTech {
  HTML("HTML", ExperienceLevel.PROFESSIONAL.name()), CSS("CSS", ExperienceLevel.PROFESSIONAL.name()), REACT("ReactJS",
      ExperienceLevel.INTERMEDIATE.name()), JS("JavaScript", ExperienceLevel.EXPERIENCED.name()), TYPESCRIPT(
          "TypeScript", ExperienceLevel.BEGINNER.name()), ANGULAR("AngularJS",
              ExperienceLevel.BEGINNER.name());

  private final String technology;
  private final String experienceLevel;

  FrontendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
