//This code was written by Raihan Iqbal Pasya

var person = {
    fullName: function(birth, city) {
        return this.firstName + " " + this.lastName +
        "," + birth + "," + city;
    }
};

var person1 = {
    firstName: "Raihan",
    lastName: "Iqbal"
};

// menggunakan apply
console.log(person.fullName.apply(person1, ["April", "Lubuk Pakam"]));

// jika menggunakan call
// person.fullName.call(person1, Desember, "Cilacap");