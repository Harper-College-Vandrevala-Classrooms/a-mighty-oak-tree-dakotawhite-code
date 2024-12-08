package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

  OakTree tree;

  @BeforeEach
  void setUp() {
    tree = new OakTree();
  }

  @Test
  public void testsquirrel() {
        OakTree.Squirrel squirrel = new OakTree.Squirrel("Cheeks");
        assertNotNull(squirrel, "object should not be null");
        assertEquals("Cheeks", squirrel.getname(), "name should be 'Cheeks'");
    }

    @Test
    public void testnode() {
      OakTree.Squirrel squirrel = new OakTree.Squirrel("Cheeks");
      OakTree.node node = new OakTree.node(squirrel);
      assertNotNull(node, "Node object should not be null");
      assertEquals("Cheeks", node.getsquirrel().getname(), "Node should contain a squirrel with name 'Cheeks'");
  }

  @Test
  public void testleft() {
      OakTree.Squirrel squirrel1 = new OakTree.Squirrel("Cheeks");
      OakTree.Squirrel squirrel2 = new OakTree.Squirrel("Squeaks");
      OakTree.node rootnode = new OakTree.node(squirrel1);
      OakTree.node leftchild = new OakTree.node(squirrel2);
      rootnode.setLeft(leftchild);
      assertNotNull(rootnode.left(), "Left child of the node should not be null");
      assertEquals("Squeaks", rootnode.left().getsquirrel().getname(), "Left child should be 'Squeaks'");
  }

  @Test
  public void testright() {
      OakTree.Squirrel squirrel1 = new OakTree.Squirrel("Cheeks");
      OakTree.Squirrel squirrel2 = new OakTree.Squirrel("Mr. Fluffy Butt");
      OakTree.node rootnode = new OakTree.node(squirrel1);
      OakTree.node rightchild = new OakTree.node(squirrel2);
      rootnode.setRight(rightchild);
      assertNotNull(rootnode.right(), "Right child of the node should not be null");
      assertEquals("Mr. Fluffy Butt", rootnode.right().getsquirrel().getname(), "Right child should be 'Mr. Fluffy Butt'");
  }

  @Test
  public void testtree() {
      OakTree.Squirrel squirrel1 = new OakTree.Squirrel("Cheeks");
      OakTree.Squirrel squirrel2 = new OakTree.Squirrel("Squeaks");
      OakTree.Squirrel squirrel3 = new OakTree.Squirrel("Mr. Fluffy Butt");
      OakTree.node rootnode = new OakTree.node(squirrel1);
      OakTree.node leftchild = new OakTree.node(squirrel2);
      OakTree.node rightchild = new OakTree.node(squirrel3);
      rootnode.setLeft(leftchild);
      rootnode.setRight(rightchild);
      assertEquals("Cheeks", rootnode.getsquirrel().getname(), "Root node is 'Cheeks'");
      assertEquals("Squeaks", rootnode.left().getsquirrel().getname(), "Left child is 'Squeaks'");
      assertEquals("Mr. Fluffy Butt", rootnode.right().getsquirrel().getname(), "Right child is 'Mr. Fluffy Butt'");
  }  
}
