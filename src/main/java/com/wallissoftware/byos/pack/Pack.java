package com.wallissoftware.byos.pack;

import lombok.Data;
import lombok.Value;

import java.util.List;

@Data
public class Pack {

  private String name;

  private List<UrlInfo> urls;
}
