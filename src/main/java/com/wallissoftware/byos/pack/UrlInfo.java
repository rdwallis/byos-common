package com.wallissoftware.byos.pack;

import lombok.Data;
import lombok.Value;

import java.util.Map;

@Data
public class UrlInfo {

  private String url;
  private String title;
  private String description;
  private Map<String, Long> keyWeights;
}
