package it.epicode.springintro.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Parameters {
    @Value("${placeSettingsFee}")
    double placeSettingsFee;
}
