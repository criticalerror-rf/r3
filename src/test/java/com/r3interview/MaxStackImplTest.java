package com.r3interview;

import org.junit.jupiter.api.Test;

public class MaxStackImplTest {

    @Test
    void testPushAndPop()
    {
        int pushedElement=25;
        MaxStack maxStack=new MaxStackImpl();
        maxStack.push(pushedElement);
        assert(maxStack.pop()==pushedElement);
    }
    @Test
    void testMaxElement()
    {
        MaxStack maxStack=new MaxStackImpl();
        for(int i=1;i<26;i++)
        {
            maxStack.push(i);
        }
        assert(maxStack.getMax()==25);
    }
    @Test
    void testEmptyStack()
    {
        MaxStack maxStack=new MaxStackImpl();
        assert(maxStack.pop()==-1);
    }
    @Test
    void testPush()
    {
        MaxStack maxStack=new MaxStackImpl();
        maxStack.push(1);//maxList{1}
        maxStack.push(2);//maxList{1,2}
        maxStack.push(5);//maxList{1,2,5}
        maxStack.push(5);//maxList{1,2,5,5}
        maxStack.push(2);//maxList{1,2,5,5}
        maxStack.push(5);//maxList{1,2,5,5,5}
        assert(maxStack.getMax()==5);
        maxStack.pop();
        assert(maxStack.getMax()==5);
        maxStack.pop();
        assert(maxStack.getMax()==5);
        maxStack.pop();
        assert(maxStack.getMax()==5);
        maxStack.pop();
        assert(maxStack.getMax()==2);


    }
}
