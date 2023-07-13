package com.revature

// simply use open and close brackets

closure = {
    println "Closures are super simple"
}

// invoke it
closure.call()

// can also pass variables
// and set their default to allow no args passed when called
evenOrOdd = {
    n=5 -> println((n % 2 == 0) ? "even" : "odd")
}

evenOrOdd.call(4)
evenOrOdd.call()


4.times {n -> print n}
10.times { print it}