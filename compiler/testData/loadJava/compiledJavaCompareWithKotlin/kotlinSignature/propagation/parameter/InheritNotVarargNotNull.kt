package test

public trait InheritNotVarargNotNull: Object {

    public trait Super: Object {
        public fun foo(p: Array<out String>)

        public fun dummy() // to avoid loading as SAM interface
    }

    public trait Sub: Super {
        override fun foo(p: Array<out String>)
    }
}
