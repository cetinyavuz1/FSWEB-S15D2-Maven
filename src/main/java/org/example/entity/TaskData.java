package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks = new HashSet<>();
    private Set<Task> bobsTasks = new HashSet<>();
    private Set<Task> carolsTasks = new HashSet<>();
    private Set<Task> unassignedTasks= new HashSet<>();
    private Set<Task> allTasks = new HashSet<>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name){
        switch (name){
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "all":
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;
            default:
                return unassignedTasks;
        }
    }

    public Set<Task> getUnion(Set<Task> task, Set<Task> task2){
        Set<Task> newSet = new HashSet<>();
        newSet.addAll(task);
        newSet.addAll(task2);
        return newSet;
    }

    public Set<Task> getIntersection(Set<Task> task, Set<Task> task2){
        Set<Task> newSet = new HashSet<>();
        newSet.addAll(task);
        newSet.retainAll(task2);
        return newSet;
    }

    public Set<Task> getDifferences(Set<Task> task, Set<Task> task2){
        Set<Task> newSet = new HashSet<>();
        newSet.addAll(task);
        newSet.removeAll(task2);
        return newSet;
    }
}
