package IPattern;

import CR.Task;

import java.util.ArrayList;
import java.util.List;

class TaskList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public TaskIterator iterator() {
        return new TaskIterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < tasks.size();
            }

            @Override
            public Task next() {
                if (hasNext()) {
                    return tasks.get(index++);
                }
                return null;
            }
        };
    }
}
