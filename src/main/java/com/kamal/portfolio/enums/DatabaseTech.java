package com.kamal.portfolio.enums;

import lombok.Getter;

@Getter
public enum DatabaseTech {
  POSTGRESQL("PostgreSQL", ExperienceLevel.BEGINNER.name()), ORACLEDB("OracleDB",
      ExperienceLevel.INTERMEDIATE.name()), MYSQL("MySQL", ExperienceLevel.PROFESSIONAL.name());

  private final String technology;
  private final String experienceLevel;

  DatabaseTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
