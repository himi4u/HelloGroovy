package grammar.string

import javax.xml.crypto.Data

def name = 'hello'//单引号定义的字符串没有格式
println(name.class)

//三引号定义的字符串包含格式
def tName = '''three single
string'''
println(tName)
def tName1 = '''\
第一行
第二行'''
println(tName1)

//三引号字符串的内容是不能动态改变的，双引号是可扩展字符串
def doubleName = "this is a common String"
def sayHello = "你好：${doubleName}" //使用扩展表达式，使字符串变为GString类型
def test = '你好：${doubleName}' //不可以使用扩展表达式
println doubleName.class // java.lang.String
println sayHello
println sayHello.class //class org.codehaus.groovy.runtime.GStringImpl

def sum = "test${2 + 3}"//扩展表达式内可以使用任意表达式
println sum

def result = echo(sum)
// GString类型的数据可以作为实参，直接传入形参类型String类型的方法中，变成String类型 而不需要强转,可以自动相互转换
String echo(String param) {
    return param
}

println result + ',' + result.class;
//String类型的数据可以作为实参，直接传入形参类型GString类型的方法中
//echo1(doubleName as GString)//Cannot cast object 'this is a common String' with class 'java.lang.String' to class 'groovy.lang.GString'
//void echo1(GString param){
//    println param
//}
println "---------------------------------------"
/**
 * 以下使字符串的方法
 */
//字符串填充
def groovy = "groovy"
println groovy.center(8, 'a')
println groovy.center(8)

println groovy.padLeft(8, 'a')
println groovy.padLeft(8)
//字符串比较
def groovy2 = "groovy1"
//使用方法
// 如果参数字符串等于此字符串，则返回值 0；
//如果此字符串小于字符串参数，则返回一个小于 0 的值；
//如果此字符串大于字符串参数，则返回一个大于 0 的值
def to = groovy2.compareTo(groovy)
println to
//使用操作符
def b = groovy2 > groovy
println b

def to1 = groovy2 <=> groovy //等价于compareTo
println to1

//以下两者等价
def at = groovy.getAt(0)
def s = groovy[0]
println at
println s
//传入范围
def s1 = groovy[0..1]
println s1