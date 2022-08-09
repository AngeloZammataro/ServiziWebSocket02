package co.develhope.Servizi.Web.Socket2.entities;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientMessageDTO {

    private String clientName;
    private String clientAlert;
    private String clientMsg;
}
