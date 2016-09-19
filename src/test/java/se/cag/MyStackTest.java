package se.cag;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("A stack")
class MytackTest {
    MyStack myStack;

    @Test
    @DisplayName("is instantiated with new Stack()")
    void isInstantiatedWithNew() {
        MyStack myStack  = new MyStack();
    }

    @Nested
    @DisplayName("when new")
    class WhenNew {

        @Test
        @DisplayName("is empty")
        void isEmpty() {
            myStack  = new MyStack();
            assertTrue(myStack.isEmpty());
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
                myStack  = new MyStack();
                myStack.push(new String());
                assertTrue(myStack.size() > 0);
            }

            @Test
            @DisplayName("returns the element when popped and is empty")
            void returnElementWhenPopped() {
                myStack  = new MyStack();

                String s = new String();
                myStack.push(s);
                assertSame(s, myStack.pop());
                assertTrue(myStack.size() == 0);
            }

            @Test
            @DisplayName("returns the element when peeked but remains not empty")
            void returnElementWhenPeeked(){
                myStack  = new MyStack();
                String s1 = new String();
                myStack.push(s1);
                assertSame(s1, myStack.peek());
                assertTrue(myStack.size() == 1);

            }
        }
    }
}