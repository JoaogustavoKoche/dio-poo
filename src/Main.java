import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("curso de java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("javas");
        mentoria1.setDescricao("desck");
        mentoria1.setDate(LocalDate.now());

        System.out.println(mentoria1);
    }
}