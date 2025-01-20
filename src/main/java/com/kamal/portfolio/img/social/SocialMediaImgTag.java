package com.kamal.portfolio.img.social;

import com.kamal.portfolio.img.ImgTagAttributes;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public class SocialMediaImgTag extends ImgTagAttributes {
  private String onClickAction;
}
