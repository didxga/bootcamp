package com.example.service;

import com.example.model.XbbStudentApply;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class XbbStudentApplyService {

  public XbbStudentApply parseFromJsonString(String jsonString) throws JsonMappingException, JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    XbbStudentApply xbbStudentApply = null;
    
    JsonNode data = mapper.readTree(jsonString);
    xbbStudentApply = mapper.convertValue(data, XbbStudentApply.class);
  System.out.println(xbbStudentApply);
    return xbbStudentApply;
  }
}