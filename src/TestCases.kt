import sun.jvm.hotspot.utilities.Assert
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestCases {

    fun runStackTestCases() {
        println("Running Stack Test Cases")

        val stack = Stack<Int>()
        assertTrue(stack.isEmpty)

        stack.push(1)
        assert(stack.size == 1)
        assertFalse(stack.isEmpty)

        stack.push(2)
        assert(stack.size == 2)
        assertFalse(stack.isEmpty)

        assertTrue(stack.hasElement(2))
        assertTrue(stack.hasElement(1))

        assertEquals(2, stack.peek())
        assertEquals(2, stack.size)
        assertFalse(stack.isEmpty)

        assertEquals(2, stack.pop())
        assertEquals(1, stack.size)
        assertFalse(stack.hasElement(2))

        assertEquals(1, stack.peek())
        assertEquals(1, stack.size)
        assertTrue(stack.hasElement(1))

        assertEquals(1, stack.pop())
        assertEquals(0, stack.size)
        assertTrue(stack.isEmpty)
        assertFalse(stack.hasElement(1))

        println("Finished running Stack test cases")
    }

    fun runQueueTestCases() {
        println("Running Queue Test cases")

        val queue = Queue<Int>()
        assertTrue(queue.isEmpty)
        assertEquals(0, queue.size)

        queue.queue(1)
        queue.queue(2)

        assertEquals(2, queue.size)
        assertFalse(queue.isEmpty)

        assertTrue(queue.hasElement(2))
        assertTrue(queue.hasElement(1))
        assertFalse(queue.hasElement(0))

        assertEquals(1, queue.poll())

        assertEquals(2, queue.size)
        assertFalse(queue.isEmpty)

        assertEquals(1, queue.pop())
        assertEquals(1, queue.size)
        assertFalse(queue.hasElement(1))
        assertTrue(queue.hasElement(2))

        assertEquals(2, queue.poll())
        assertEquals(1, queue.size)
        assertFalse(queue.isEmpty)

        assertEquals(2, queue.pop())
        assertEquals(0, queue.size)
        assertTrue(queue.isEmpty)
        assertFalse(queue.hasElement(2))

        println("Finished Running Queue Test Cases")
    }
}