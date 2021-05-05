package factory.thirdway

interface Dough {}
interface Sauce {}
interface Cheese {}
interface Vegie {}
interface Pepperoni {}
interface Calm {}
class ThinCrustDough : Dough {
    init {
        println("ThinCrustDough")
    }
}

class ThickCrustDough : Dough {
    init {
        println("ThickCrustDough")
    }
}

class RedSauce : Sauce {
    init {
        println("Red sauce")
    }
}

class BlackSauce : Sauce {
    init {
        println("Black sauce")
    }
}

class MoldCheese : Cheese {
    init {
        println("mold cheese")
    }
}

class GravyCheese : Cheese {
    init {
        println("Gravy cheese")
    }
}

class Onion : Vegie { init {
    println("onion")
}
}

class Tomato : Vegie { init {
    println("Tomato")
}
}

class Garlic : Vegie { init {
    println("Garlic")
}
}

class SalmonPepperoni : Pepperoni {init {
    println("Salmon Pepperoni")
}
}

class DilutedPepperoni : Pepperoni {init {
    println("Diluted Pepperoni")
}
}

class FreshCalm : Calm {
    init {
        println("Fresh calm")
    }
}