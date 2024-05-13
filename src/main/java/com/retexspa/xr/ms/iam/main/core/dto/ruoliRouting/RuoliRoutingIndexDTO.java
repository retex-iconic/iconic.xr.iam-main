package com.retexspa.xr.ms.iam.main.core.dto.ruoliRouting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.LinkedList;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuoliRoutingIndexDTO {
    private String ruoliRoutingId;
    private LinkedList<String> ruoliRoutingSectionsIds;
    public RuoliRoutingIndexDTO(){}
    public RuoliRoutingIndexDTO(String ruoliRoutingId) {
        this.ruoliRoutingId = ruoliRoutingId;
    }
    public static String getIdFromRuoliRouting(String ruoliRoutingId) {
        return UUID.nameUUIDFromBytes(("/RuoliRoutingIndex/" + ruoliRoutingId).getBytes()).toString();
    }

    public String getRuoliRoutingId() {
        return ruoliRoutingId;
    }

    public void setRuoliRoutingId(String ruoliRoutingId) {
        this.ruoliRoutingId = ruoliRoutingId;
    }

    public LinkedList<String> getRuoliRoutingSectionsIds() {
        return ruoliRoutingSectionsIds;
    }

    public void setRuoliRoutingSectionsIds(LinkedList<String> ruoliRoutingSectionsIds) {
        this.ruoliRoutingSectionsIds = ruoliRoutingSectionsIds;
    }

    public static String getDetailNameRuoliRoutingSection() {
        return "ruoliRoutingSectionsIds";
      }

    

}
