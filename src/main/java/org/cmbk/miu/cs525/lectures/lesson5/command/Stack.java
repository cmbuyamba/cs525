package org.cmbk.miu.cs525.lectures.lesson5.command;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class Stack {
    private List<Integer> list = new ArrayList();

    public Integer pop() {
        Integer top = null;
        Iterator iter = list.iterator();
        if (iter.hasNext()) {
            top = (Integer) iter.next();
            iter.remove();
        }
        printStack();
        return top;
    }

    public void push(Integer value) {
        list.add(value);
        printStack();
    }

    public void printStack() {
        System.out.println("current stack ------");
        for (Integer i : list) {
            System.out.println("--" + i);
        }
        System.out.println("end of stack ------");
    }
}
