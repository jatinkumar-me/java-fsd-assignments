function printMultiplicationTable(number: number, upto: number): void {
    for (let i = 1; i <= upto; i++) {
        console.log(`${number} x ${i} = ${number*i}`);
    }
}

printMultiplicationTable(5, 10);
