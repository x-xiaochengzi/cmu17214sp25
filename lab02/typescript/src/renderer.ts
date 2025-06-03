// import { newRectangle, Rectangle } from "./shapes/rectangle.js";

// function newRenderer(rectangle: Rectangle) {
//     return {
//         draw() {
//             const area: number = rectangle.computeArea()
//             console.log("Shape drawn\n" + "Its area is " + area)
//         }
//     }
// }

// export { newRenderer }

export function newRenderer(shape: Shape) {
    return {
        draw: function () {
            const area: number = shape.computeArea();
            console.log("Shape drawn\n" + "Its area is " + area);
        }
    }
}