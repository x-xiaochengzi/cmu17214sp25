// function circle(radius: number): Shape {
//     return {
//         radius,
//         computeArea: function (): number {
//             return Math.PI * radius * radius
//         }
//     }
// }

// export { circle }

export function newCircle(radius: number): Shape {
    return {
        computeArea: function () {
            return Math.PI * radius * radius;
        }
    }
}
