class Queue<E> : LinkedListKt<E>() {
    fun queue(item: E) {
        container.add(item)
    }

    fun pop(): E? {
        if (isEmpty) {
            return null
        }
        return container.removeFirst()
    }

    fun poll(): E? {
        if (isEmpty) {
            return null
        }
        return container.peekFirst()
    }
}