package com.r3interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxStackImpl implements MaxStack{
    int maxElement=0;
    List<Integer> maxList;
    Stack<Integer> internalStack;
    public MaxStackImpl()
    {
        internalStack=new Stack<>();
        maxList=new ArrayList<>();
    }

    @Override
    public void push(int element)
    {
        if(element >=maxElement) {
            maxElement = element;
            maxList.add(element);
        }
        internalStack.push(element);
    }
    @Override
    public int pop()
    {
        int returnElement=-1;
        if(!internalStack.empty()) {
            returnElement = internalStack.pop();
            if(returnElement==maxList.get(maxList.size()-1))
                maxList.remove(maxList.size()-1);

            maxElement=maxList.get(maxList.size()-1);
        }
        return returnElement;
    }
    @Override
    public int getMax()
    {
        if(maxList.size() > 0)
            return maxList.get(maxList.size()-1);
        else
        return 0;
    }
}
