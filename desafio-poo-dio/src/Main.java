import java.time.LocalDate;

import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);
        System.out.println();

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(10);

        System.out.println(curso2);
        System.out.println();


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println();


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devHenrique.getConteudosInscritos());
        devHenrique.progredir();
        System.out.println("Conteúdos Inscritos: " + devHenrique.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devHenrique.getConteudosConcluidos());
        System.out.println("XP: " + devHenrique.calcularXP());
        System.out.println();

        Dev devTheo = new Dev();
        devTheo.setNome("Théo");
        devTheo.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devHenrique.getConteudosInscritos());
        devTheo.progredir();
        devTheo.progredir();
        devTheo.progredir();
        System.out.println("Conteúdos Inscritos: " + devHenrique.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devHenrique.getConteudosConcluidos());
        System.out.println("XP: " + devTheo.calcularXP());
        System.out.println();
    }
}