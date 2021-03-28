package com.bishojo.designpatterns.strategy.test;

import com.bishojo.designpatterns.strategy.behaviour.fly.FlyBehaviour;
import com.bishojo.designpatterns.strategy.behaviour.fly.FlyRocketPower;
import com.bishojo.designpatterns.strategy.behaviour.quack.MuteQuack;
import com.bishojo.designpatterns.strategy.behaviour.quack.QuackBehaviour;
import com.bishojo.designpatterns.strategy.duck.MallardDuck;
import com.bishojo.designpatterns.test.helpers.AbstractStreamTest;
import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

public class MallardDuckTest extends AbstractStreamTest {

    private final MallardDuck mallardDuck = spy(MallardDuck.class);

    @Test
    @DisplayName("testCanQuack")
    public void testCanQuack() {
        mallardDuck.performQuack();
        Assertions.assertEquals("I quack!", outContent.toString().trim());
    }

    @Test
    @DisplayName("testCanFly")
    public void testCanFly() {
        mallardDuck.performFly();
        Assertions.assertEquals("I Can fly with wings", outContent.toString().trim());
    }

    @Test
    @DisplayName("testQuackBehaviourSet")
    public void testQuackBehaviourSet()
    {
        Assertions.assertTrue(mallardDuck.getQuackBehaviour() instanceof QuackBehaviour);
    }

    @Test
    @DisplayName("testFlyBehaviourSet")
    public void testFlyBehaviourSet()
    {
        Assertions.assertTrue(mallardDuck.getFlyBehaviour() instanceof FlyBehaviour);
    }

    @Test
    @DisplayName("testQuackBehaviourCanBeDynamiclySet")
    public void testQuackBehaviourCanBeDynamiclySet()
    {
        mallardDuck.setQuackBehaviour(new MuteQuack());

        mallardDuck.performQuack();
        Assertions.assertEquals("I can't quack!", outContent.toString().trim());
    }

    @Test
    @DisplayName("testFlyBehaviourCanBeDynamiclySet")
    public void testFlyBehaviourCanBeDynamiclySet()
    {
        mallardDuck.setFlyBehaviour(new FlyRocketPower());

        mallardDuck.performFly();
        Assertions.assertEquals("I fly with rocket power!", outContent.toString().trim());
    }
}
