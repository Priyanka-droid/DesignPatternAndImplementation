package CompositeDesignPattern;

public class CompositePattern {
    public static void main(String[] args) {
        Todo singleTask1= new Task(2,"task1");
        Todo singleTaks2=new Task(3,"task2");
        TaskList taskList1= new TaskList("taskList1");
        taskList1.addTask(singleTask1);
        taskList1.addTask(singleTaks2);
        TaskList taskList2= new TaskList("taskList2");
        Todo singleTaks3=new Task(4,"task3");
        taskList2.addTask(singleTaks3);
        taskList1.addTask(taskList2);

        System.out.println(taskList1.getDays());
        taskList1.display();

    }
}
