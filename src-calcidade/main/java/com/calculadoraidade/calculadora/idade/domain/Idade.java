package com.calculadoraidade.calculadora.idade.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Idade {
    public static int calculaIdade(java.util.Date dataNasc) {

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(dataNasc);
        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            idade--;
        }
        else
        {
            if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }
        return idade;
    }
    public static int resultadoIdade(String data) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdf.parse(data);
        int idade = calculaIdade(dataNascimento);

        return idade;
    }

}
