package com.csc;

public class OakTree {

  public static class Squirrel {
      private String name;

      public Squirrel(String name) {
          this.name = name;
      }

      public String getname() {
          return this.name;
      }
  }

  public static class node {
      private Squirrel squirrel;
      private node left;
      private node right;

      public node(Squirrel squirrel) {
          this.squirrel = squirrel;
          this.left = null;
          this.right = null;
      }

      public node left() {
          return this.left;
      }

      public node right() {
          return this.right;
      }

      public void setLeft(node left) {
          this.left = left;
      }

      public void setRight(node right) {
          this.right = right;
      }

      public Squirrel getsquirrel() {
          return this.squirrel;
      }
  }
    public static void main(String[] args) {
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");

        node nodeOne = new node(cheeks);
        node nodeTwo = new node(squeaks);
        node nodeThree = new node(fluffybutt);

        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);

        System.out.println("Root node: " + nodeOne.getsquirrel().getname());
        System.out.println("Left child: " + nodeOne.left().getsquirrel().getname());
        System.out.println("Right child: " + nodeOne.right().getsquirrel().getname());
    }
}
