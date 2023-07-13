package com.revature

static int product(int x = 3, int y) {// don't need datatypes but obvi recommended
    x * y // last statement returned by default (like Ruby!)
}

println product( 4)

void varArgs(...args) {
    args.each {println it}
}

// if you want to use named params like in python
void display(Map productDetails) {
    println productDetails.name
    println productDetails.price
}
varArgs('hello', 'does', 'this', 'work')
display(price: 1000.00, name: 'some product')
display price: 1000.00, name: 'some product' // don't even need brackets or parentheses
