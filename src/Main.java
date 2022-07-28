import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setDescricao("teste");
        curso1.setTitulo("teste");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Angular");
        curso2.setDescricao("FullStack");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("BackEnd");
        mentoria1.setDescricao("Pesada");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootCamp = new Bootcamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao(" Bootcamp Java Developer junior");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev dev001 = new Dev();
        dev001.setNome("willian");
        dev001.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos Willian: " + dev001.getConteudosInscritos());
        dev001.progredir();
        dev001.progredir();
        System.out.println("-$-");
        System.out.println("conteudos Inscritos  Willian: "+ dev001.getConteudosInscritos());
        System.out.println("conteudos Inscritos Willian: "+ dev001.getConteudosConcluidos());
        System.out.println("XP:" + dev001.calcularTotalXp());

        System.out.println("----------------------------------------------------");

        Dev dev002 = new Dev();
        dev002.setNome("escarlata");
        dev002.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos escarlata: " + dev002.getConteudosInscritos());
        dev002.progredir();
        System.out.println("-$-");
        System.out.println("conteudos Inscritos  Escarlata: "+ dev002.getConteudosInscritos());
        System.out.println("conteudos Inscritos Escarlata: "+ dev002.getConteudosConcluidos());
        System.out.println("XP:" + dev002.calcularTotalXp());

    }
}
