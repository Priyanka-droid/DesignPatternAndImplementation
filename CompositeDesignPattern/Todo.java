package CompositeDesignPattern;

import java.util.ArrayList;

interface Todo {
    int getDays();
    String getName();
    void display();
}


class Task implements Todo{
    private int days;
    private String name;
    Task(int days, String name) {
        this.days=days;
        this.name=name;
    }
    @Override
    public int getDays(){
        return days;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void display(){
        System.out.println(String.format("Task:%s\n", name)) ;
    }
}

class TaskList implements Todo{
    private ArrayList<Todo> todos;
    // private int days;
    private String name;

    
    TaskList(String name) {
        this.name=name;
        this.todos= new ArrayList<>();
    }

    @Override
    public int getDays(){
        int days=0;
        for (Todo todo : todos) {
            days=days+todo.getDays();
        }
        return days;
    }

    @Override
    public String getName(){
        return name;
    }

    public void addTask(Todo task){
        todos.add(task);
    }

    public void removeTask(Todo task){
        todos.remove(task);
    }

    @Override
    public void display(){
        System.out.println(String.format("Task list:%s\n", name)) ;
        for (Todo todo : todos) {
            todo.display();
        }
         
    }


}

