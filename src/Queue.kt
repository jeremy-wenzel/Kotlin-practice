class Queue<E> : LinkedListKt<E>() {
    fun queue(item: E) {
        addLast(item)
    }

    fun pop(): E? {
        if (isEmpty) {
            return null
        }
        return removeFirst()
    }

    fun poll(): E? {
        if (isEmpty) {
            return null
        }
        return peekFirst()
    }
}