package it.epicode.springintro.entities;

import it.epicode.springintro.enums.TableStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor

public class Table {
    private int id;
    private int maxPlaceSettings;
    private TableStatus tableStatus;
}
