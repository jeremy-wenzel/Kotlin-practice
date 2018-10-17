open class LinkedListKt<E> {

    private var headNode: Node<E>? = null
    private var tailNode: Node<E>? = null

    private var _size: Int = 0
    var size: Int
        get() {
            return _size
        }
        private set(value) {
            _size = value
        }

    val isEmpty get() = size == 0

    fun hasElement(element: E) : Boolean {
        var currentNode = headNode
        while (currentNode != null) {
            if (currentNode.value == element) {
                return true
            }
            currentNode = currentNode.tail
        }
        return false
    }

    fun peekFirst(): E? {
        return headNode?.value
    }

    fun removeFirst(): E? {
        val returnNode = headNode?.value

        headNode = headNode?.tail
        headNode?.head = null
        --size

        if (size == 0) {
            tailNode = null
        }
        return returnNode
    }

    fun addLast(item: E) {
        var newNode: Node<E> = Node(item)
        ++size

        // Edge case first node is null
        if (headNode == null) {
            headNode = newNode
            tailNode = newNode
            return
        }

        // Regular case. Append to tail node
        newNode.head = tailNode
        tailNode?.tail = newNode
        tailNode = newNode
    }

    fun peekLast() : E? {
        return tailNode?.value
    }

    fun removeLast(): E? {
        var returnValue = tailNode?.value

        tailNode = tailNode?.head
        tailNode?.tail = null
        --size

        if (size == 0) {
            headNode = null
        }

        return returnValue
    }

    private inner class Node<E>(val value: E) {
        var head: Node<E>? = null
        var tail: Node<E>? = null
    }
}