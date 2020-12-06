//This code was written by Raihan Iqbal Pasya

var nilai = {
    bilangan: function (num1, num2, num3, num4, num5) {
var hasilMax = Math.max.apply(null, arguments);
var hasilMin = Math.min.apply(null, arguments);

    console.log(this.kalimat + num1 + ", " + num2 + ", " + 
        num3 + ", " + num4 + ", " + num5 + 
        "\n" + this.kalimatMax + hasilMax +
        "\n" + this.kalimatMin + hasilMin);   
    }
};

var keterangan = {
    kalimat: "Nilai : ",
    kalimatMax: "Nilai maksimum : ",
    kalimatMin: "Nilai minimum : "
};

// menggunakan apply
nilai.bilangan.apply(keterangan, [5,6,2,3,7]);