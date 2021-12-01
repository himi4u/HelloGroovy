package grammar.variable
//groovy 没有基本类型的概念
int x = 10 //强定义类型
println(x.class) //class java.lang.Integer 输出包装类型
//弱定义类型
def a = 10
def b = 0.1
def c = "hello"
println a.class
println b.class
println(c.class)
c = 1
println(c.class)
/**
 * 何时使用强定义类型，何时使用弱定义类型
 *
 * 变量不会与其它模块交互，自己使用，def定义
 * 如果用于其它模块或类，使用强定义类型，保证外界传值的时候是正确的。
 */

