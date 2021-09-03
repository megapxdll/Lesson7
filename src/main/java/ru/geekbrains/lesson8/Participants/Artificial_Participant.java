package ru.geekbrains.lesson8.Participants;

public abstract class Artificial_Participant implements Abstract_Participant{

    public abstract void Run();

    public abstract void Jump();

    public abstract int Get_Max_run_length();


    public abstract int Get_Max_jump_length();
}
