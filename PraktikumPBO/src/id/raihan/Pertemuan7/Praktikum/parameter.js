//This code was written by Raihan Iqbal Pasya

// membuat fungsi dengan 1 parameter
function reflect(value) {
    return value;
}

// menampilkan fungsi
console.log(reflect("Halo"));
console.log(reflect("Hari ini hari ke ",2));
console.log("Panjang argument : ", reflect.length);

// meredefinisi fungsi reflect
reflect = function() {
    return arguments[1];
};

// menampilkan fungsi
console.log(reflect("Halo"));
console.log(reflect("Hari ini hari ke ",2));
console.log("Panjang argument : ", reflect.length);