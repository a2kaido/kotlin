package test

import java.util.*

public open class MethodWithVararg : Object() {
    public open fun foo(vararg s : String) {
        throw UnsupportedOperationException()
    }
}
