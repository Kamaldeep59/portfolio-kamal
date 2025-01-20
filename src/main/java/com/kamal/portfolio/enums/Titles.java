package com.kamal.portfolio.enums;

import lombok.Getter;

@Getter
public enum Titles {
  SOFTWARE_DEVELOPER("Software Developer"), CONTENT_CREATOR("Content Creator");

  private final String value;

  Titles(String value) {
    this.value = value;
  }

}
