package grammar.logic
/**
 * 循序逻辑
 *
 * 条件逻辑  if/else
 *          switch/case
 *
 * 循环逻辑  while循环
 *          for循环
 */
//groovy任何类型都可以用于switch-case
//case中可以写任意类型的对象，可以与if-else互换
//switch-case 比较易读。if-else 维护相对困难
def x = 1.1
def result
switch (x) {
    case "groovy":
        result = "hello groovy"
        break
    case [1, 2, 3, 'groovy']://列表
        result = "hello list"
        break
    case 1..10:
        result = "hello range"//范围
        break
    case Integer:
        result = "hello integer"
        break
    case BigDecimal:
        result = "hello bigDecimal"
        break
    default: result = "hello default"
}
println result

//相当与instanceof
switch (x.class) {
    case Integer:
        result = "hello integer"
        break
    case BigDecimal:
        result = "hello bigDecimal"
        break
    default: result = "hello default"
}
println result

// for循环
// 范围循环
def sum = 0
for (i in 0..9) {
    sum += i
}
println sum
//list循环
sum = 0;
for (i in [0, 1, 2, 3]) {
    sum += i
}
println sum
sum = 0
//循环map ,不需要迭代器
for (i in ["1": 1, "2": 2, "3": 3]) {
    sum += i.value
}
println sum