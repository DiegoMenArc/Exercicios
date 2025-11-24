package exercicioslp.Ninja;

import java.util.ArrayList;

public class Gerenciador{
    static Gerenc g = new Gerenc();

    public void menu() {
        Integer e = Ninja.t.inputInt("""
                1. Nova Tarefa;
                2. Listar Tarefa;
                3. Editar Tarefa;
                4. Remover Tarefa;
                5. Marcar como Concluida;

                0. Sair
                """);
        while (e < 0 || e > 5) {
            menu();
        }
        switch (e) {
            case 1: g.novaTarefa(); menu(); break;
            case 2: g.listarT(); menu(); break;
            case 3: g.editar(); menu(); break;
            case 4: g.deletar(); menu(); break;
            case 5: g.concluir(); menu(); break;
            case 0: return;
            default: menu(); break;
        }
    }
}

class Gerenc {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void novaTarefa() {
        Tarefa t = new Tarefa();
        t.codigo = Ninja.t.inputString("Informe um nome para sua tarefa");
        t.desc = Ninja.t.inputString("Informe uma descrição para sua tarefa");
        t.conc = false;
        novaTarefa(t);
    }

    private void novaTarefa(Tarefa t) {
        this.tarefas.add(t);
    }

    public void listarT() {
        System.out.println();
        for (Integer i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            String finalizada = (t.conc) ? "X" : "";
            System.out.printf("%dº | %s | %s | ( %s ) %n", (i + 1), t.codigo, t.desc, finalizada);
        }
        Ninja.t.msg("Verfique a lista no terminal.");
    }

    public void editar() {
        Integer pos = Ninja.t.inputInt("Informe a posição da tarefa que deseja edita  r");
        String nome = Ninja.t.inputString("Informe um novo nome, caso não queria, apenas digite o nome atual");
        String desc = Ninja.t.inputString("Informe uma nova descrição, caso não queria, apenas digite a atual");

        this.editar(pos, nome, desc);
    }

    private void editar(Integer pos, String nome, String desc) {
        Tarefa t = this.tarefas.get(pos - 1);
        t.codigo = nome;
        t.desc = desc;
    }

    public void deletar() {
        Integer pos = Ninja.t.inputInt(
                "Informe a posição da tarefa que deseja remover. \nCaso não deseje deletar nenhuma tarefa, digite 0");
        if (pos == 0) {
        } else {
            this.deleter(pos);
        }
    }

    private void deleter(Integer pos) {
        this.tarefas.remove(pos - 1);
    }

    public void concluir() {
        Integer pos;
        pos = Ninja.t.inputInt("Informe a posição da tarefa que deseja concluir");
        while (pos <= 0 || pos > this.tarefas.size()) {
            this.concluir();
        }
        this.concluir(pos);
    }

    private void concluir(Integer pos) {
        Tarefa tarefa = this.tarefas.get(pos - 1);
        tarefa.conc = true;
    }
}

class Tarefa {
    public String codigo;
    public String desc;
    public Boolean conc;
}

