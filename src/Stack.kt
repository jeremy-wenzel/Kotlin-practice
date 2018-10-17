class Stack<E> : LinkedListKt<E>() {
    fun push(item: E) {
        container.addLast(item)
    }

    fun peek() : E? {
        if (isEmpty) {
            return null
        }
        return container.peekLast()
    }

    fun pop() : E? {
        if (isEmpty) {
            return null
        }
        return container.removeLast()
    }
}