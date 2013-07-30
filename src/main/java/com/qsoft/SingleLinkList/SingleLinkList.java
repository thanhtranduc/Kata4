package com.qsoft.SingleLinkList;

import java.util.List;

/**
 * User: thanhtd
 * Date: 24/07/2013
 * Time: 13:56
 */
public class SingleLinkList
{
    SingleLinkNode head;
    SingleLinkList(){
        head = null;
    }

    public SingleLinkList(List<Object> listObject)
    {
        for(Object object:listObject)
        {
            SingleLinkNode listNode = new SingleLinkNode();
            listNode.setValue(object);
            listNode.setNextNode(head);
            head = listNode;
        }
    }

    public int getSize()
    {
        int result = 0;
        for(SingleLinkNode node = head; node != null; node = node.getNextNode()){
            result++;
        }
        return result;
    }

    public SingleLinkNode getFirstNode()
    {
        return head;
    }

    public SingleLinkNode find(Object object)
    {
        for (SingleLinkNode node = head; node != null; node = node.getNextNode())
        {
            if (node.getValue().equals(object))
                return node;
        }
        return null;
    }
}
