function printMultiplicationTable(number, upto) {
    for (var i = 1; i <= upto; i++) {
        console.log("".concat(number, " x ").concat(i, " = ").concat(number * i));
    }
}
printMultiplicationTable(5, 10);
