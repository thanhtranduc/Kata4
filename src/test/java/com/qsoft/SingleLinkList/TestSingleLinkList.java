package com.qsoft.SingleLinkList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * User: thanhtd
 * Date: 30/07/2013
 * Time: 23:26
 */
public class TestSingleLinkList
{
    public SingleLinkList singleLinkList;

    @Before
    public void setUp()
    {
        singleLinkList = null;
        singleLinkList = new SingleLinkList();
    }

    @Test
    public void testInitSingleLinkList()
    {
        assertEquals(singleLinkList.getSize(),0);
    }

    @Test
    public void testInitFromArrayOfObject(){
        List<Object> listObject = new ArrayList<Object>();
        listObject.add(new Object());
        listObject.add(new Object());
        listObject.add(new Object());
        singleLinkList = new SingleLinkList(listObject);
        assertEquals(3,singleLinkList.getSize());
        assertEquals(singleLinkList.getFirstNode().getValue(),listObject.get(2));
        assertEquals(singleLinkList.getFirstNode().getNextNode().getValue(),listObject.get(1));
    }

    @Test
    public void testFindObjectInTheList(){
        List<Object> objectList = new ArrayList<Object>();
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        singleLinkList = new SingleLinkList(objectList);
        assertEquals(singleLinkList.find(objectList.get(2)),singleLinkList.getFirstNode());
    }

    @Test
    public void testFindObjectHaveNotInTheList(){
        assertEquals(singleLinkList.find(new Object()),null);
    }

    @Test
    public void testGetTheFirstNode(){
        List<Object> objectList = new ArrayList<Object>();
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        singleLinkList = new SingleLinkList(objectList);
        assertEquals(singleLinkList.find(objectList.get(2)),singleLinkList.getFirstNode());
        assertEquals(singleLinkList.find(objectList.get(1)),singleLinkList.getFirstNode().getNextNode());
        assertEquals(singleLinkList.find(objectList.get(0)),singleLinkList.getFirstNode().getNextNode().getNextNode());
    }

}
