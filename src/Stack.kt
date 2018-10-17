class Stack<E> : LinkedListKt<E>() {
    fun push(item: E) {
        addLast(item)
    }

    fun peek() : E? {
        if (isEmpty) {
            return null
        }
        return peekLast()
    }

    fun pop() : E? {
        if (isEmpty) {
            return null
        }
        return removeLast()
    }
}