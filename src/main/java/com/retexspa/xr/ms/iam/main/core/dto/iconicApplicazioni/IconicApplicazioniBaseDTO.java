package com.retexspa.xr.ms.iam.main.core.dto.iconicApplicazioni;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class IconicApplicazioniBaseDTO {

    @NotNull(message = "codice is mandatory")
    @NotEmpty(message = "codice is mandatory")
    @NotBlank(message = "codice is mandatory")
    private String codice;

    @NotNull(message = "nome is mandatory")
    private String nome;
    private String descrizione;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @JsonIgnore
    public String getAggregateId() {
        return UUID.randomUUID().toString();
    }

    public static String getAggregateName() {
        return "IconicApplicazioniAggregate";
    }

    public static String getName() {
        return "IconicApplicazioni";
    }
}
