package br.edu.unisep.hellospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageDto {

    private String content;

    private String destination;

}
