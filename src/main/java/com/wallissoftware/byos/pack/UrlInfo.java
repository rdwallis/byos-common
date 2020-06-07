package com.wallissoftware.byos.pack;

import lombok.Data;
import lombok.Value;

import java.util.HashMap;
import java.util.Map;

@Data
public class UrlInfo {

  private String url;
  private String title;
  private String description;
  private Map<String, Long> keyWeights;

  public void addKeyWeight(String key, Long weight) {
    if (keyWeights == null) {
      keyWeights = new HashMap<>();
    }
    keyWeights.put(key, keyWeights.getOrDefault(key, 0L) + weight);
  }

}
