package edu.br.femass.femassbank.controller.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Movimento {
    private Long id;
    private String label;
    private String value;
    private String date;
    private Integer tipo;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    
    public static List<Movimento> getMovimentos() {
        List<Movimento> movimentos = new ArrayList<Movimento>();

        LocalDate dataInicio = LocalDate.of(2023, 1, 1);
        for (int i=1;i<10;i++) {
            Movimento movimento = new Movimento();
            movimento.setId(Long.valueOf(i));
            movimento.setDate(dataInicio.plusDays(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            movimento.setTipo(i%2);
            movimento.setValue(String.valueOf(i*100));
            movimento.setLabel("Movimento "+ String.valueOf(i));
            movimentos.add(movimento);

        }
        return movimentos;
    }
    
}
