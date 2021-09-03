package ru.geekbrains.lesson8.Participants;

public abstract class Natural_Participant implements Abstract_Participant{


    public void Run(String label, int Max_run_length) {
        System.out.printf("%s runs: %s m %n", label, Max_run_length);
    }

    public void Jump(String label, int Max_jump_length) {
        System.out.printf("%s jumps: %s m %n", label, Max_jump_length);
    }
}

