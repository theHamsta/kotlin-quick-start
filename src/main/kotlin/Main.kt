import ij.ImageJ

data class Foo(var a: String, var b: Int)

fun main(args: Array<String>) {
	println("Hello world")
	var f = Foo("hallo", 3)
	var number  = f.b 

	println(f)
	println(number)

	ImageJ()
}
