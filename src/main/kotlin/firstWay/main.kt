fun main(args: Array<String>) {
    println(SingletonSecond.getInstance())
    println(SingletonSecond.getInstance())

}

class SingletonFirst private constructor() {
    companion object {
        private var mInstance: SingletonFirst? = null
        fun getInstance(): SingletonFirst {
            if (mInstance == null)
                mInstance = SingletonFirst()
            return mInstance!!
        }
    }
}

class SingletonSecond private constructor() {
    companion object {
        private var mInstance: SingletonSecond = SingletonSecond()
        fun getInstance(): SingletonSecond {
            return mInstance
        }
    }
}

class Singleton3 private  constructor(){
    companion object{
        private var mInstance: Singleton3?=null
        @Synchronized fun  getInstance(): Singleton3 {
             if(mInstance == null){
                 mInstance = Singleton3()
             }
            return mInstance!!
        }
    }
}

class Singleton3Better private  constructor(){
    companion object{
        private @Volatile var mInstance: Singleton3Better?=null
         fun  getInstance(): Singleton3Better {
             if(mInstance == null){
                 synchronized(this){
                     if(mInstance == null)
                         mInstance = Singleton3Better()
                 }
             }
            return mInstance!!
        }
      /*  @Synchronized fun sync(){

        }*/
    }
}








