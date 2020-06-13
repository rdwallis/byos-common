package com.wallissoftware.byos.pack;

import lombok.Data;

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

  public void removeKeyWeights(long minWeight) {
    keyWeights.entrySet().removeIf(e-> e.getValue() < minWeight);
  }

  public String getTitle() {
    if (title.length() > 512) {
      return title.substring(0, 512);
    }
    return title;
  }
}
