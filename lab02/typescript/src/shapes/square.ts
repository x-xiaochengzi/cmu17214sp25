// function square(sideLen: number): Shape {
//     return {
//         sideLen,
//         computeArea: function (): number {
//             return sideLen * sideLen
//         }
//     }
// }

// export { square }

export function newSquare(sideLen: number): Shape {
    return {
        computeArea: function () {
            return sideLen * sideLen;
        }
    }
}