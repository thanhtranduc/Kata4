package com.qsoft.SingleLinkList;

/**
 * User: thanhtd
 * Date: 24/07/2013
 * Time: 13:56
 */
public class SingleLinkNode
{
    private int element;
    SingleLinkNode next;
    private Object value;

    public SingleLinkNode()
    {
        element = 0;
        next = null;
    }

    public SingleLinkNode getNext()
    {
        return next;
    }

    public int getElement()
    {
        return element;
    }

    public SingleLinkNode getNextNode()
    {
        return next;
    }

    public void setValue(Object object)
    {
        this.value = object;
    }

    public void setNextNode(SingleLinkNode head)
    {
        this.next = head;
    }

    public Object getValue()
    {
        return value;  //To change body of created methods use File | Settings | File Templates.
    }
}
