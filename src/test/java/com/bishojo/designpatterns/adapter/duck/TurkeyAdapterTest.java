package com.bishojo.designpatterns.adapter.duck;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class TurkeyAdapterTest {

    private Turkey turkey = mock(WildTurkey.class);
    private final TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

    @Test
    public void testQuackMethodAdapted() {
        turkeyAdapter.quack();

        verify(turkey, times(1)).gobble();
    }

    @Test
    public void testFlyMethodAdapted() {
        turkeyAdapter.fly();

        verify(turkey, times(1)).fly();
    }
}
