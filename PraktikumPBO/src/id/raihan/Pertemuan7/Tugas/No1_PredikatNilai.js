//This code was written by Raihan Iqbal Pasya

// membuat fungsi dengan deklarasi
function predikat (nilai) {
    if (nilai >= 85 && nilai <= 100 ) {
        return "'A'";
    }
    else if (nilai >= 75 && nilai <= 84) {
        return "'B'";
    }
    else if (nilai >= 65 && nilai <= 75) {
        return "'BC'";
    }
    else if (nilai >= 55 && nilai <= 64) {
        return "'C'";
    }
    else if (nilai >= 45 && nilai <= 54) {
        return "'D'";
    }
    else if (nilai >= 0 && nilai <= 44) {
        return "'E'";
    }
    else {
        return "'Inputan Error'"
    }
}

// membuat fungsi dengan deklarasi
function printdata (nama, nilai) {
    console.log("Masukkan nama : > ", nama);
    console.log("Masukkan nilai : > ", nilai);
    console.log(nama + " , kamu mendapat predikat " + predikat(nilai));
}

printdata("Raihan Iqbal Pasya", 89);