package com.revature

l = [1, 2, 3] // by default is ArrayList

println l
println l.class

l << 4

println l

l.each { println it}

s = ['java', 'groovy', 'ruby', 'js', 'js'] as Set // uses LinkedHashSet as default
println s
println s.class

m = [courseName: 'Gradle', rating: 5, price: 20.00] // key : value
println m
println m.class

m.each {k,v -> println k println v}

println m.courseName
println m['courseName']
println m.get('courseName')