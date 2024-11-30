package ca.gbc.orderservice.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OderPlacedEvent {

    private String orderNumber;
    private String email;

}
