package factory.firstway

abstract  class  Pizza {
    abstract  fun prepare()
    abstract  fun bake()
    abstract  fun cut()
    abstract  fun box()
}

class CheezePizza: Pizza() {
    override fun prepare() {
        println("prepare:cheezePizza")
    }

    override fun bake() {
        println("bake:cheezePizza")
    }

    override fun cut() {
        println("cut:cheezePizza")
    }

    override fun box() {
        println("box:cheezePizza")
    }

}

class PeproniPizza: Pizza() {
    override fun prepare() {
        println("prepare:PeproniPizza")
    }

    override fun bake() {
        println("bake:PeproniPizza")
    }

    override fun cut() {
        println("cut:PeproniPizza")
    }

    override fun box() {
        println("box:PeproniPizza")
    }

}
