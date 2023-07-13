package com.revature

class Patient {
    def firstName, lastName, age
}

p = new Patient(firstName: 'joe', lastName: 'shmoe', age: 55)
println p.firstName + " " + p.lastName + " " + p.age // groovy internally creates getters and setters and uses them internaly - so these are private

