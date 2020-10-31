package Trabalho11.Exercicio2_3;

import java.util.function.Predicate;

public class IsSony<E> implements Predicate<Eletrodomestico> {
    @Override
    public boolean test(Eletrodomestico eletrodomestico) {
        return eletrodomestico.getMarca().equals("Sony");
    }
}
