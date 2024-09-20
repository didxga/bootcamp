package com.example.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XbbStudentPhoneSubForm {

  private String text_1;
  private String text_2;

  static class XbbStudentPhoneSubFormDeserializer extends JsonDeserializer<XbbStudentPhoneSubForm[]> {

      @Override
      public XbbStudentPhoneSubForm[] deserialize(JsonParser jp, DeserializationContext ctxt)
              throws IOException, JsonProcessingException {
          ObjectMapper mapper = (ObjectMapper) jp.getCodec();
          JsonNode arrayNode = mapper.readTree(jp);

          List<XbbStudentPhoneSubForm> formList = new ArrayList<>();

          if (arrayNode.isArray()) {
              for (JsonNode objectNode : arrayNode) {
                  XbbStudentPhoneSubForm form = new XbbStudentPhoneSubForm();

                  JsonNode text1Node = objectNode.get("text_1");
                  if (text1Node != null && text1Node.isObject()) {
                      form.setText_1(text1Node.get("text").asText());
                  } else if (text1Node != null) {
                      form.setText_1(text1Node.asText());
                  }

                  JsonNode text2Node = objectNode.get("text_2");
                  if (text2Node != null) {
                      form.setText_2(text2Node.asText());
                  }

                  formList.add(form);
              }
          }

          return formList.toArray(new XbbStudentPhoneSubForm[0]);
      }
  }
}
