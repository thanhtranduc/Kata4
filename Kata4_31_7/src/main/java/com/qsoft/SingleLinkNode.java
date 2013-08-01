package com.qsoft;

/**
 * User: thanhtd
 * Date: 31/07/2013
 * Time: 13:43
 */
public class SingleLinkNode
{
    SingleLinkNode nextNode;
    private Object value;
    public SingleLinkNode getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(SingleLinkNode head)
    {
        this.nextNode = head;
    }

    public void setValue(Object object)
    {
        this.value = object;
    }

    public Object getValue()
    {
        return value;
    }
}
