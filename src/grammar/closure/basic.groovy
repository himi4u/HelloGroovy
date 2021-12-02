package grammar.closure
/**
 * 闭包概念 闭包定义：一个代码块
 *         闭包的调用
 *
 * 闭包参数  普通参数
 *          隐式参数
 *
 * 闭包返回值 总是有返回值的
 */

def closure = { println "hello closure" }
closure.call() //第一种调用方法
closure()//第二种调用方法
//参数
def closure1 = { param -> println "hello " + param }
closure1("good game")
def closure11 = { param1 = 1, param2 = 2 ->
    println param1 + "," + param2
}
closure11(2, 1)
closure11()//不传，使用默认实参
//隐式参数
def closure2 = { println "hello " + it }
closure2("param")
//返回值
def closure3 = {
    return it;
}
println closure3("hello return")
println closure2("param") //默认返回null