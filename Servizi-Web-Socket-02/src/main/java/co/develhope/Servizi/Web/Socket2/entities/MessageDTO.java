package co.develhope.Servizi.Web.Socket2.entities;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MessageDTO {

    private String sender;
    private String type;
    private String message;
}
