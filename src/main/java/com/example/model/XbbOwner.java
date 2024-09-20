package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class XbbOwner {
  private String id;
  private String name;
  private String jobNumber;

  @Override
  public String toString() {
    return id;
  }
}
