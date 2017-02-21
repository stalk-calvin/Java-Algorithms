/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Composite;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class CompositeTest {
    Composite fixture;
    @Before
    public void setUp() {
        fixture = new Row( 1 );          // Row1
        Composite second = new Col( 2 );          //   |
        Composite third  = new Col( 3 );          //   +-- Col2
        Composite fourth = new Row( 4 );          //   |     |
        Composite fifth  = new Row( 5 );          //   |     +-- 7
        fixture.add( second );                      //   +-- Col3
        fixture.add( third  );                      //   |     |
        third.add( fourth );                      //   |     +-- Row4
        third.add( fifth  );                      //   |     |     |
        fixture.add(  new Primitive( 6 ) );         //   |     |     +-- 9
        second.add( new Primitive( 7 ) );         //   |     +-- Row5
        third.add(  new Primitive( 8 ) );         //   |     |     |
        fourth.add( new Primitive( 9 ) );         //   |     |     +-- 10
        fifth.add(  new Primitive(10 ) );
    }

    @Test
    public void shouldTraverseInorder() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);

        fixture.traverse();

        InOrder inOrder = Mockito.inOrder(ps);
        inOrder.verify(ps).print("Row");
        inOrder.verify(ps).print("1" + " ");
        inOrder.verify(ps).print("Col");
        inOrder.verify(ps).print("2" + " ");
        inOrder.verify(ps).print("7" + " ");
        inOrder.verify(ps).print("Col");
        inOrder.verify(ps).print("3" + " ");
        inOrder.verify(ps).print("Row");
        inOrder.verify(ps).print("4" + " ");
        inOrder.verify(ps).print("9" + " ");
        inOrder.verify(ps).print("Row");
        inOrder.verify(ps).print("5" + " ");
        inOrder.verify(ps).print("10" + " ");
        inOrder.verify(ps).print("8" + " ");
        inOrder.verify(ps).print("6" + " ");
    }

}
