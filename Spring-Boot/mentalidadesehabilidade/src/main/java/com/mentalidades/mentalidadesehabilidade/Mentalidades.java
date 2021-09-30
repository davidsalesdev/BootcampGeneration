package com.mentalidades.mentalidadesehabilidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;


@RestController
@RequestMapping("/mentalidades")

public class Mentalidades {

    @GetMapping
    public ArrayList<String> hello() {
        int a;
        int b;
        somar(a, b);

        //return new ArrayList<>(Arrays.asList("Atenção aos Detalhes", "Proatividade", "Persistência"));
    }

    private void somar(int a, int b) {
        int c = a + b;
    }
}