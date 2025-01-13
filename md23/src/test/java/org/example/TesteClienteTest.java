package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.example.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente(){
        List<Pessoa> cli = new Pessoa().pessoas();

        Stream<Pessoa> listaMulher = cli.stream().
                filter(pessoa -> pessoa.getSexo().
                        equals("feminino"));


        Assert.assertEquals("feminino",listaMulher);
    }

}
