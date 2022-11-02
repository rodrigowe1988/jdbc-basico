package exercise;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CursoDAO cursoDAO = new CursoDAO();

        // =========================== 1 - Consulta =================================================

        List<Curso> cursos = cursoDAO.list();

        cursos.stream().forEach(System.out::println);

        // ======================= 1.1 - Consulta com filtro ========================================

        Curso cursoParaConsulta = cursoDAO.getById(1);

        System.out.println(cursoParaConsulta);


        // =========================== 2 - Inserção =================================================




        // =========================== 3 - Delete ===================================================



        // =========================== 4 - Atualizar ================================================

    }
}
