package pl.sda.gdajava25;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OfertaSprzedaży {
   private String nazwaProduktu;
   private double cena;
}
