import java.util.*

abstract class LinkedListKt<E> {

    protected val container: LinkedList<E> = LinkedList()

    val size get() = container.size

    val isEmpty get() = size == 0

    fun hasElement(element: E) : Boolean {
        val iterator = container.iterator()
        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                return true
            }
        }
        return false
    }
}