package se.cag;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("A stack")
class StackTest {
    Stack stack;

    @Test
    @DisplayName("is instantiated with new Stack()")
    void isInstantiatedWithNew() {
        stack = new Stack();
    }

    @Nested
    @DisplayName("when new")
    class WhenNew {

        @Test
        @DisplayName("is empty")
        void isEmpty() {
            stack = new Stack();
            assertTrue(stack.isEmpty());
        }

        @Test
        @DisplayName("throws EmptyStackException when popped")
        void throwsExceptionWhenPopped() { /*...*/ }

        @Test
        @DisplayName("throws EmptyStackException when peeked")
        void throwsExceptionWhenPeeked() { /*...*/ }

        @Nested
        @DisplayName("after pushing an element")
        class AfterPushing {

            @Test
            @DisplayName("it is no longer empty")
            void isEmpty() {
                stack = new Stack();
                stack.push(new String());
                assertTrue(stack.size() > 0);
            }

            @Test
            @DisplayName("returns the element when popped and is empty")
            void returnElementWhenPopped() {
                stack = new Stack();

                String s = new String();
                stack.push(s);
                assertSame(s, stack.pop());
                assertTrue(stack.size() == 0);
            }

            @Test
            @DisplayName("returns the element when peeked but remains not empty")
            void returnElementWhenPeeked(){
                stack = new Stack();
                String s1 = new String();
                stack.push(s1);
                assertSame(s1, stack.peek());
                assertTrue(stack.size() == 1);

            }
        }
    }
}