package com.revature

def a = 10.2f
int myInt = 5


println a
println a.class

println myInt
println myInt.class

s = 'hello ${a}'
println s
name = 'peter'
s = "hello ${name}"
println s

s = '''
This is only possible
since java 12
It's a multi-line string
still need double quotes for ${this} to work.
'''

println s

s = """
Can we input a ${name} here? 
Yes we can. 
That's why we needed double quotes.
"""
println s

// regular expressions
emailPattern = /[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+/ // this is currently just a string
println emailPattern.class
// to validate use the 'pattern operator' '==~'
println "test@gmail.com" ==~ emailPattern // will print the boolean eval -> true in this case
println "anothertest" ==~ emailPattern // false
