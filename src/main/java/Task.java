/**
 * Task class to store the states whether task is complete or not
 */
public class Task {
    /**
     * boolean state to store completed or not.
     */
    private boolean completed;

    /**
     * name of task.
     */
    private String taskName;


    /**
     * Constructor to initialize class.
     *
     * @param name task name
     */
    public Task(String name, boolean init, boolean completed) {
        taskName = name;
        this.completed = completed;
    }

    /**
     * sets complete to true.
     */
    public void mark() {
        completed = true;
        System.out.printf(
                "    ____________________________________________________________\n" +
                        "     Nice! I've marked task %s as done:\n" +
                        "     " + this.toString() + "\n" +
                        "    ____________________________________________________________\n", taskName);
    }

    /**
     * sets complete to false.
     */
    public void unMark() {
        completed = false;
        System.out.printf(
                "    ____________________________________________________________\n" +
                        "     Ok, I've marked task %s as not done yet:\n" +
                        "     " + this.toString() + "\n" +
                        "    ____________________________________________________________\n", taskName);
    }

    /**
     * Printed message when object is created.
     */
    public void addMessage() {
        System.out.printf(
                "    ____________________________________________________________\n" +
                        "     added: %s\n" +
                        "    ____________________________________________________________\n", taskName);
    }

    /**
     * gives task type.
     *
     * @return task type code.
     */
    public String taskType() {
        return "";
    }

    /**
     * returns task name.
     *
     * @return task name.
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * returns completed attribute.
     *
     * @return completed.
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * returns the dates if possible.
     *
     * @return date.
     */
    public String getDate() {
        return "";
    }

    /**
     * Creates a String representation of Task.
     */
    public String toString() {
        String marked = "[ ]";
        if (completed) {
            marked = "[X]";
        }
        return marked + " " + taskName;
    }
}
