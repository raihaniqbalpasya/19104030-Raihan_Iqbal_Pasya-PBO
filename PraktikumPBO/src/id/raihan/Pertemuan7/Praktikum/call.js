//This code was written by Raihan Iqbal Pasya

// membuat method person
var person = {
    fullName: function(firstName, lastName) {
        return this.firstName + " " + this.lastName;
    }
}

var person1 = {
    firstName: "Raihan",
    lastName : "Iqbal"
}

var person2 = {
    firstName : "Pasya",
    lastName : "Hasibuan"
}

console.log("Menggunakan method call untuk menampilkan objek person 2 : "

// memanggil method menggunakan method call()
+ person.fullName.call(person2))