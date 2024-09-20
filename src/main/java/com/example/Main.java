package com.example;

import com.example.model.XbbStudentApply;
import com.example.service.XbbStudentApplyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Main {

  public static void main(String[] args) throws Exception {
    XbbStudentApplyService xbbStudentApplyService = new XbbStudentApplyService();

    XbbStudentApply xbbStudentApply =
    xbbStudentApplyService.parseFromJsonString(jsonString);
  }

  static String jsonString = """
  {"text_18":{"value":"3","text":"开始签约"},"address_1":{"address":"","province":"","city":"","district":""},"text_16":{"avatar":"https://s1-imfile.feishucdn.com/static-resource/v1/82a979c9-4bd0-4d97-95c0-01c97dc5626g~?image_size=72x72&cut_type=&quality=&format=png&sticker_format=.webp","depSimpleTree":"","id":"ou_18aa9429ee346a6e1ebdc0689de301da","jobnumber":"000000","name":"王奇雷"},"text_10":{"checked":true,"color":"#646566","isOther":0,"isVisible":1,"text":"是","value":"3b4e3165-7e3d-71af-d8dd-332844e1245c"},"text_54":12156685,"ownerId":[{"avatar":"https://s1-imfile.feishucdn.com/static-resource/v1/82a979c9-4bd0-4d97-95c0-01c97dc5626g~?image_size=72x72&cut_type=&quality=&format=png&sticker_format=.webp","depSimpleTree":"","id":"ou_18aa9429ee346a6e1ebdc0689de301da","jobnumber":"000000","name":"王奇雷"}],"text_53":12156685,"text_12":67528599,"text_56":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"是","value":"9382f0c6-c78a-f785-48ef-11e8deb49575"},"text_11":"王奇雷","text_55":12156685,"text_50":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"等待面试","value":"cd3ce692-1b38-0049-7de7-8a095bd16a28"},"text_3":{"checked":true,"color":"#646566","isOther":0,"isVisible":1,"text":"是","value":"1"},"text_2":"513030198808076312","text_6":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"2年级","value":"05e56973-fe5f-f3dd-ef34-576e17f14bd0"},"text_9":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"本科","value":"0e1adc59-d79e-00c3-c09a-92e6148675cc"},"text_1":"陈测试","quote_4":"2026-07-28 00:00","quote_3":"15","coUserId":[],"quote_5":"2027-07-28 00:00","text_45":"测试1221","quote_2":"可报名","quote_1":"开课（未满班）","text_39":"中国","preOwnerId":[],"text_36":12156685,"text_35":"南开大学","text_38":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"是","value":"af4468ae-44eb-cb7d-c0fb-45b36502f878"},"text_37":"计算机软件","text_76":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"否","value":"bda40981-2908-1a46-8172-818d3774bc6b"},"text_34":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"有","value":"7d64146d-cc63-a864-c1cf-f86ff5d56c5f"},"text_78":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"未签约","value":"281825a8-85e9-d8b3-121b-ad68ed850cde"},"text_33":12185933,"text_77":12156685,"date_2":0,"text_73":{"checked":true,"color":"#646566","isOther":0,"isVisible":1,"text":"草稿","value":"67b21613-3ba0-e2a2-e983-9b30ce5b0df2"},"date_6":1730476800000,"date_12":1705334400000,"subForm_1":[{"text_1":{"checked":true,"color":"#646566","isOther":0,"isVisible":1,"text":"手机","value":"1"},"text_2":"86-13910304506"}],"text_25":"didxgaa","text_24":"test@test.com","text_68":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"已签约","value":"eaec4f43-6132-c570-b3ac-c8f5d8034541"},"text_65":12156685,"text_23":{"checked":false,"color":"#646566","isOther":0,"isVisible":1,"text":"女","value":"2"},"text_67":{"checked":true,"color":"#646566","isOther":0,"isVisible":1,"text":"草稿","value":"27dcf33f-6495-62bd-9e48-77d9479a420e"},"text_62":"否","num_3":0,"num_4":2}
      """;

}